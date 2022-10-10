package br.com.voeairlines.treinamentopoo;
//import javax.swing.JOptionPane;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FAZER E ENTREGAR !! URGENTE.
		
		
		
		//OBRIGADO PROFESSOR .... ESTOU COM DIFICULDADES, MAS A CULPA NAO É SUA, TMJ JOVEM JOVEM!
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lista de Exercicios proposta pelo Prof. Romulo");
		System.out.print("Deseja iniciar a verificação dos Algoritmos da lista? 1 - SIM | 2 - NÃO: ");
		int iniciarLista = scan.nextInt();

		do {
		System.out.print("Professor escolha um número de 1 a 26 para executar os algoritmos ou 27 para visualizar as Questões de Conhecimento: ");
		int opcao = scan.nextInt();
		System.out.println();

		switch(opcao) {
		case 1:
			new Algoritimo01().resultado();		
			break;
		case 2:
			new Algoritimo02().resultado();
			break;
		case 3:
			new Algoritimo03().resultado();
			break;
		case 4:
			new Algoritimo04().resultado();
			break;
		case 5:
			new Algoritimo05().resultado();
			break;	
		case 6:
			new Algoritimo06().resultado();
			break;
		case 7:
			new Algoritimo07().resultado();
			break;
		case 8:
			new Algoritimo08().resultado();
			break;
		case 9:
			new Algoritimo09().resultado();
			break;	
		case 10:
			new Algoritimo10().resultado();
			break;
		case 11:
			new Algoritimo11().resultado();		
			break;
		case 12:
			new Algoritimo12().resultado();
			break;
		case 13:
			new Algoritimo13().resultado();
			break;
		case 14:
			new Algoritimo14().resultado();
			break;
		case 15:
			new Algoritimo15().resultado();
			break;	
		case 16:
			new Algoritimo16().resultado();
			break;
		case 17:
			new Algoritimo17().resultado();
			break;
		case 18:
			new Algoritimo18().resultado();
			break;
		case 19:
			new Algoritimo19().resultado();
			break;	
		case 20:
			new Algoritimo20().resultado();
			break;
		case 21:
			new Algoritimo21().resultado();
			break;
		case 22:
			new Algoritimo22().resultado();
			break;
		case 23:
			new Algoritimo23().resultado();
			break;
		case 24:
			new Algoritimo24().resultado();
			break;
		case 25:
			new Algoritimo25().resultado();
			break;
		case 26:
			new Algoritimo26().resultado();
			break;
		case 27:
			new Algoritimo27().resultado();
		break;
		default :
			System.out.println("Opção invalida!!!");
		}
		System.out.println("\n\nDeseja continuar a lista? 1 - SIM | 2 - NÃO: ");
		iniciarLista = scan.nextInt();
		}while(iniciarLista == 1);
		System.out.println("Programa encerrado!!!");	
		scan.close();
	}

}