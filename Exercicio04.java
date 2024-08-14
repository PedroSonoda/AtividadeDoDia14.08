package SwitchCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String [] abecedario = {"a","b", "c", "d", "e", "f","g", "h", "i", "j", "k", "l", "m" , "n" , "o", "p" , "q", "r", "s" , "t", "u", "v", "w", "x", "y", "z"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(abecedario));
		ArrayList<Integer> dicas = new ArrayList<Integer>();
		ArrayList<String> palavraCrip = new ArrayList<String>();
		ArrayList<String> palavraTeste = new ArrayList<String>();
		String palavra;
		int dica, j=0;
		System.out.println("Digite a palavra que será cifrado(utilize letras minusculas)?");
		System.out.println("Digite o número 0 quando terminar0");

		do{
			System.out.print("");
			palavra = ler.nextLine();
			palavraTeste.add(palavra);
		}while (palavra.equals("0")== false );
		System.out.println("Qual é a dica da Cifra(numeros)?");
		dica = ler.nextInt();
		for(int i=0; i<26; i++) {
			for (String p: palavraTeste)
				if (p.equals(novaLista.get(i))) {
					dicas.add(i+dica);
				}
		}
		for (int d : dicas) {
			palavraCrip.add(abecedario[d]);
		}
		System.out.print("A frase cifrada ficou assim: ");
		for (String p : palavraCrip) {
			System.out.print(p);
		}
		ler.close();

	}
}