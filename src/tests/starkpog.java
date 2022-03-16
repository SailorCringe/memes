package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class starkpog {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		
		short test = Short.parseShort(br.readLine()), s, p, k, n, ded=0;
		StringBuilder sb = new StringBuilder();
		
		
		for(short i = 0; i < test; i++ ) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean stark = false, parker = false;
			n = Short.parseShort(st.nextToken()); s = Short.parseShort(st.nextToken()); p = Short.parseShort(st.nextToken()); k = Short.parseShort(st.nextToken());
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j = 1; j <= n; j++) {
							
				a.add(j);
			}
			if(n%2 != 0) ded = (short) (n/2+1);
			else ded = (short) (n/2);
			int v = k;
			for(short j = 1; j <= ded; j++) {
										
				while(v >= n) {
					v = v-n;
				}
				if(a.get(v) == s) stark = true;
				else if(a.get(v) == p) parker = true;
				a.remove(v);
				n-=1;
				v = v+k;
			}
		
		if(stark && parker) sb.append("No hay abrazo\n");
		else if(!stark && !parker) sb.append("No hay abrazo\n");
		else if(stark && !parker) sb.append("No quiero irme, Peter!\n");
		else sb.append("No quiero irme, Sr. Stark!\n");
		
		}
		System.out.print(sb);
		
	}

}
