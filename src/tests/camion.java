package tests;

import java.util.Scanner;
import java.util.Arrays;

public class camion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nTest = sc.nextInt(), dif;
		while(nTest != 0) {
			dif = 0;
			int[] nums = new int[nTest];
			for(int i = 0; i < nTest; i++) {
				nums[i] = sc.nextInt();
			}
			Arrays.sort(nums);
			for(int j = 0; j < nTest; j+=2) {
				
				if(dif < nums[j+1]-nums[j]) dif = nums[j+1]-nums[j];
			}
			System.out.println(dif);
			nTest = sc.nextInt();
		}
		sc.close();
	}
}
