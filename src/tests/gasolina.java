package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class gasolina {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
			
			short days = Short.parseShort(br.readLine());
			int[] price, lis;
			StringBuilder sb = new StringBuilder();
			StringTokenizer st;
			int r;
			
			while(days != 0) {
				
				price = new int[days]; lis = new int[days];
				st = new StringTokenizer(br.readLine());
				for(short j = 0; j < days; j++) {
					
					price[j] = Integer.parseInt(st.nextToken());
				}
				
				lis[0] = 1;
				for(short i = 1; i < days; i++) {
							
					r = 1;
					for(short j = 0; j < i; j++) {
						
						if(price[i] > price[j]) {
							
							r = Math.max(r, lis[j]+1);					
						}
					}
					lis[i] = r;

				}				
				Arrays.sort(lis);
				sb.append(lis[lis.length-1]+"\n");
				days = Short.parseShort(br.readLine());
			}
			System.out.print(sb);
			br.close();
	}
}
