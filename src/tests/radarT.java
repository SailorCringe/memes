package tests;

import java.util.Scanner;

public class radarT {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean found = false;
		double calcul;
		
		while(!found) {
			double d = sc.nextInt(), v = sc.nextInt(), s = sc.nextInt();
			if(d == 0 && v == 0 && s == 0) found = true;
			
			if(d <= 0 || v <= 0 || s <= 0) {
				System.out.println("ERROR");
				d = sc.nextInt(); v = sc.nextInt(); s = sc.nextInt();
				if(d == 0 && v == 0 && s == 0) found = true;
			}
			
			calcul = d/(s/60/60)/v;
			if(calcul < 1000)  System.out.println("OK");
			else if(calcul > 1000) {
				if(calcul < 1200) System.out.println("MULTA");
				else System.out.println("PUNTOS");
			}
		}		
	}
}
