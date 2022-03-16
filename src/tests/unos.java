package tests;

import java.util.Scanner;

public class unos {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n, r, d;
			
			StringBuilder s = new StringBuilder();
			while(sc.hasNext()) {
				
				n = sc.nextInt();
				d=1; r = 0;
				boolean found = false;
				while(!found) {
					
					if(d % n == 0) found = true;
					else {
						d = d % n * 10 + 1;
					}
					r++;
				}
				s.append(r+"\n");
			}
			System.out.print(s);
	}
}
