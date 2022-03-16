package tests;

import java.util.ArrayList;
import java.util.Scanner;

public class teclado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> dong; 
		String caract;
		short idx;
		
		while(sc.hasNext()) {
					
			dong = new ArrayList<>();
			caract = sc.nextLine();
			idx = 0;
			for(short i = 0; i < caract.length(); i++) {
				
				
				switch(caract.charAt(i)) {
				
				case '-': idx = 0;  break; case '+': idx = (short) dong.size(); break; case '*': idx++; break; case '3': if(idx < dong.size()) dong.remove(idx); break; 
				
				default: if(idx > dong.size()) idx = (short) dong.size(); dong.add(idx, caract.charAt(i)); idx++; break;
				}
				
				
			}
			for(Character a : dong) {
				System.out.print(a);
			}
			System.out.print("\n");
		}
		
	}

}
