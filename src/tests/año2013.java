package tests;

import java.util.Scanner;

public class año2013 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		short n = sc.nextShort();
		short n1=0, n2=0, n3=0, n4=0, year=0, rYear= 0, firstYear=0, count=0;
		
		
		for(short i = 0; i < n; i++) {
			
			boolean found = false; boolean seguidos = false;
			count = 0;
			firstYear = sc.nextShort();
			year = firstYear;
			while(!found) {
							
					
					
					
					while(!found) {
						
						n4 = (short) (year%10);
						year = (short) (year/10);
						n3 = (short) (year%10);
						year = (short) (year/10);
						n2 = (short) (year%10);
						year = (short) (year/10);
						n1 = (short) (year%10);
						count--;
						year = (short) (firstYear+count);
						if((n1 != n2 && n1 != n3 && n1 != n4) && (n2 != n3 && n2 != n4) && (n3 != n4)) {
							seguidos = false;
						}
						else seguidos = true;
						if(!seguidos) {
							found = true;
							rYear = year;
						}
					}
					found = false;
					count = 0;
					year = firstYear;
					seguidos = false;
					while(!found) {
						
						n4 = (short) (year%10);
						year = (short) (year/10);
						n3 = (short) (year%10);
						year = (short) (year/10);
						n2 = (short) (year%10);
						year = (short) (year/10);
						n1 = (short) (year%10);
						count++;
						year = (short) (firstYear+count);
						if((n1 != n2 && n1 != n3 && n1 != n4) && (n2 != n3 && n2 != n4) && (n3 != n4)) {
							seguidos = false;
						}
						else seguidos = true;
						if(!seguidos) {
							found = true;
						}
				}
				}
			System.out.println(rYear+" "+count);
			}
	}
}
