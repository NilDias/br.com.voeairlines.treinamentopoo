package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo08 {

	Scanner scan = new Scanner(System.in);

	public void resultado() {
		
		System.out.println("Criar um algoritimo que leia nome, endereço, telefone e mostre posteriormente.");
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite seu endereço: ");
		String endereco = scan.nextLine();
		System.out.print("Digite seu telefone: ");
		String telefone = scan.nextLine();
		System.out.println("\nResultado: ");
		System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
	}
}
