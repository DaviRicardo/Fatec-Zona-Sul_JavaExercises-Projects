/*Faça um programa que leia uma temperatura em graus Centígrados e 
apresente-a convertida em graus Fahrenheit. 

A fórmula de conversão é: 
F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus 
Centígrados. */

package com.mycompany.exercicio_4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int temperaturaC;
		float temperaturaF; 
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe a tempetura em Celcius (C): ");
		
		temperaturaC = leitura.nextInt();
		
		temperaturaF = (9 * temperaturaC + 160) / 5;
		
		System.out.printf("\nA temperatura convertida em Fahrenheit e: %.1f", temperaturaF, "F");
		
	}
}
