package tests;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(), den =sc.nextInt();
		boolean found = false;
		if(num<den) found = true;
		while(!found) {
			long r=1; int dif = num - den-1;
			for(int i = num; i >= num- dif; i--){
                r = r * i;
			
			}
			System.out.println(r);
			num = sc.nextInt(); den = sc.nextInt();
			if(num<den) found = true;
		}
		sc.close();
	}
}

