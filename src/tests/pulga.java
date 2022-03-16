package tests;

import java.util.Scanner;

public class pulga {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		byte potencia, multiplicador;
		int time, nTest = sc.nextInt();
		
		for(int i = 0; i < nTest; i++) {
			
			potencia = sc.nextByte(); multiplicador = sc.nextByte();
			time = sc.nextInt();
			
			if(potencia < time) {
				result.append((time % (potencia+1)) * multiplicador);
				result.append("\n");
			}else {
				result.append(time*multiplicador);
				result.append("\n");
			}
			
		}
		System.out.print(result);
	}
}