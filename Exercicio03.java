package ternario;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anos;
		
		System.out.println("Quantos anos de empresa você tem?");
		anos = ler.nextInt();
		
		System.out.println(anos <= 3 ? "Seu bônus é de 5%" : "Seu bônus é de 7%");
		ler.close();

	}

}
