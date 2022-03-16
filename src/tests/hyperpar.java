package tests;
import java.util.Scanner;

public class hyperpar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(s), r, m;
		while(n != 0) {
			r=n; m=10;
			for(int i = 0; i < s.length()-1; i++) {
				
				r = n%m+r;
				m = m*10;
			}
		sb.append(r+"\n");
		s=sc.next();
		n = Integer.parseInt(s); 

		}
		System.out.print(sb);
		sc.close();
	}
}