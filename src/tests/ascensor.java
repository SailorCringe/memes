package tests;

import java.util.Scanner;

public class ascensor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int nViajes = sc.nextInt();
		int aux, last, result;
		
		while(nViajes != -1) {
			aux = sc.nextInt();
			last = nViajes;
			result = 0;
			while(aux != -1) {
				
				result += Math.abs(last - aux);
				last = aux;
				aux = sc.nextInt();
			}
			System.out.println(result);
			nViajes = sc.nextInt();
			
		}
	}
}
