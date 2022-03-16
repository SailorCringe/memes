package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class rei {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		StringTokenizer st;
		HashMap<String, Integer> map;
		int n = Integer.parseInt(br.readLine());
		StringBuilder s = new StringBuilder();
		String nom;
		while(n != 0) {
			
			map = new HashMap<String, Integer>();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				
				nom = st.nextToken();
				if(!(map.containsKey(nom))) {
					map.put(nom, 1);
				}
				else map.put(nom, map.get(nom)+1);
			}
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				
				nom = st.nextToken();
				if(map.containsKey(nom)) {
					map.put(nom, map.get(nom)+1);
					s.append(map.get(nom)+"\n");
				}
				else {
					map.put(nom, 1);
					s.append(map.get(nom)+"\n");
				}
				
			}
			s.append("\n");
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(s);	
		br.close();
	}
}
