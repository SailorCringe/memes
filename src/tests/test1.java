package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
	public static void main(String[] args)
	        throws IOException
	    {
	        BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	        
	        int tests = Integer.parseInt(br.readLine()), walls, jumpUp, jumpDown;
	        String[] n;
	        String s;
	        
	        for(int i = 0; i < tests; i++) {
				walls = Integer.parseInt(br.readLine());
				jumpUp = 0; jumpDown = 0;
				s = br.readLine();
				n = s.split(" ");
				for(int j = 0; j < walls-1; j++) {		
					if(Integer.parseInt(n[j]) < Integer.parseInt(n[j+1])) jumpUp++;
					else if (Integer.parseInt(n[j]) > Integer.parseInt(n[j+1])) jumpDown++;

				}
			System.out.println(jumpUp+" "+jumpDown);
			
	    }
	}
}
