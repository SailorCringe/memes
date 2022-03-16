package tests;

import java.util.Scanner;

public class ciclistes122 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt() , n2=0;
		short count=0, idx, km=0, bigIdx=0;
		
		while(n != -1) {
			
			count = 0; idx = 0;
			
			while(n2 != -1) {
			n2 = sc.nextInt();
			if(n == n2) {
				
				count++;
			}
			else {
				km = count;
				count = 0;
				bigIdx = idx;
			}
			idx++;
			n = n2;
			}
			
		if(km < 1) System.out.println("HOY NO COMEN");
		else System.out.println(bigIdx+" "+km);
		n = sc.nextInt();
	
	}
	
	}
}
