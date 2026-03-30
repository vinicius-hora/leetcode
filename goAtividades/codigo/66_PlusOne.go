package goAtividades

// solução que pensei
func PlusOne(digits []int) []int {

	numeroInteiro := 0
	var novoArray []int

	for _, d := range digits {
		numeroInteiro = numeroInteiro*10 + d
	}

	numeroInteiro++

	if numeroInteiro == 0 {
		return []int{0}
	}

	for numeroInteiro > 0 {
		d := numeroInteiro % 10
		novoArray = append(novoArray, d)
		numeroInteiro /= 10
	}

	for i, j := 0, len(novoArray)-1; i < j; i, j = i+1, j-1 {
		novoArray[i], novoArray[j] = novoArray[j], novoArray[i]
	}

	return novoArray
}

// solução recomendada
func PlusOneRecomendada(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i-- {
		if digits[i] < 9 {
			digits[i]++
			return digits
		}

		digits[i] = 0
	}

	result := make([]int, len(digits)+1)
	result[0] = 1
	return result
}
