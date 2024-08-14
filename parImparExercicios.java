package SwitchCase;

import java.util.ArrayList;
import java.util.Scanner;

public class parImparExercicios {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> num = new ArrayList <Integer>();

		int valor= 0, numpar=0;
		for(int i= 1; i<=5; i++) {
			System.out.println(" Informe um número de valor inteiro: ");
			valor = ler.nextInt();
			num.add(valor);
			if(valor % 2 ==0) {
				numpar++;
			}
		}

		System.out.println("A quantidade de números pares é :" +numpar);
	}

}
