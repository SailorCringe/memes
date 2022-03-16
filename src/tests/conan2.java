package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class conan2 {
	public static void main(String[] args) throws IOException
	{
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			StringBuilder sbr = new StringBuilder();
			StringTokenizer st;
			String s = null;
			short year=1, n, obra, count, min;
			
			while(year != 0) {
				
				min = Short.MAX_VALUE;
				year = (short)br.read();
				br.readLine();
				n = (short) br.read();
				count = 0;
				for(int i = 0; i < n; i++) {
					
					obra = (short) br.read();
					if(obra >= year) {
						if(min > obra) {
							min = obra;
							count++;
							s = br.readLine();
							
						}
					}
				}
				if(count == n) sb.append("TODAS\n");
				else if (count == 0) sb.append("NINGUNA\n");
				else sb.append(s+"\n");
			}
			System.out.print(sb);
	}
}
