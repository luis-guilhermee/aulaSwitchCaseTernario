package ternario;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano;

		System.out.println("Informe o ano:");
		ano = ler.nextInt();

		if (ano % 4 == 0 || ano % 400 == 0)
			if (ano % 100 != 0)
				System.out.println("O ano é bissexto");
			else
				System.out.println("O ano não é bissexto");
		else
			System.out.println("O ano não é bissexto");

		ler.close();

	}

}
