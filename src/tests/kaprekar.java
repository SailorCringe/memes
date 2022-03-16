package tests;

import java.util.Scanner;

public class kaprekar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		short n, j, a, b, r;
		
		for(int i = 0; i < tests; i ++) {
			j = 0;
			boolean found = false;
			n = sc.nextShort();
			a = asc(n);
			b = desc(n);
			
			while(!found && j < 8) {
				
				
				if(a > b) r = (short) (a - b);
				else r = (short) (b - a);
				if(r == 6174) {
					found = true;
				}
				a = asc(r);
				b = desc(r);
				j++;
		}
		
			if(n == 6174) System.out.println("0");
			else System.out.println(j);
		
		}
	}
	//arrays utils array.sort array.reverse
	static short asc(short a)
	{
	    short digito = 0;
		short aux = 0;
		short ordenado = 0;


		for(int i=0; i<=9; i++) {

			aux = a;

			while(aux > 0) {

				digito = (short) (aux % 10);

				if(digito == i) {
					ordenado = (short) ((ordenado * 10) + digito);
				}

				aux /= 10;

			}
		}

		return ordenado;
	}
	static short desc(short a)
	{
		short digito = 0;
		short aux = 0;
		short ordenado = 0;


		for(int i=9; i>=0; i--) {

			aux = a;

			while(aux > 0) {

				digito = (short) (aux % 10);

				if(digito == i) {
					ordenado = (short) ((ordenado * 10) + digito);
				}

				aux /= 10;

			}
		}
		return ordenado;
	  }
}
