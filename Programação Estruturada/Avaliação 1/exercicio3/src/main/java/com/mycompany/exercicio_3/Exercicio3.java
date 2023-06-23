/*Faça um programa que leia dois valores e informe a média entre eles. (use float 
como tipo de dado). */

package com.mycompany.exercicio_3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float val_1, val_2, media;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		
		val_1 = leitura.nextFloat();
		
		System.out.print("Informe o segundo valor: ");
		
		val_2 = leitura.nextFloat();
			
		media = (val_1 + val_2) / 2;
		
	
		System.out.printf("\nA media entre os valores informados e: %.2f", media);
	
	}
}
