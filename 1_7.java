/*
	element in a MxN matrix is 0 its entire row and column are set to 0
*/
import java.util.Scanner;
class SetZero{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();

		boolean flag[][] = new boolean[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr[i][j] == 0)
					flag[i][j] = true;
				else
					flag[i][j] = false;
			}
		}

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(flag[i][j]){
					for(int k = 0; k < n; k++)
						arr[i][k] = 0;
					for(int k = 0; k < m; k++)
						arr[k][j] = 0;
				}
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	//TODO: Code O(1) solution
}