/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
fórmula: VOLUME = 3.14159 * R2 * ALTURA */

package com.mycompany.exercicio_5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float raio, altura;
		double volume;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.print("Informe o raio: ");
		
		raio = leitura.nextFloat();
		
		System.out.print("Informe a altura: ");
		
		altura = leitura.nextFloat();
		
		
		volume = 3.14159 * (Math.pow(raio, 2)) * altura;
		
		System.out.printf("\nO volume da lata de oleo e: %.2f", volume);

	}
}
