package SwitchCase;

import java.util.ArrayList;
import java.util.Scanner;

public class numerosPositivos {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> num = new ArrayList <Integer>();

		int nume=0;
		for(int i=1; i<=5; i++) {
			System.out.println("Informe um valor inteiro:");
			nume = ler.nextInt();
			num.add(nume);

			if (nume>= 0){
			}else {
			}
		}
		System.out.println(" Os número positivos são: ");
		for(int y : num) {
			if(y>0) {
				System.out.println(y+";");
			}
		}

	}

}
