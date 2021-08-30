package co.kr.wook;

import java.util.Iterator;
import java.util.LinkedList;

public class Dfs {

	//여기서 해야할것은 아래와 같다.
	//자식이 있다면 자식을 방문하고 자식을 다 방문했다면 다른 자식을 방문하는것이다.
	//나는 이것을 재귀호출로 구현을해서 자식이 없는애까지 방문하는걸로 구현해보려고 한다.
	
	public Dfs() {}
	
	//이번 함수에서는 root를 입력받으면 해당을 시작기점으로 하여서 자식이 없는애까지 받으려고 한다.
	public void dfsRoute1(int root, int[] visit, LinkedList<Integer>[] list) {
		//일단 root의 인접리스트를 한번 출력하는걸 만들어보자.
		
		visit[root] = 1; //해당 노드 방문 처리
		System.out.print(root + " ");
		LinkedList<Integer> rootNode = list[root]; //해당 노드와 인접한노드 리스트를 받아옴
		
		Iterator it = rootNode.iterator();
		
		while(it.hasNext()) { //해당 노드와 인접한 노드에 접근
			int node = (int) it.next();
			if(visit[node]!=1) //인접노드가 방문되지 않았다면 방문처리
				dfsRoute1(node,visit,list);
		}
	}
	
	public void dfsRoute2(int root, int[] visit, int[][] adjM) {
		
		visit[root] = 1; //해당 노드 방문 처리
		System.out.print(root+" ");
		for(int i = 0; i<adjM[root].length;i++) {
			if(adjM[root][i] == 1 && visit[i] == 0) {//간선이고 해당 노드 방문 안했을때 
				dfsRoute2(i,visit,adjM);
			}
		}
	}
}
