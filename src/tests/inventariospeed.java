package tests;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class inventariospeed {
	
		public static void main(String[] args)
		        throws IOException
		    {
		        BufferedReader br = new BufferedReader(
		            new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		        
		        HashSet<String> map;
		        String linea;
		        int n = Integer.parseInt(br.readLine());
		        StringBuilder s = new StringBuilder();
		        while(n != 0) {
		        	map  = new HashSet<>();
		        	int count = 0;
		        	for(int i = 0; i < n ;i++) {
		        		linea = br.readLine().toLowerCase();	        		
		        		if(!(map.contains(linea))) {
		        			map.add(linea);
		        			count++;
		        	}
		        	}
		        	s.append(count+"\n");
		        	n = Integer.parseInt(br.readLine());
		        }
		        bw.write(String.valueOf(s));
		        bw.close();
		  }		
}

