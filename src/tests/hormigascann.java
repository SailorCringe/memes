package tests;

import java.util.Scanner;

public class hormigascann {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt(), i, sum, n;
        boolean found;
        
		while(tests != 0) {
			i=0;
			found = false;
	        int[] nums = new int[tests];
			for(int a = 0; a < tests; a++) {
				nums[a] = sc.nextInt();
			}
			while(!found && i<tests) {
				sum = 0; 
				n = nums[i];
				for(int j = i+1; j < tests; j++) {
					sum = sum + nums[j];
					if(sum >= n) j = tests-1;
				}
				if(sum == n) found = true; 
				i++;
			}
			if(found)System.out.println("SI"+" "+i);
			else  System.out.println("NO");
			tests = sc.nextInt();
		
		}
	}
}
