package tests;

import java.util.Scanner;

public class trencorto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tren = sc.nextInt(), anden = sc.nextInt(), dif, idx;
		long[] d, i;
		int[] a;
		long acum2, acum;
		long r, op;
		StringBuilder sb = new StringBuilder();
		
		while((tren != 0 && anden != 0)) {
			dif = anden-tren+1;
			a = new int[anden]; d = new long[dif]; i = new long[dif]; r = Long.MAX_VALUE;
			acum = 0; idx = 0; acum2 = 0;
			
			for(int j = 0; j < anden; j++) {
				
				a[j] = sc.nextInt();
			}
			
			for(int k = 0; k < dif; k++) {
				
				d[k] = acum;
				acum += a[k] + acum2;
				acum2 += a[k];
				//System.out.print("a "+acum+"  a2 "+acum2);
			}
			acum = 0;
			acum2 = 0;
			idx = a.length-1;
			for(int l = dif; l > 0; l--) {
							
				i[l-1] = acum;
				acum += a[idx] + acum2;
				acum2 += a[idx];
				idx--;
				
				//System.out.print(i[l-1]+" ");
			}

			for(int k = 0; k < dif; k++) {
				//System.out.println(i[k]);
				op = i[k] + d[k];
				if(op < r) r = op;
				//System.out.println(d[k]);			
				//System.out.println(i[k] +" + "+ d[k]);
			}
			
			sb.append(r+"\n");
			tren = sc.nextInt(); anden = sc.nextInt();
		}	
		System.out.print(sb);
	}
}
