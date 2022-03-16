package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class envases {
		public static void main(String[] args) 
			 throws IOException
			{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine()), n1, n2, r;
			StringTokenizer st;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				n1 = Integer.parseInt(st.nextToken()); n2 =Integer.parseInt(st.nextToken());
				
				r = n2 - n1;
				
				System.out.println(r);
		}
	}
}
