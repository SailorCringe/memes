package tests;

import java.util.Locale;
import java.util.Scanner;

public class ventas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		StringBuilder s = new StringBuilder();
		double n = sc.nextDouble();
		int saveBig=0, saveSmol=0;
		double[] dades;
		while(n!=-1) {
			
			dades = new double[6];
			double sum = 0, maxValue = 0, minValue = Integer.MAX_VALUE;
			dades[0] = n;
			for(int i = 1; i < 6; i++) {
				
				dades[i] = sc.nextDouble();
			}
			
			for(int j = 0; j < 6; j++) {
				
				if(dades[j] > maxValue) {saveBig = j; maxValue = dades[j];}
				if(dades[j] < minValue) {saveSmol = j; minValue = dades[j];}
				sum+=dades[j];
			}
			if(maxValue == minValue) s.append("EMPATE\n");
			else {
				
				switch(saveBig) {
				case 0: s.append("MARTES "); break; case 1: s.append("MIERCOLES "); break; case 2: s.append("JUEVES "); break; case 3: s.append("VIERNES "); break; 
				case 4: s.append("SABADO "); break;
				case 5: s.append("DOMINGO "); break; 
				}
				switch(saveSmol) {
				case 0: s.append("MARTES "); break; case 1: s.append("MIERCOLES "); break; case 2: s.append("JUEVES "); break; case 3: s.append("VIERNES "); break; 
				case 4: s.append("SABADO "); break;
				case 5: s.append("DOMINGO "); break; 
				}

				if(sum/6 < dades[5]) s.append("SI\n");
				else s.append("NO\n");
			}
			n = sc.nextDouble();
			if(n == -1)
			System.out.print(s);
		}
		sc.close();
	}	
}

