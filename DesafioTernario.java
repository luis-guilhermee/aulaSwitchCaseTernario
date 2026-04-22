package ternario;

import java.util.Scanner;

public class DesafioTernario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano;

		System.out.println("Informe o ano:");
		ano = ler.nextInt();

		System.out.println(ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0 ? "O ano é bissexto" : "O ano não é bissexto");

		ler.close();

	}

}