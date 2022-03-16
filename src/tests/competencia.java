package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
public class competencia {
public static void main(String[] args) throws IOException
{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder();
		StringTokenizer st;
		short nTest = Short.parseShort(br.readLine());
		short min1 , min2;
		short[] shop1, shop2;
		int count;
		HashMap<short[], short[]> map = new HashMap<short[], short[]>();
		while (nTest != 0) {
			
			st = new StringTokenizer(br.readLine());
			min1 = Short.parseShort(st.nextToken()); min2 = Short.parseShort(st.nextToken());
			shop1 = new short[nTest];
			shop2 = new short[nTest];
			boolean iguals1 = false, iguals2 = false;
			count = 0;
			st = new StringTokenizer(br.readLine());
			
			for(short i = 0; i < nTest; i++) {
				
				shop1[i] = Short.parseShort(st.nextToken());
				if(i > 0 && !iguals1) if(shop1[i] != shop1[i-1]) iguals1 = true;
			}
			
			st = new StringTokenizer(br.readLine());
			
			for(short j = 0; j < nTest; j++) {
							
				shop2[j] = Short.parseShort(st.nextToken());
				if(j > 0 && !iguals2) if(shop1[j] != shop1[j-1]) iguals2 = true;
			}
			List s1 = new ArrayList<>();
			s1.add(shop1);
			List s2 = new ArrayList<>();
			s1.add(shop2);
			
			
			
			for(short i = 0; i < nTest; i++) {
							
				if(shop1[i] - shop2[i] < shop2[i+1] - shop2[i+1])
				s1.add(shop1[i]);
			}
						
			for(short i = 0; i < nTest; i++) {
				
				shop1[i] = Short.parseShort(st.nextToken());
				if(i > 0 && !iguals1) if(shop1[i] != shop1[i-1]) iguals1 = true;
			}
			
			for(short i = 0; i < nTest; i++) {
				
				shop1[i] = Short.parseShort(st.nextToken());
				if(i > 0 && !iguals1) if(shop1[i] != shop1[i-1]) iguals1 = true;
			}

			
			short minIdx;
			short sumatori = 0;	
			for(short i = 0; i < nTest; i++) {
					
					if(min1 <= 0 && min2 > 0 && nTest - sumatori <= min2) {
						
						minIdx = getMin(shop2,i);
						count+=shop2[minIdx];
						shop1[minIdx] = 0;
						shop2[minIdx] = 0;
						sumatori++;
					}
					else if(min2 <= 0 && min1 > 0 && nTest - sumatori <= min1) {
						
						minIdx = getMin(shop1,i);
						count+=shop1[minIdx];
						shop1[minIdx] = 0;
						shop2[minIdx] = 0;
						sumatori++;

					}
					else {
						
						if(min1 > 0 && iguals1) minIdx = getMin(shop1,i);
						
						else if(min1 > 0 && !iguals1) minIdx = getMin(shop2,i);
						
						else if(min2 > 0 && iguals2) minIdx = getMin(shop2,i);
						
						else if(min2 > 0 && !iguals2) minIdx = getMin(shop1,i);
						
						else minIdx = getMin(shop2,i);
						
						if(shop2[minIdx] < shop1[minIdx]) {
							
							count+=shop2[minIdx];
							min2--;
							shop1[minIdx] = 0;
							shop2[minIdx] = 0;
							sumatori++;
						}
						else if(shop2[minIdx] > shop1[minIdx]) {
							
							count+= shop1[minIdx];
							min1--;
							shop1[minIdx] = 0;
							shop2[minIdx] = 0;
							sumatori++;
						}
						else {
							
							count+=shop1[minIdx];
							min1--; min2--;
							shop1[minIdx] = 0;
							shop2[minIdx] = 0;
							sumatori++;
						}
				}
					
			}
			s.append(count+"\n");
			nTest = Short.parseShort(br.readLine());
		}	
		System.out.print(s);
	}
		public static short getMin(short[] array, short id){ 
		    
		    short idx=id;
		    int minValue = Integer.MAX_VALUE;
		    
		    for(short i=0; i < array.length; i++){
		    	
		    	if(array[i] != 0) {
		    		
			      if(array[i] <= minValue){ 
			    	  
			        minValue = array[i];
			        idx = i;
			      } 
		    	} 
		    }
		    return idx; 
		  } 
}

