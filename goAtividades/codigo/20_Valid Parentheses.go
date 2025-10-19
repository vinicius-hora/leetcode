package goAtividades
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
*/

func IsValid(s string) bool {
	chaves :=  []rune{'(', ')', '{', '}', '[', ']'}
	
	pilha := []rune{}
	
	for _, char := range s {
		if char == chaves[0] || char == chaves[2] || char == chaves[4] {
			pilha = append(pilha, char)
		} else {
			if len(pilha) == 0 {
				return false
			}
			if char == chaves[1] && pilha[len(pilha)-1] == chaves[0] {
				pilha = pilha[:len(pilha)-1]
			} else if char == chaves[3] && pilha[len(pilha)-1] == chaves[2] {
				pilha = pilha[:len(pilha)-1]
			} else if char == chaves[5] && pilha[len(pilha)-1] == chaves[4] {
				pilha = pilha[:len(pilha)-1]
			} else {
				return false
			}
		}
	}
	
	return len(pilha) == 0


}