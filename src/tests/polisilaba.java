package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class polisilaba {
	public static void main(String[] args)
	        throws IOException
	    {
	        BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	        StringTokenizer st;
	        String[] dades;
	        StringBuilder sb = new StringBuilder();
	        int n = Integer.parseInt(br.readLine());
	        for(int i = 0; i < n; i++) {
	        	
	        	dades = new String[2];
	        	st = new StringTokenizer(br.readLine());
	        	dades[0] = st.nextToken().toLowerCase();
	        	st.nextToken();
	        	dades[1] = st.nextToken();
	        	
	        	if(dades[0].toLowerCase().equals(dades[1].toLowerCase())) sb.append("TAUTOLOGIA\n");
	        	else sb.append("NO TAUTOLOGIA\n");     
	        	
	        	}
	    	System.out.print(sb);
	    }      
}
