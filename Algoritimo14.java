package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo14 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		
		System.out.println("Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo, considerando o reajuste de 1%");
		System.out.print("Digite o valor que deseja aplicar: ");
		double saldo = scan.nextDouble();
		double novoSaldo = saldo + (saldo * 0.01);
		System.out.println("\nResultado: ");
		System.out.println("O valor do saldo atualizado é: " + novoSaldo);
	}
}

