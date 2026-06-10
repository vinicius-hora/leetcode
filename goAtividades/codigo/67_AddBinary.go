package goAtividades

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.

https://leetcode.com/problems/add-binary/description/
*/
func AddBinary(a string, b string) string {
	i := len(a) - 1
	j := len(b) - 1
	carry := 0

	resultado := ""

	for i >= 0 || j >= 0 || carry > 0 {
		soma := carry

		if i >= 0 {
			soma += int(a[i] - '0')
			i--
		}

		if j >= 0 {
			soma += int(b[j] - '0')
			j--
		}

		bit := soma % 2
		carry = soma / 2

		resultado += string(byte(bit + '0'))
	}

	return inverter(resultado)
}

func inverter(s string) string {
	runes := []rune(s)

	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}

	return string(runes)
}
