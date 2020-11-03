package ex1_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex5_2178 {
	static int n, m;
	  static int[] dx = {0, 1, 0, -1}; //�������
	  static int[] dy = {1, 0, -1, 0};
	  static int[][] maze; //�̷�
	  static boolean[][] checked;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		  
		  n = sc.nextInt();
		  m = sc.nextInt();
		  maze = new int[n][m];
		  checked = new boolean[n][m];
		  
		  
		  
		  for(int i = 0; i < n; i++) {
		    String temp = sc.next(); //�پ �ԷµǱ� ������ ���� ������� �޾ƿ��� .next() ���
		    for(int j = 0; j < m; j++) {
		      maze[i][j] = (int)temp.charAt(j) - 48; //�ƽ�Ű�ڵ尪 ��ȯ
		    }
		  }
		  bfs();
		  System.out.print(maze[n - 1][m - 1]); //(N, M) ���. ��ǥ���̱� ������ -1
		  }
		  
		  public static void bfs() {
		    Queue<Integer> queue_x = new LinkedList<Integer>(); //x���� ���� Queue
		    Queue<Integer> queue_y = new LinkedList<Integer>(); //y���� ���� Queue
		    
		    queue_x.offer(0); //����
		    queue_y.offer(0);
		    
		    checked[0][0] = true;
		    
		    while(!queue_x.isEmpty()) {
		      int x = queue_x.poll();
		      int y = queue_y.poll();
		      
		      //�����¿� Ȯ��
		      for(int k = 0; k < 4;k++) {
		        int temp_x = x + dx[k];
		        int temp_y = y + dy[k];
		        
		        //��ȿ�� �������� Ȯ��
		        if(temp_x >= 0 && temp_y >= 0 && temp_x < n && temp_y < m) {
		          if(maze[temp_x][temp_y] == 1 && checked[temp_x][temp_y] == false) {
		            queue_x.offer(temp_x);
		            queue_y.offer(temp_y);
		            
		            checked[temp_x][temp_y] = true;
		            
		            maze[temp_x][temp_y] = maze[x][y] + 1; //�̵�Ƚ��
		          }
		        }
		      }
		    }
		  
	}

}
