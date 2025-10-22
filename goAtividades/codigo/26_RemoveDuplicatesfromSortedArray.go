package goAtividades

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
*/
func RemoveDuplicates(nums []int) int {
	semRepeticao := 0
	for i := 0; i < len(nums); i++ {
		duplicado := false
		for j := 0; j < semRepeticao; j++ {
			if nums[i] == nums[j] {
				duplicado = true
				break
			}
		}
		if !duplicado {

			nums[semRepeticao] = nums[i]
			semRepeticao++

		}

	}

	return semRepeticao
}
