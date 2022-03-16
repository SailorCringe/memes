package tests;

import java.util.Scanner;

public class SpaceInvaders {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StringBuilder first = new StringBuilder();
		StringBuilder second = new StringBuilder();
		StringBuilder third = new StringBuilder();
		StringBuilder result = new StringBuilder();
		int  nTests = sc.nextInt();
		byte nPoints;
		String lane;
		
		for(int i = 0; i < nTests; i++) {
			nPoints = sc.nextByte();
			for(int j = 0; j < nPoints; j++) {
				
				lane = sc.next();
				
				first.append(lane.charAt(0));
				
				second.append(lane.charAt(1));
				
				third.append(lane.charAt(2));
				
			}
			first.append(second.toString());
			first.append(third.toString());
			result.append(first.toString());
			first.setLength(0);
			second.setLength(0);
			third.setLength(0);
			result.append("\n");
		}	
		System.out.print(result);
		sc.close();
	}
}
