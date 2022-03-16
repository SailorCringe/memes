package tests;

import java.text.DecimalFormat;
import java.util.Scanner;

public class matricula {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] lletres = new char[3];
		lletres = sc.next().toCharArray();
		DecimalFormat d = new DecimalFormat("0000");
		boolean found = false;
		if(n == 9999 && lletres[0] == 'Z' && lletres[1] == 'Z' && lletres[2] == 'Z')  found = true;
		while(!found) {
			
			if( n < 9999) n+=1;
			else {
				n = 0000;
				lletres[2]+=1;
				switch(lletres[2]) {
				case 'A': case 'E': case 'I': case 'O': case 'U': lletres[2]+=1; break;
				}
				if(lletres[2] > 'Z'){
					lletres[2] = 'B';
					lletres[1]+=1;
					switch(lletres[1]) {
					case 'A': case 'E': case 'I': case 'O': case 'U': lletres[1]+=1; break;
					}
					if(lletres[1] > 'Z') {
						lletres[1] = 'B';
						lletres[0]+=1;
						switch(lletres[0]) {
						case 'A': case 'E': case 'I': case 'O': case 'U': lletres[0]+=1; break;
						}
					}
				}				
			}
			System.out.println(d.format(n)+" "+String.valueOf(lletres));
			n = sc.nextInt();
			lletres = sc.next().toCharArray();
			if(n == 9999 && lletres[0] == 'Z' && lletres[1] == 'Z' && lletres[2] == 'Z') found = true;

	}
}
}
