package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo05 {

	Scanner scan = new Scanner(System.in);

	public void resultado() {
		
		System.out.println("Ler um número inteiro e imprimi-lo.");
		System.out.print("Digite um numero: ");
		int numero = scan.nextInt();
		System.out.println("\nResultado: ");
		System.out.println(numero);
	}
}