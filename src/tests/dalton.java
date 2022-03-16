package tests;

import java.util.Scanner;

public class dalton {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		long n = sc.nextLong();
		
		while(n != 0) {
			
			boolean found = false;
			long count = 0;
			long i = sc.nextLong(); 
			long nextI = sc.nextLong();
			if(i > nextI) {  
				while(!found && count < n-2) {
					i = nextI;
					nextI = sc.nextLong();
					if(i <= nextI) found = true;
					
					count++;
				}
			}
			else if(i < nextI) {
				while(!found && count < n-2) {
					i = nextI;
					nextI = sc.nextLong();
					if(i >= nextI) found = true;
					
					count++;
				}	
			}
			else found = true;
			if(found) {s.append("DESCONOCIDOS\n"); sc.nextLine();}
			else s.append("DALTON\n");
			n = sc.nextLong();
		}
		System.out.print(s);
		sc.close();
	}
}