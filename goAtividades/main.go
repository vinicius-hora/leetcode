package main

import (
	"fmt"
	goAtividades "leetcodego/codigo"
)

func main() {

	//fmt.Println(goAtividades.RomanToInt("MCMXCIV"))
	//
	//fmt.Println(goAtividades.IsValid("()[]{}"))

	nums := []int{1, 1, 2, 2, 3, 3, 4, 5}
	goAtividades.RemoveDuplicates(nums)
	fmt.Println(nums)
}
