package tests;

import java.util.Arrays;
import java.util.Scanner;

public class calenperdidos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt(), n;
		short[] y;
		short count;
		
		for(int i = 0; i < tests; i++) {
			
			count = 0;
			n = sc.nextInt();
			y = new short[n];
			for(int j = 0; j < n; j++) {
				
				y[j] = sc.nextShort();
			}
			Arrays.sort(y);
			
			count = (short) ((short) (y[y.length-1] - y[0])-1);
			count -= y.length-2;

			System.out.println(count);
		}		
	}
}
