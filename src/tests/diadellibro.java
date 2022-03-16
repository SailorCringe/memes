package tests;

import java.util.Scanner;

public class diadellibro {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		short d,m,y;
		
		for(int i = 0; i < n; i++) {
			
			d = sc.nextShort(); m = sc.nextShort(); y = sc.nextShort();
			
			if(y > 1581 && y < 1753) {	
				if (y == 1582) {
					
					if(m > 9 && d > 14) {
						d = (short) (d-10);
				}	
				}
				else if(y == 1752) {
					
					if(m < 10 && d < 14) {
						d = (short) (d-10);
						
				}
				}
				else if((y == 1700 && m > 2 && d > 9) || y > 1700) d = (short) (d-11);
				else if( y <= 1700 && y > 1582) d = (short) (d-10);
				
				if(d <= 0) {
					m = (short) (m-1);
					if(m <= 0) {
						y = (short) (y-1);
						m = 12;
					}
						switch(m) {
						case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
						d = (short) (d+31); break;
						case 2: 
						if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {

							 d = (short) (d+29); 
							} 
						else {

							 d = (short) (d+28); 
						}
						break;	
						case 4: case 6: case 9: case 11: 
						d = (short) (d+30); break;
						}
					}
				}
			if(d == 28 && m == 2 && y == 1700) d+=1;
			System.out.println(d+" "+m+" "+y);

		}
	}
}
