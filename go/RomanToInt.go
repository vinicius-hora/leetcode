package main

import "fmt"

/*
https://leetcode.com/problems/roman-to-integer/
*/
func main() {
	fmt.Println(romanToInt("MCMXCIV"))
}

func romanToInt(s string) int {
	romanos := make(map[string]int)
	romanos["I"] = 1
	romanos["V"] = 5
	romanos["X"] = 10
	romanos["L"] = 50
	romanos["C"] = 100
	romanos["D"] = 500
	romanos["M"] = 1000

	soma := 0
	i := 0

	for i < len(s) {

		if i+1 < len(s) && romanos[string(s[i])] < romanos[string(s[i+1])] {
			soma += romanos[string(s[i+1])] - romanos[string(s[i])]
			i += 2
		} else {
			soma += romanos[string(s[i])]
			i++
		}
	}

	return soma
}
