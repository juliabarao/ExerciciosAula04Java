package br.com.exercicios.aula04;

import java.util.Scanner;

public class exercicio01Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] pontos = new int[5];
		int maior = 0;

		System.out.println("Digite os Pontos: ");
				
		for(int l = 0; l < 5; l++){
			pontos[l] = ler.nextInt();
			if(pontos[l] > maior){
			maior = pontos[l];
			}
		}
		System.out.println("O maior ponto é: " + maior);
		ler.close();
	}

}
