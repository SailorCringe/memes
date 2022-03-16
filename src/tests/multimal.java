package tests;

import java.util.Locale;
import java.util.Scanner;

public class multimal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		StringBuilder s = new StringBuilder();
		int nTest = sc.nextInt();
		int n1, n2;
		
		for(int i = 0; i < nTest; i++) {
			int r = -1, m = 10, aux=1, aux2=1;
			n1 = sc.nextInt(); n2 = sc.nextInt();
			
			while(aux != 0 && aux2 != 0) {
				
				aux = n1 % m;
				aux2 = n2 % m;
				r = aux * aux2;
				if(r  > 9) s.insert(0, r%10);
				else s.insert(0, r);
			}
		}
		
		
	}
}
