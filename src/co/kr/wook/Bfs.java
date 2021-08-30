package co.kr.wook;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	//BFS는 너비우선 탐색이라서 형제 노드들을 모두방문한 다음에 다음 레벨로 넘어가서 보는것이다.
	
	public Bfs() {}
	
	public void bfsRoute1(int root, int[] visit, LinkedList<Integer>[] adjL) {
		LinkedList<Integer> al = adjL[root];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(root); //시작 노드 queue에 삽입
		visit[root] = 1; //시작 노드 방문 처리
		
		while(queue.size()!=0) { //큐의 사이즈가 0보다 크다면 진입
			
			int v = queue.poll(); //큐에서 맨앞 값 빼기
			System.out.print(v+" ");
			al = adjL[v]; //해당 노드와 연결된 모든 인접노드 list 받기
			Iterator it = al.iterator();
			while(it.hasNext()) {
				int node = (int)it.next();
				if(visit[node]==0) { //방문 안되어 있는 노드는
					queue.add(node); //큐에 넣는다.
					visit[node] = 1;  // 큐에 넣은 노드는 방문처리를 해준다.
				}
					
			}			
		}
	}
	
	public void bfsRoute2(int root, int[] visit, int[][] adjM) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(root); //시작 노드 queue에 삽입
		visit[root] = 1; //시작 노드 방문 처리
		
		while(queue.size()!=0) { //큐의 사이즈가 0보다 크다면 진입
			
			int v = queue.poll();
			int[] am = adjM[v];
			System.out.print(v+" ");
			for(int i = 0;i<am.length;i++) {
				if(am[i] == 1 && visit[i] == 0) { //연결된 간선이고 방문하지 않은 노드일때 진입
					queue.add(i);//큐에 넣는다.
					visit[i] = 1;// 큐에 넣은 노드는 방문처리를 해준다.
				}
			}
		}
	}
}
