/*
https://leetcode.com/problems/length-of-last-word/description/
*/

package goAtividades

import "strings"

func LengthOfLastWord(s string) int {
	contador := 0
	removerEspadoInicioFim := strings.TrimSpace(s)
	tamanho := len(removerEspadoInicioFim) - 1

	for i := tamanho; i >= 0; i-- {
		if removerEspadoInicioFim[i] == ' ' {
			return contador

		}
		contador++
	}
	return contador
}
