package tests;

import java.util.Scanner;

public class romanos {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), r;
		double aux;
		
		while(n!=0) {
			r =0;
			while(n>0) {
				aux = Math.sqrt(n);	
				if(n%aux==0) {
					if(aux==1) r+=5;
					else r+= n+n*4;
				}
				n--;
			}

			System.out.println(r);
			n = sc.nextInt();
		}
	}		
}

