package tests;

import java.util.Arrays;
import java.util.Scanner;

public class torres {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		short tablero;
		int rooks, me1, me2;
		int[] ver; int[] hori;
		StringBuilder s = new StringBuilder();
		while(sc.hasNext()) {
			
			tablero = sc.nextShort();
			rooks = sc.nextInt();
			ver = new int[rooks];
			hori = new int[rooks];

			for(int i = 0; i < rooks; i++) {
				
				ver[i] = sc.nextInt();
				hori[i] = sc.nextInt();
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
			s.append(me1); s.append(" "); s.append(me2+"\n");
			
		}
		System.out.print(s);
	}
}
