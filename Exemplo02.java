package SwitchCase;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo02 {

	public static void main(String[] args) {
		String[] disciplinas = {"MATEMÁTICA", "FILOSOFIA", "HISTÓRIA", "FÍSICA"};
		ArrayList<String> novaLista = new ArrayList <String>(Arrays.asList(disciplinas));
		novaLista.add("GEOGRAFIA");
		novaLista.add("LINGUA INGLESA");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplina: " + i);
		}
	}

}
