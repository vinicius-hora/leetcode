package java;
/*
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

public class FindIndexFirstOccurrenceString {

    public static void main(String[] args) {

        // String haystack = "sadbutsad";
        // String needle = "sad";
        // String haystack = "aaaaa";
        // String needle = "bba";
        // String haystack = "hello";
        // String needle = "ll";
        /// String haystack = "leetcode";
        // String needle = "leeto";
        // String haystack = "mississippi";
        // String needle = "pi";
        // String haystack = "mississippi";
        // String needle = "issip";
        // String haystack = "bbaa";
        // String needle = "aab";
        String haystack = "aabaaabaaac";
        String needle = "aabaaac";

        
        FindIndexFirstOccurrenceString fString = new FindIndexFirstOccurrenceString();
        System.out.println(fString.strStr(haystack, needle));
        
    }

    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int acertos = 0;
        int posicao = 0;
        char cHayscak;
        char cNeedle;

        if(needle.length() > haystack.length()){
            return -1;
        }
        
        for(i = 0; i < haystack.length(); i ++){
            cHayscak = haystack.charAt(i);
            cNeedle = needle.charAt(j);
            if(cHayscak != cNeedle){
                
                if(acertos > 0 ){
                    i = posicao;
                }

                acertos = 0;
                j = 0;
        
            }
            else{
                
                acertos++;
                j++;

                if(acertos == 1){
                    posicao = i;
                 }
               
            }
            if(j == needle.length()){
                return posicao;
            }
            
        }

        if(acertos == 0){
            return -1;
        }
        if(acertos < needle.length()){
            return -1;
        }


        return posicao;
        
    }
    
}
