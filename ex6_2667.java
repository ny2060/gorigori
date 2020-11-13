package ex1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class ex6_2667 {
	
	
	public static int[] dirx= {0,0,-1,1};
	public static int[] diry= {-1,1,0,0};
	public static int[][] map;
	public static boolean[][] visited;
	public static int n,apart=1;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static ArrayList<Integer> num = new ArrayList<Integer>();
	
	public static void main(String[] args)throws Exception{
		
		n=Integer.parseInt(br.readLine());
		map =new int[n][n];
		visited=new boolean[n][n];//FALSE
		
		
		
		for (int i=0;i<n;i++) {
			String str=br.readLine();
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(str.charAt(j)+"");
				
			}
		}
		//MAP 입력받기 
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(!visited[i][j]&&map[i][j]!=0) {
					bfs(i,j);
					apart+=1;
					
				}
			}
		}
		
		int[] ans =new int[apart-1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]!=0) {
					ans[map[i][j]-1]+=1;
				}
			}
		}
		
		Arrays.sort(ans);
		System.out.println(apart-1);
		for(int num:ans)
			System.out.println(num);
		
	}
	
	
	public static void bfs(int startrow, int startcol) {
		
		Queue<Node> q=new LinkedList<Node>();
		
		visited[startrow][startcol]=true;
		map[startrow][startcol]=apart;
		
		q.offer(new Node(startrow,startcol));
		
		while(!q.isEmpty()) {
			Node node=q.poll();
			int row=node.row;
			int col=node.col;
			
			for(int i=0;i<4;i++) {
				int nr=row+dirx[i];
				int nc=col+diry[i];
				
				if(isboundary(nr,nc)&& !visited[nr][nc]&&map[nr][nc]!=0) {
					visited[nr][nc]=true;
					map[nr][nc]=apart;
					q.offer(new Node(nr,nc));
				}
			}
			
			
		}
	}
	
	public static boolean isboundary(int row,int col) {
		return (row>=0 && row< n)&&(col>=0&&col<n);
	}

}

class Node{
	
	int row;
	int col;
	
	public Node(int row,int col) {
		this.row=row;
		this.col=col;
	}
}