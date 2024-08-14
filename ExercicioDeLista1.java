package SwitchCase;

import java.util.ArrayList;

import java.util.Scanner;

public class ExercicioDeLista1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> num = new ArrayList <Integer>();

		int soma = 0;

		for(int i=0; i<5; i++ ) {
			System.out.println("Qual número deseja adicionar a lista?");
			int n = ler.nextInt();
			num.add(n);
		}
		for (int pe : num){
			soma += pe;
		}

		System.out.println( " A soma dos números:" + num + "\né igual a: " + soma);
	}
}