package tests;

import java.util.Scanner;

public class radarv2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			boolean found = false;
			double calcul1, calcul2;
			
			while(!found) {
				double d = sc.nextInt(), v = sc.nextInt(), s = sc.nextInt();
				if(d == 0 && v == 0 && s == 0) found = true;
				
				if(d <= 0 || v <= 0 || s <= 0) {
					System.out.println("ERROR");
				}
				else {
				calcul1 = d /1000;
				calcul2 = s /3600;
				
				if(calcul1 / calcul2 < v)  System.out.println("OK");
				else if(calcul1 / calcul2 < v*1.2) System.out.println("MULTA");
					
				else System.out.println("PUNTOS");
				}
			}
			}		
		}

