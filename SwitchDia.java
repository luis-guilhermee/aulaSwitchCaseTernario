package ternario;

import java.util.Scanner;

public class SwitchDia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;

		System.out.println("Informe o número do dia da semana: ");
		dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("O dia é: Domingo");
			break;
		case 2:
			System.out.println("O dia é: Segunda-feira");
			break;
		case 3:
			System.out.println("O dia é: Terça-feira");
			break;
		case 4:
			System.out.println("O dia é: Quarta-feira");
			break;
		case 5:
			System.out.println("O dia é: Quinta-feira");
			break;
		case 6:
			System.out.println("O dia é: Sexta-feira");
			break;
		case 7:
			System.out.println("O dia é: Sábado");
			break;
		default:
			System.out.println("Dia inválido!");
		}
		ler.close();

	}

}