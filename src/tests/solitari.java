package tests;

import java.util.Scanner;

public class solitari {
	public static void main(String[] args) 

	{
		Scanner sc = new Scanner(System.in);
		

		int nTests = sc.nextInt(), len, n=0, oCount, bCount, cCount, eCount, count;
		int[]nums;
		char[] pal;
		boolean found, rip;
		while(nTests != 0) {
			
			found = false;
			rip = false;
			len= 20*nTests/2;
			nums = new int[len];
			pal = new char[len];
			
			for(int i = 0; i<len; i++){
				nums[i]=sc.nextInt();
				pal[i]= sc.next().charAt(0);
			}
			
			
			if(nTests == 1) {
				
				n=12;
				
					while(!found && !rip) {
						
						for(int j = 1; j < nums.length; j+=2) {
							
							if(nums[j] == n) {if(n==10) n = n-3; else n-=1; } 
							
							}
						if(n == 0) found = true;
						
						for(int j = nums.length-2; j >= 0; j-=2) {
							
							if(nums[j] == n) {if(n==10) n = n-3; else n-=1; } 
							
							}
						if(n == 0) found = true;
						if(n==12) rip = true;
				}
			}
        	else {
        	n = 1; eCount=0; oCount=0; cCount=0; bCount=0; count=0; 
        	while(!found) {	

        		for(int a = 0; a<len-1; a+=2) {

        			if(pal[a] == pal[a + 1]) {
        				if(nums[a]==n)  n-=1; 
        				switch(pal[a]) {
        				case 1: case 2:case 3:case 4 :case 5:case 6:case 7:case 10:case 11:case 12:
        					if(pal[a] == 'o') oCount++;
        					else if(pal[a] == 'o') cCount++;
        					else if(pal[a] == 'o') eCount++;
        					else {bCount++; count++;}
        				break;
        			}

        			}
        		}
        		if (count == 0 || n == 12) found = true;

        	}
        }
	
			if(found) System.out.println("GANA");
			else System.out.println("PIERDE");
			nTests = sc.nextInt();
		}
	}
}
