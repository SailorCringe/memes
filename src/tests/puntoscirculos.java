package tests;

import java.util.Scanner;

public class puntoscirculos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int r, x, y, count;
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			
			r = sc.nextInt(); x = sc.nextInt(); y = sc.nextInt(); count = 0;
			while(r >= 1) {
			
				
				if(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= r) count++;
				
				if(x == y || x == -y || -x == y) r = 1;
				else if(y > 0 && y > Math.abs(x)) {
					y -= r;
				}
				else if(x > 0 && x > Math.abs(y)){
					x -= r;
				}
				else if(y < 0 && Math.abs(y) > Math.abs(x)) {
					y += r;
				}
				else if(x < 0 && Math.abs(x) > Math.abs(y)) {
					x += r;
				}
				
				r /=2;
			}
			sb.append(count+"\n");
		}
		System.out.print(sb);
		sc.close();
	}
}