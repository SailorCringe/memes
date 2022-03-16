package tests;

import java.util.ArrayList;
import java.util.Scanner;

public class stark {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt(), s, p, k, n, ded=0;
		
		
		for(int i = 0; i < test; i++ ) {
			
			boolean stark = false, parker = false;
			n = sc.nextInt(); s = sc.nextInt(); p = sc.nextInt(); k = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j = 1; j <= n; j++) {
							
				a.add(j);
			}
			if(n%2 != 0) ded = n/2+1;
			else ded = n/2;
			int v = k;
			for(short j = 1; j <= ded; j++) {
										
				while(v >= n) {
					v = v-n;
				}
				if(a.get(v) == s) stark = true;
				else if(a.get(v) == p) parker = true;
				a.remove(v);
				n-=1;
				v = v+k;
			}
		
		if(stark && parker) System.out.println("No hay abrazo");
		else if(!stark && !parker) System.out.println("No hay abrazo");
		else if(stark && !parker) System.out.println("No quiero irme, Peter!");
		else System.out.println("No quiero irme, Sr. Stark!");
		
		}

	}
}
