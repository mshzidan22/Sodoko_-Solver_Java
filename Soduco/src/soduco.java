import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class soduco {

	public static void main(String[] args) {
		// fill the array

		int a[][] = new int[9][9];
		
		/*
		 Scanner scanner = new Scanner(System.in);
		 int u, v = 0;
		 for (u = 0; u <= 8; u++) {
		 for (v = 0; v <= 8; v++) {
		 System.out.print("enter valuo for " + u + " " + v + " ======> ");
		 a[u][v] = scanner.nextInt();
		 }

		 }
	*/	
		
		a[0][0] = 7;
		a[0][1] = 1;
		a[0][2] = 4;
		a[0][3] = 0;
		a[0][4] = 6;
		a[0][5] = 8;
		a[0][6] = 2;
		a[0][7] = 0;
		a[0][8] = 0;

		a[1][0] = 0;
		a[1][1] = 0;
		a[1][2] = 9;
		a[1][3] = 0;
		a[1][4] = 0;
		a[1][5] = 0;
		a[1][6] = 0;
		a[1][7] = 0;
		a[1][8] = 8;

		a[2][0] = 0;
		a[2][1] = 6;
		a[2][2] = 0;
		a[2][3] = 0;
		a[2][4] = 0;
		a[2][5] = 0;
		a[2][6] = 3;
		a[2][7] = 0;
		a[2][8] = 1;

		a[3][0] = 0;
		a[3][1] = 8;
		a[3][2] = 7;
		a[3][3] = 4;
		a[3][4] = 3;
		a[3][5] = 0;
		a[3][6] = 0;
		a[3][7] = 0;
		a[3][8] = 0;

		a[4][0] = 0;
		a[4][1] = 3;
		a[4][2] = 0;
		a[4][3] = 8;
		a[4][4] = 0;
		a[4][5] = 5;
		a[4][6] = 0;
		a[4][7] = 9;
		a[4][8] = 0;

		a[5][0] = 0;
		a[5][1] = 0;
		a[5][2] = 0;
		a[5][3] = 0;
		a[5][4] = 7;
		a[5][5] = 6;
		a[5][6] = 8;
		a[5][7] = 3;
		a[5][8] = 0;

		a[6][0] = 4;
		a[6][1] = 0;
		a[6][2] = 3;
		a[6][3] = 0;
		a[6][4] = 0;
		a[6][5] = 0;
		a[6][6] = 0;
		a[6][7] = 6;
		a[6][8] = 0;

		a[7][0] = 1;
		a[7][1] = 0;
		a[7][2] = 0;
		a[7][3] = 0;
		a[7][4] = 0;
		a[7][5] = 0;
		a[7][6] = 7;
		a[7][7] = 0;
		a[7][8] = 0;

		a[8][0] = 0;
		a[8][1] = 0;
		a[8][2] = 2;
		a[8][3] = 1;
		a[8][4] = 5;
		a[8][5] = 0;
		a[8][6] = 9;
		a[8][7] = 8;
		a[8][8] = 4;
		
		HashSet<Integer> set = new HashSet<Integer>();

		//////////////////////// finish filling the array//////////////////////
		for (int m = 0; m < 999; m++) {

			for (int i = 0; i <= 8; i++) {
				for (int j = 0; j <= 8; j++) {
					/// start iterating /////
					if (a[i][j] == 0) {

						for (int z = 0; z <= 8; z++) {

							set.add(a[i][z]);
							set.add(a[z][j]);
						}

						for (int b = 0; b <= 8; b = b+3) {
							int c = b + 1;
							int d = b + 2;
							if ((i == b || i == c || i == d) && (j == b || j == c || j == d)) {
								set.add(a[b][b]);
								set.add(a[b][c]);
								set.add(a[b][d]);
								set.add(a[c][b]);
								set.add(a[c][c]);
								set.add(a[c][d]);
								set.add(a[d][b]);
								set.add(a[d][c]);
								set.add(a[d][d]);

							}
						}
						set.remove(0);
						System.out.println(set);
						if (set.size() == 8) {
							for (int t = 1; t <= 9; t++) {

								if (!set.contains(t)) {
									a[i][j] = t;
								}}}
						set.removeAll(set);	
			}
					
				}
			
			}
			
		}

		System.out.println(Arrays.deepToString(a));

	}

		}
