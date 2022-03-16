package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fiesta {
	public static void main(String[] args)
	        throws IOException
	    {
	        BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	        
	        int nTest = Integer.parseInt(br.readLine());
	        for(int i = 0; i < nTest; i++) {
	        
	        	StringTokenizer st = new StringTokenizer(br.readLine());
	        	st.nextToken();
	        	System.out.println("Hola, "+st.nextToken()+".");
	        
	        
	        } 
	    }
}
