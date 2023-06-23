/*Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas 
vendas oferecendo desconto. Faça um programa que possa entrar com o nome 
de um produto e seu valor unitário e calcular e exibir um novo valor com um 
desconto de 9%.*/ 

package com.mycompany.exercicio_1;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		String nomeProduto;
		double valorProduto, valorFinal;
		
		Scanner leitura = new Scanner(System.in); 
		
		System.out.print("Digite o nome do produto: ");
		
		nomeProduto = leitura.next();
		
		System.out.print("Digite valor unitario do produto: ");
		
		valorProduto = leitura.nextDouble();
		
		valorFinal = valorProduto - (valorProduto * 0.09);
		
		System.out.printf("\nO valor do produto '%s' apos o desconto de 9 por cento e de: %.2f", nomeProduto, valorFinal);
		
	}
}
