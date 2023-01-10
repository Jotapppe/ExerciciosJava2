package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
	       
int n, s= 0;
String resp;
Scanner leia = new Scanner (System.in);
/**VARIAVEL**/

	do {
		System.out.print("Digite um numero: ");
		n = leia.nextInt();
		s += n;
		System.out.print("Voce quer continuar? [S/N] ");
		resp = leia.next();
	} while (resp.equals("s"));
	System.out.print("A soma dos valores é:" +s);
	
/**LAÇO**/
	
	        	
	}

}
