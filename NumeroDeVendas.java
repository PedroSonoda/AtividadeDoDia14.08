package SwitchCase;

import java.util.Scanner;

public class NumeroDeVendas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int car= 0;
		
		System.out.print("Quantos carros você vendeu na semana 1?");
		car+=ler.nextInt();
		
		System.out.print("Quantos carros você vendeu na semana 2?");
		car+=ler.nextInt();
		
		System.out.print("Quantos carros você vendeu na semana 3?");
		car+=ler.nextInt();
		
		System.out.print("Quantos carros você vendeu na semana 4?");
		car+=ler.nextInt();
		
	switch (car) {
		
		case 1: System.out.println("Sem bônus");
			break;
			
		case 2: System.out.println("Sem bônus");
		break;
			
		case 3: System.out.println("Sem bônus");
		break;
		
		case 4: System.out.println("Sem bônus");
		break;
		
		case 5: System.out.println("Sem bônus");
		break;
		
		case 6: System.out.println("Sem bônus");
		break;
		
		case 7: System.out.println("Sem bônus");
		break;
		
		case 8: System.out.println("Sem bônus");
		break;
		
		case 9: System.out.println("Sem bônus");
		break;
		
		case 10: System.out.println("Bônus de R$100.00");
		break;
		
		case 11: System.out.println("Bônus de R$100.00");
		break;
		
		case 12: System.out.println("Bônus de R$100.00");
		break;
		
		case 13: System.out.println("Bônus de R$100.00");
		break;
		
		case 14: System.out.println("Bônus de R$100.00");
		break;
		
		case 15: System.out.println("Bônus de R$300.00");
		break;
		
		case 16: System.out.println("Bônus de R$300.00");
		break;
		
		case 17: System.out.println("Bônus de R$300.00");
		break;
		
		case 18: System.out.println("Bônus de R$300.00");
		break;
		
		case 19: System.out.println("Bônus de R$300.00");
		break;
		
		case 20: System.out.println("Bônus de R$300.00");
		break;

		default:
			System.out.println("Bônus de R$500.00");
		}
		ler.close();

}
}