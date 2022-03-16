package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Base implements Comparable<Bases>{
	
	short s, b, r;
	int sobras;
	
	
	public Base(short s2, short b2, short r2, int sobras) {
		
		this.s = s2;
		this.b = b2;
		this.r = r2;
		this.sobras = sobras;
	}
	@Override
	public int compareTo(Bases prox) {
       
        return prox.sobras-this.sobras;

		}
	}

public class conquistaEspanola {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short bases = sc.nextShort(), s=0, b=0, r=0;
		
		int  resultat;
				
		while(bases != 0) {
			
			resultat = 0;

			ArrayList<Bases> a = new ArrayList<>();
			
			for(short i = 0; i < bases; i++) {
				
				s = sc.nextShort(); b = sc.nextShort(); r = sc.nextShort();
				
				a.add(new Bases(s,b,r,(s-b-r)));
			}
			
			Collections.sort(a);
			
			int acum = 0, sum = 0, vari = 0, dif = 0;
			for(Bases base : a ) {
				
				acum += base.b+base.r;
				
				vari = base.s - dif;
				
				sum += vari;
				
				dif = base.s-base.r-base.b;
							
			}

		if(sum >= acum) resultat = sum;
		else resultat = acum;
		
		System.out.println(resultat);
		bases = sc.nextShort();
	} 
		
		sc.close();
	}
	
}