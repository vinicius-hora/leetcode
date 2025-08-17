package goAtividades

/*
https://leetcode.com/problems/palindrome-number/description/
1 converter int para string
2 salvar uma nova string com a posição de trás para frente
3 - fazer um novo for em qualquer uma das posições comparando e retornar false se for diferente
*/

import (
	"strconv"
)

func IsPalindrome(x int) bool {
	texto := strconv.Itoa(x)
	var textoInvertido string

	for _, caracter := range texto {

		textoInvertido = string(caracter) + textoInvertido
	}

	for i := 0; i < len(texto); i++ {
		if texto[i] != textoInvertido[i] {
			return false
		}
	}

	return true
}
