package main

import "fmt"

func main() {
	lista := []int{10, 20, 30, 40, 50}

	for i := 0; i < len(lista); i++ {
		fmt.Println(lista[i])
	}
}
