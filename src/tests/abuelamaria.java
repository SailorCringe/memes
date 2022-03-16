package tests;

import java.util.Scanner;

public class abuelamaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTest = sc.nextInt();
		int[]up;
		int[]down;
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < nTest; i++) {
			boolean found = false;
			up = new int[6];
			down = new int[6];
			for(int j = 0; j < 6; j++) {
				up[j] = sc.nextInt();
			}
			for(int a = 0; a<6; a++) {
				down[a] = sc.nextInt();
			}
				int q = 0;
				while(!found && q<5) {
					
					if(up[q] + down[q] != up[q+1] + down[q+1]) found = true;
					q++;
				}
			if(found) s.append("NO\n");
			else s.append("SI\n");
			if(i > 0 && i % 10000 == 0 || i == nTest-1) {
				System.out.print(s);
				s.setLength(0);
			}
		}
		sc.close();
	}
}
