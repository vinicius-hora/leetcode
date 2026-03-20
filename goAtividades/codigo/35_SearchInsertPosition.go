package goAtividades

//

func SearchInsert(nums []int, target int) int {
	valorEncontrado := false
	indiceEncontrado := 0

	for i, num := range nums {
		if num >= target {
			valorEncontrado = true
			indiceEncontrado = i
			break
		}
	}

	if valorEncontrado {
		return indiceEncontrado
	}

	return len(nums)

}
