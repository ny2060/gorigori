package ex2;

import java.util.Scanner;

public class ex_17608 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int[] array=new int[num];
		for(int i=0;i<num;i++) {
			array[i]=sc.nextInt();
		}
		int count=1;
		int max=array[array.length-1];//�ǵڿ��� ����
		
		for(int j=array.length-2;j>=0;j--) {
			//���ϵڿ��� �ι�°�ź��� �����ؾ���
			if(array[j]>max) {
				max=array[j];
				count+=1;
			}
		}
		System.out.println(count);
	}

}
