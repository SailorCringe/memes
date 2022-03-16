package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class campos {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		short a = Short.parseShort(st.nextToken()), b = Short.parseShort(st.nextToken());
		
		while(!(a == 0 && b == 0)) {
			
			sb.append((a < b) ? "SENIL\n" : "CUERDO\n");
			st = new StringTokenizer(br.readLine());
			a = Short.parseShort(st.nextToken()); b = Short.parseShort(st.nextToken());
		}
		
		System.out.print(sb);

	}
}
