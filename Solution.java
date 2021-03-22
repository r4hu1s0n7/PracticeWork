public class Solution{
	public static void main(String[] args) {
		char a[][] = {{'.','.','.','.','*'},{'.','.','.','.','.'},{'.','.','*','.','.'},{'.','.','.','.','.'},{'.','.','.','.','*'}};
		int n=5,m=5;
		int c = 0;
		for(int i = 0; i < n; i++){
			System.out.println();
			for(int j = 0; j < m; j++){
				if(a[i][j] == '*'){
					if((i-1) >= 0){  
						if(a[i-1][j] =='.'){
						c++;
						a[i-1][j] = '-';
						}

					}
					if((i+1) <= n-1){  
						if(a[i+1][j] =='.'){
						c++;
						a[i+1][j] = '-';
						}

					}
					if((j-1) >= 0){  
						if(a[i][j-1] =='.'){
						c++;
						a[i][j-1] = '-';
						}

					}
					if((j+1) <= m - 1){  
						if(a[i][j+1] =='.'){
						c++;
						a[i][j+1] = '-';
						}

					}
					if((i-1 >= 0) && (j-1 >= 0)){
						if(a[i-1][j-1] =='.'){
						c++;
						a[i-1][j-1] = '-';
						}
					}
					if((i+1 <= n-1) && (j+1 <= m-1)){
						if(a[i+1][j+1] =='.'){
						c++;
						a[i+1][j+1] = '-';
						}
					}
					if((i-1 >= 0) && (j+1 <= m-1)){
						if(a[i-1][j+1] =='.'){
						c++;
						a[i-1][j+1] = '-';
						}
					}
					if((i+1 <= n-1) && (j-1 >= 0)){
						if(a[i+1][j-1] =='.'){
						c++;
						a[i+1][j-1] = '-';
						}
					}
				}
			}
		}
		for(int i =0; i<n ;i++){
			for(int j =0; j<m; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
		System.out.print(c);

	}
}