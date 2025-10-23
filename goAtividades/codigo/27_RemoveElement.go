package goAtividades

/*
https://leetcode.com/problems/remove-element/description/
*/

func removeElement(nums []int, val int) int {
	contadorPosicao := 0
	for i := 0; i < len(nums); i++ {
		verificaIgualdade := false
		if nums[i] == val {
			verificaIgualdade = true
		}

		if !verificaIgualdade {
			nums[contadorPosicao] = nums[i]
			contadorPosicao++
		}
	}

	return contadorPosicao

}
