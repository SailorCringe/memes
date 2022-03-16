package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ripmiura {
	public static void main(String[] args)
	        throws IOException
	    {
	        BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	        HashSet<String> map;
	        StringTokenizer st;
	        int n = Integer.parseInt(br.readLine());
	        StringBuilder s = new StringBuilder();
	        while(n != 0) {
	        	map  = new HashSet<>();
	        	int count = 0;
	        	for(int i = 0; i < n ;i++) {
	        		st = new StringTokenizer(br.readLine(),"\n");	 
	        		if(!(map.contains(st.nextToken().toLowerCase().toString()))) {
	        			System.out.println(st);
	        			map.add(st.toString());
	        			count++;
        	}
	        	}
	        	s.append(count+"\n");
	        	n = Integer.parseInt(br.readLine());
	        }
	        System.out.print(s);
	  }
}