package javaleetcode;
/*
https://leetcode.com/problems/valid-parentheses/description/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 * 
*/

import java.util.LinkedHashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s =  "()";
        // String s = "([)]";
        // String s = "(}{)";
        // String s = "{[]}";
        // String s = "(}{)";
        // String s = "([}}])";
        // String s = "()[]{}";
        // String s = "[({])}";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        String entrada = "";
        String primeiraVerificacao = String.valueOf(s.charAt(0));
        String ultimaVerificacao = String.valueOf(s.charAt(s.length() - 1));
        int i = 0;
        Stack<String> pilha = new Stack<>();

        if(primeiraVerificacao.equals("]") || primeiraVerificacao.equals("}") || primeiraVerificacao.equals(")")){
            return false;
        }

        if(ultimaVerificacao.equals("[") || ultimaVerificacao.equals("{") || ultimaVerificacao.equals("(")){
            return false;
        }

        if (s.length() % 2 !=0){
            return false;
        }

        while(i < s.length()){
            entrada = String.valueOf(s.charAt(i));

            switch (entrada) {
                case "(":
                pilha.push(entrada);
                i++;
                break;

                case "{":
                pilha.push(entrada);
                i++;
                break;

                case "[":
                pilha.push(entrada);
                i++;
                break;
                default:
                if(pilha.isEmpty()){
                    return false;
                }else
                if(verify(pilha.peek(), i, s)){
                    pilha.pop();
                }
                else{
                    return false;
                }
                i++;
                break;
            }
        }
        return pilha.isEmpty();

        
        
    }

    private static boolean verify(String entrada, int contador, String s){
        String verificacao = String.valueOf(s.charAt(contador));

        if(entrada.equals("(") &&  verificacao.equals(")")){
            return true;
        }else
        if(entrada.equals("[") &&  verificacao.equals("]")){
            return true;
        }else
        if(entrada.equals("{") &&  verificacao.equals("}")){
            return true;
        }
        else{
            return false;
        }

    }
    
}