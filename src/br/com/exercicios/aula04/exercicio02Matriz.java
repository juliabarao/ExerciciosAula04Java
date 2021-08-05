package br.com.exercicios.aula04;

import java.util.Scanner;

public class exercicio02Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] bloco = new int[3][3];
		int somaD = 0, soma = 0;
			

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 3; c++){
				System.out.println("Digite um valor para coluna " + (c+1) + " e linha "  + (l+1) + ": ");
				bloco[l][c] = ler.nextInt();
				soma = soma + bloco[l][c];
				if(l == c) {
					somaD = somaD + bloco[l][c];
				}
			}
		}
		somaD = bloco[0][0] + bloco[1][1] + bloco [2][2];
		System.out.println("A soma da matriz: " + soma);
		System.out.println("A soma da diagonal é: " + somaD);
		ler.close();
	}

}
