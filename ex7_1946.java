package ex1_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex7_1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt(), count = 1;
			int a[][] = new int[n+1][2];
			for(i=1;i<=n;i++)for(j=0;j<2;j++) a[i][j] = sc.nextInt();
			
			Arrays.sort(a, new Comparator<int []>(){
				public int compare(int arr1[], int arr2[]) {
					return Integer.compare(arr1[0], arr2[0]);
				}
			});
			
			int pivot = a[1][1];
			for(i=2;i<=n;i++)
				if(a[i][1] < pivot){
					pivot = a[i][1];
					count++;
				}
			System.out.println(count);
		}
		sc.close();
	
	}

}
