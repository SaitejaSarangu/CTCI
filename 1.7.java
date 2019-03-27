/*
	Method to rotate a matrix

*/	

import java.util.*;
class MatrixRotation{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();

		//rotate(arr, n);
		rotateAlt(arr, n);

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	static void rotate(int arr[][], int n){

		for(int i = 0; i < n/2; i++){

			int index = 0;
			int temp[] = new int[n];
			int temp2[] = new int[n];
			for(int j = i; j < n-i-1; j++){

				temp[index++] = arr[j][n-i-1];
				arr[j][n-i-1] = arr[i][j];
			}
			index = 0;
			for(int j = n-i-1; j > i; j--){

				temp2[index] = arr[n-i-1][j];
				arr[n-i-1][j] = temp[index++];
			}
			index = 0;
			for(int j = n-i-1; j > i; j--){

				temp[index] = arr[j][i];
				arr[j][i] = temp2[index++];
			}
			index = 0;
			for(int j = i; j <= n-i-2; j++){

				arr[i][j] = temp[index++];
			}
		}

	}

	static void rotateAlt(int arr[][], int n){

		for(int i = 0; i < n/2; ++i){
			int first = i;
			int last = n - i -1;
			for(int j = first; j < last; j++){

				int offset = j - first;
				int top = arr[first][j];
				arr[first][j] = arr[last-offset][first];
				arr[last-offset][first] = arr[last][last-offset];
				arr[last][last-offset] = arr[j][last];
				arr[j][last] = top;
			}
		}
	}
}
