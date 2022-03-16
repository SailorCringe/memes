package tests;

import java.util.Scanner;

public class competenciav4 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			short tests = sc.nextShort();
			StringBuilder sb = new StringBuilder();
			short min, min2, count;
			int[][] shops;
			while(tests != 0) {
				min = sc.nextShort(); min2 = sc.nextShort();
				shops = new int[2][tests];
				count = 0;
				
				for(short i = 0; i < tests; i++) {
					
					shops[0][i] = sc.nextInt();
				}
				for(short i = 0; i < tests; i++) {
					
					shops[1][i] = sc.nextInt();
				}
				
				
				sortArray(shops, tests);
				//Arrays.sort(shops, Comparator.comparingInt((int[] arr) -> arr[0]).thenComparing(Comparator.comparingInt((int[] arr) -> arr[1]).reversed()));
				for(int a : shops[0]) System.out.println("a: "+a);
				for(int a : shops[1]) System.out.println("b: "+a);
				for(short i = 0; i < min; i++) {
					
					//if(shops[0][i] < shops[1][i]) 
						count+=shops[0][i];
					/*System.out.println("0 "+shops[0][i]);
					System.out.println("1 "+shops[1][i]);
					System.out.println("count "+ count);*/
				}
				for(short i = (short) (tests-1); i >= tests- min2; i--) {
					
					//if(shops[0][i] > shops[1][i]) 
						count+=shops[1][i];
					/*System.out.println("0 "+shops[0][i]);
					System.out.println("1 "+shops[1][i]);
					System.out.println("count "+ count);*/
				}
				for(int i = min; i < tests - min2; i++) {
					
					count += Math.min(shops[0][i] , shops[1][i]);
					/*System.out.println("0 "+shops[0][i]);
					System.out.println("1 "+shops[1][i]);
					System.out.println("count "+ count);*/
				}
				System.out.println(count);
				//sb.append(count+"\n");
				tests = sc.nextShort();
			}
			//System.out.print(sb);
}
	private static void sortArray(int[][] a, short tests) {
		// TODO Auto-generated method stub
		int n1 , n2;
		for(short j = 0; j < tests-1; j++) {
			for(short i = 0; i < tests-1; i++) {
				
				if((a[0][i] - a[1][i]) > (a[0][i+1] - a[1][i+1])) {
					
					n1 = a[0][i]; n2 = a[1][i];
					a[0][i] = a[0][i+1]; 
					a[1][i] = a[1][i+1];
					a[0][i+1] = n1;
					a[1][i+1] = n2;
				}
			}
		}
	}
}