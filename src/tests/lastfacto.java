package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lastfacto {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
			
			int tests = Integer.parseInt(br.readLine()), n;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < tests; i++) {
				
				n = Integer.parseInt(br.readLine());
				if(n > 4) sb.append("0\n");
				else {
					switch(n) {
					
					case 0:  case 1: sb.append("1\n"); break; case 2: sb.append("2\n"); break; case 3: sb.append("6\n"); break; case 4: sb.append("4\n"); break;
					}
				
				}
			}
						
			System.out.print(sb);
	}

}
