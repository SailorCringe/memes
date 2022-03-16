package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Bases implements Comparable<Bases>{
	
	short s, b, r;
	int sobras;
	
	
	public Bases(short s2, short b2, short r2, int sobras) {
		
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
public class test23423534523523 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short bases = sc.nextShort(), s=0, b=0, r=0;
		
		int  resultat, anterior;
				
		while(bases != 0) {
			
			resultat = 0;

			anterior = 0;
			ArrayList<Bases> a = new ArrayList<>();
			
			for(short i = 0; i < bases; i++) {
				
				s = sc.nextShort(); b = sc.nextShort(); r = sc.nextShort();
				
				a.add(new Bases(s,b,r,(s-b-r)));
			}
			
			Collections.sort(a);
			
			
			for(Bases base : a ) {
				
				/*acum += base.b+base.r;
				
				if(base.s > maxS) {
					maxS = base.s;
				}
				
				vari = base.s - dif;
				
				sum += vari;
				
				dif = base.s-base.r-base.b;*/
							
				if (anterior < base.s) {
					resultat += base.s - anterior;
					anterior = base.s;
				}
				if (anterior - base.b - base.r < 0) {
					resultat +=-1*(anterior - base.b - base.r);
					anterior = 0;
				}
				else {
					anterior -= (base.b + base.r);
				}
				/*if(anterior != 1) {
					resultat = base.s;
					sum = Math.abs(base.sobras);
				}
				if(anterior == 1) {
					if(sum >= base.s) {
						
						sum -= (base.b + base.r);
					}
					else {
						resultat += base.s - sum;
						sum += base.s - sum;
						sum -= (base.b + base.r);
					}
				}
				anterior = 1;*/
			}

		/*if(acum < maxS) resultat = maxS;
		else if(sum > acum) resultat = sum;
		else resultat = acum;*/
		
		System.out.println(resultat);
		bases = sc.nextShort();
	} 
		
		sc.close();
	}
	

}
