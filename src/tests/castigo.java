package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class castigo {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		StringBuilder s = new StringBuilder();
		int test = Integer.parseInt(br.readLine()), n, count;
		
		for(int i = 0; i < test; i++) {
			
			n = Integer.parseInt(br.readLine());
			if(n < 2) s.append("0\n");
			else {
				count = 0;
				for(int j = 1; j < n; j*=2) {
					
					count++;
				}
				s.append(count+"\n");
			}
			
		}		
		System.out.print(s);
	}
}
