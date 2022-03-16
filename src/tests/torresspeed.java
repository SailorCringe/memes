package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class torresspeed {
	public static void main(String[] args) 
			throws IOException
	{
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
		
		StringBuilder s = new StringBuilder();
		StringTokenizer st;
		
		int tablero;
		int rooks, me1, me2;
		int[] ver; int[] hori;
		
		while((tablero = br.read()) != 0) {
			
			rooks = br.read();
			ver = new int[rooks];
			hori = new int[rooks];

			for(int i = 0; i < rooks; i++) {
				
			
				ver[i] = br.read();
				hori[i] = br.read();
			}
			Arrays.sort(ver);
			Arrays.sort(hori);
			
			if(rooks % 2 != 0) {
				me1 = ver[ver.length/2];
				me2 = hori[hori.length/2];
			}
			else {
				me1 = ver[ver.length/2-1];
				me2 = hori[hori.length/2-1];
			}
			s.append(me1+" "+me2+"\n");
			
		}
		System.out.print(s);
	}

}
