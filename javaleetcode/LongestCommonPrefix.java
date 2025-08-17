package javaleetcode;
/*
https://leetcode.com/problems/longest-common-prefix/description/
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */


public class LongestCommonPrefix {

    public static void main(String[] args) {
        // "flower","flow","flight"
        // flower","flower","flower","flower
        // "dog","racecar","car"
        //"abab","aba",""

        //"ab", "a"
        
        String[] strs = {"abab","aba",""};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
       
        String palavraAtual = "";
        StringBuilder stringsComparadas = new StringBuilder(); 
        String proximaLetra;
        int contadorAtual = 0;
        int i = 0;

        palavraAtual = strs[0];

        if(strs.length == 1){
            return palavraAtual;
        }
        
        while(i < palavraAtual.length()){
            for(int pc = 1; pc < strs.length; pc ++){
                if(strs[pc].isEmpty()){
                    break;
                }

                proximaLetra = String.valueOf(strs[pc].charAt(0));
                if(palavraAtual.startsWith(proximaLetra)){
                    contadorAtual ++;
                    strs[pc] = strs[pc].substring(1);
                }
            }

            if(contadorAtual == strs.length - 1){
                stringsComparadas.append(palavraAtual.charAt(0));
                palavraAtual = palavraAtual.substring(1);
            }
            else{
                break;
            }
            contadorAtual = 0;      
        }
     
        return stringsComparadas.toString();
    }
}
