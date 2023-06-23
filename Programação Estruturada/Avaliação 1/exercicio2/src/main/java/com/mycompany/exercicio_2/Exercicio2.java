/* Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa 
que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular 
e mostrar quantos salários mínimos ela ganha. */

package com.mycompany.exercicio_2;

import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		double salarioMinimo, salario, quanSalaMini;
		
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.print("Informe o salario minimo: ");
		
		salarioMinimo = leitura.nextDouble();
		
		System.out.print("Informe o salario proprio: ");
		
		salario = leitura.nextDouble();
		
		quanSalaMini = salario / salarioMinimo;
		
		
		System.out.printf("\nA quantidade ganha de salarios minimos e: %.0f", quanSalaMini);
		
	}
}
