package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	

	Scanner ler = new Scanner(System.in);
	
	int[] Numeros= {1,2,3,4,5,6,7,8,9,10};
	
	float media[] = new float[10];
	
	
	 for(int i=0;  i<10; i++ ){
		 
		System.out.println("Digite um valor para a posição"+i+"="+media[i]);
		media[i]=ler.nextFloat();
	    }
		


	}
	

}