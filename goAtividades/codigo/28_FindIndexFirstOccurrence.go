package goAtividades

func StrStr(haystack string, needle string) int {

	if len(needle) > len(haystack) {
		return -1
	}

	// percorre cada posição possível dentro de haystack
	for i := 0; i <= len(haystack)-len(needle); i++ {
		// compara o pedaço de haystack com needle
		if haystack[i:i+len(needle)] == needle {
			return i
		}
	}

	// se não encontrou nenhuma ocorrência
	return -1

}
