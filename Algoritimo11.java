package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo11 {

	Scanner sc = new Scanner(System.in);

	public void resultado() {

		System.out.print("Digite um número: ");
		double num1 = sc.nextDouble();
		double resultado = num1 / 3;
		System.out.println("\nResultado: ");
		System.out.println(resultado);

		sc.close();
	}
}
