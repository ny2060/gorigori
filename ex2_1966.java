package ex2;

import java.util.LinkedList;
import java.util.Scanner;

public class ex2_1966 {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
		int testcase = sc.nextInt(); 
		
		int n, m, count;
		
		for(int i=0; i<testcase; i++) { 
			
			LinkedList<int[]> queue = new LinkedList<>();
			count = 0; 
			n=sc.nextInt(); //�Է¹޴� ���� 
			
			m=sc.nextInt();
			for(int j=0; j<n; j++) 
				queue.add(new int[] {j, sc.nextInt()});
			// �ε���, �߿䵵 �Է¹ޱ�
			
			
			while(!queue.isEmpty()){ 
				// ť�� �� ������
				int[] now = queue.poll();
				boolean able = true;
				
				
				for (int[] q : queue) 
					if(q[1] > now[1]) able = false;
				if (able) {
					count++; if (now[0]==m) break; 
					
				} 
				else 
					queue.add(now);
				} 
			
			System.out.println(count); 
				} 
		}
			
		
	


}
