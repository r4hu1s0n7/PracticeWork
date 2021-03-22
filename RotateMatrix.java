class RotateMatrix{
	public static void main(String[] args) {
		int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int k;
		int n= m[0].length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(m[i][j]+"   ");
			}
			System.out.println();
		}

		for(int i=0; i<n/2; i++){
			for(int j=i; j<n-1-i; j++){
				k = m[i][j];
				m[i][j] = m[j][n-1-i];
				m[j][n-1-i] = m[n-1-i][n-1-j];
				m[n-1-i][n-1-j] = m[n-1-j][i];
				m[n-1-j][i] = k;
			}
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();
		}
	}
}

// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// 4   8   12   16
// 3   7   11   15
// 2   6   10   14
// 1   5   9   13