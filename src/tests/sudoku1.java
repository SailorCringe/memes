package tests;

import java.util.Scanner;

public class sudoku1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int[][] sudoku;
		int nTest = sc.nextInt();
		for(int a = 0; a < nTest; a++) {
			sudoku = new int[9][9];		
			boolean found = false;
			for(int f = 0; f < 9; f++) {
				for(int c = 0; c < 9; c++) {
					sudoku[f][c] = sc.nextInt();
				}
			}
				int idx = 0;
			while(!found && idx < sudoku.length) {
				
				if(files(sudoku, idx)) found = true;
				if(columnes(sudoku, idx)) found = true;
				if(regions(sudoku, idx)) found = true;
				idx++;
			}
			if(found) System.out.println("NO");
			else System.out.println("SI");

	}
sc.close();
}
		public static boolean files(int[][] sudoku, int idx) {
			boolean found = false;
				int i = 0;
				while(!found && idx < sudoku.length) {
					
					while(!found && i < sudoku.length) {
						int j = i+1;
						while(!found && j < sudoku.length) {
							if(sudoku[idx][i] == sudoku[idx][j]) found = true;
							j++;
						}
					i++;
				}
				idx++;
				}
				
				return found;
		}
		public static boolean columnes(int[][] sudoku, int idx) {
			boolean found = false;
			int id = 0, search = 0;
			int[] columnes = new int[9];
			for(int i = 0; i < 9; i++) {
				columnes[i] = sudoku[id][idx];
				id++;
			}
			while (!found && search < sudoku.length)
			{
				int x = search + 1;
				while (!found && x < sudoku.length)
				{
					if (columnes[search] == columnes[x]) found = true;
					x++;
					
				}
				
				search++;
			}
			
			return found;
		}
		public static boolean regions(int[][] sudoku, int idx) {
			boolean found = false;
			int idxFiles=0, idxColum=0;
			int[] reg = new int[9];
			
			if(idx == 3 || idx == 4 || idx == 5) idxColum = 3;		
			else if(idx >= 6) idxColum = 6;
			
			if(idx == 1 || idx ==  4 || idx == 7) idxFiles = 3;
			else if(idx == 2|| idx == 5 || idx == 8) idxFiles = 6;
			
			if(idx == 0 || idx == 3 || idx == 6) {
				for(int i = 0; i < 9; i++) {
					
					reg[i] = sudoku[idxFiles][idxColum];
					idxFiles++;
					if(idxFiles == 3) { idxFiles = 0; idxColum++;}
				}
			}
			else if(idx==1 || idx == 4 || idx == 7) {
				for(int i = 0; i < 9; i++) {
					
					reg[i] = sudoku[idxFiles][idxColum];
					idxFiles++;
					if(idxFiles == 6) { idxFiles = 3; idxColum++;}
				}
			}
			else {
				for(int i = 0; i < 9; i++) {
					
					reg[i] = sudoku[idxFiles][idxColum];
					idxFiles++;
					if(idxFiles == 9) { idxFiles = 6; idxColum++;}
				}			
			}
			int search = 0;
			while (!found && search < reg.length)
			{
				int x = search + 1;
				while (!found && x < reg.length)
				{
					if (reg[search] == reg[x]) found = true;
					x++;
				}
				search++;
			}
			return found;
		}				
	}
