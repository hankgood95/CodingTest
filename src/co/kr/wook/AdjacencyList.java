package co.kr.wook;

import java.util.LinkedList;

public class AdjacencyList {

	private LinkedList<Integer>[] adj; // 인접리스트 생성
	private int v; // 정점개수
	
	
	public AdjacencyList(int v) {
		super();
		this.v = v; //이걸로 정점 개수 초기화
		adj = new LinkedList[v]; //그래프가 1부터시작한다고 했을때 0의 자리는 비워둠
		
		for(int i = 0; i< v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	//정점끼리 연결시키기
	public void addEdge(int v1, int v2) {
		adj[v1].add(v2);
		adj[v2].add(v1);
	}
	
	public void printG() {
		for(int i = 0; i<adj.length;i++) {
			System.out.println("node "+i+" 와 인접 노드 : "+ adj[i]);
		}
	}

	public LinkedList<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
}
