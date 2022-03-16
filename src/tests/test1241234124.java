package tests;

import java.util.Arrays;
import java.util.Scanner;

public class test1241234124 {
	public static void main(String args[]) {
		

		Scanner sc = new Scanner(System.in);
	    int h,pa, y, sum = 0, last;
	    h = sc.nextInt();
	    pa = sc.nextInt();
	    int[] c = new int[h];
	    int[] p = new int[h];
	    for(int i = 0; i < h; ++i){
	    	c[i] = sc.nextInt();
	    }
	    for(int j = 0; j < pa; ++j){
	    	 sc.nextInt();
	    	 sc.nextInt();
	        p[j] = sc.nextInt();
	    }
	    Arrays.sort(c);
	    Arrays.sort(p);
	    y = p[0]-c[0];
	    for(int n = 0; n < h-1; ++n){
	        sum += c[n];

	    }
	    if(sum + y <= p[pa-1]) System.out.println(y);
	    else System.out.println(-1);
	}
}
