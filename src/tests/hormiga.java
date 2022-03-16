package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hormiga {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		int tests = Integer.parseInt(br.readLine()), n=0, i, r=0, big;
		long sum;
		StringTokenizer st;
		boolean found;
		
		while(tests != 0) {
			i=0; big = 0;
			found = false;
			st = new StringTokenizer(br.readLine());
			int[] nums = new int[tests];
			for(int a = 0; a < tests; a++) {
				nums[a] = Integer.parseInt(st.nextToken());
			}
			while(!found && i<tests) {
				sum = 0; 
				n = nums[i];
				for(int j = i+1; j < tests; j++) {
					sum = sum + nums[j];
					if(sum > n) j = tests-1;
				}
				
				i++;
				if(sum == n) {
					found = true; 
					if(big < n) r = i;
					}
			}
			if(found)System.out.println("SI "+r);
			else System.out.println("NO");
			tests = Integer.parseInt(br.readLine());
		}
	}
}

