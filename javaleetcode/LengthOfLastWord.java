package javaleetcode;
/*
https://leetcode.com/problems/length-of-last-word/description/

 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World";
        // String s = "Today is a nice day";
        // String s = "   fly me   to   the moon  ";
        LengthOfLastWord lastWord = new LengthOfLastWord();

        System.out.println("Tamanho: " + lastWord.lengthOfLastWord(s));
        
    }
    public int lengthOfLastWord(String s) {

        int contadorEspaco = 0;
        int contadorCaracter = 0;
        int contadorCaracterTotal = 0;
        int i = 0;
        Character espaco = ' ';
        Character caracter;

        for(i = 0; i < s.length(); i++){
            caracter = s.charAt(i);
           
            if(caracter == espaco){
                contadorEspaco = 1;
            }
            
            if(caracter != espaco){
                contadorCaracter++;
                contadorEspaco = 0;
                
            }

            if(contadorEspaco == 1){
                contadorCaracter = 0;
            }
            if(contadorEspaco == 0){
                contadorCaracterTotal = contadorCaracter;
            }

        }

        return contadorCaracterTotal;
    }
    
}











