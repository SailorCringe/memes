package tests;

import java.util.Scanner;

public class pipipipi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int days = sc.nextInt(), radios = sc.nextInt(), d=0, h=0, m=0, s=0, i=0;
		boolean found = false;
		if(days == 0 && radios == 0) found = true;
		while(!found) {
			int total = days*144*radios;

			d = total/86400;
			total = total%86400;
			h = total/3600;
			total = total%3600;
			m = total/60;
			s = total%60;

			if(d > 0) sb.append(d+":");
			else sb.append("0:");
			if(h > 0) {
				if(h < 10)sb.append("0"+h+":");
				else sb.append(h+":");
			}
			else sb.append("00:");
			if(m > 0) {
				if(m>10) sb.append(m+":");
				else sb.append("0"+m+":");
			}
			else sb.append("00:");
			if(s < 10) sb.append("0"+s+"\n");
			else sb.append(s+"\n");
			
			days = sc.nextInt(); radios = sc.nextInt();
			if(days == 0 && radios == 0) found = true;
			if(i > 0 && i % 10000 == 0 || days == 0 && radios == 0) {
				System.out.print(sb);
				sb.setLength(0);
			}
			i++;
		}
		sc.close();		
	}
}