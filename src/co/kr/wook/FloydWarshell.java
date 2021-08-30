package co.kr.wook;

public class FloydWarshell {
	
	//플로이드 워셜 알고리즘은 특정 노드를 거쳐갔을때의 최소 비용을 구해주는 프로그램이다.
	//예를 들면 1->3 가는 비용이 12이고 1->2, 2->3 이렇게 2를 거쳐가는 비용이 10이라면 
	// 1->3가는 비용을 1->2, 2->3 가는 비용인 10으로 바꿔주는것이다.
	
	private int[][] graph;
	private int node;
	
	//node를 입력 받으면 해당 node로 2차원 배열을 만들어주는 생성자
	public FloydWarshell(int node) {
		super();
		this.node = node;
		this.graph = new int[node][node];
		for(int i = 0;i<node;i++) {
			for(int j = 0; j<node;j++) {
				if(i == j)
					this.graph[i][j] = 0;
				else
					this.graph[i][j] = 1000;			
			}
		}
	}
	
	public void makeGraph(int start, int end, int cost) {
		this.graph[start][end] = cost; 
	}
	
	public void makeMin() {
		//k는 거쳐가는 노드이다.
		for(int k = 0; k<this.node;k++) {
			//i는 출발 노드이다.
			for(int i = 0; i<this.node;i++) {
				//j는 도착 노드이다.
				for(int j = 0; j<this.node;j++) {
					int bt = this.graph[i][k]+this.graph[k][j];
					int now = this.graph[i][j];
					if( bt < now )
						this.graph[i][j] = bt;
				}
			}
		}
	}
	//그래프 출력
	public void printG() {
		for(int i = 0;i<this.node;i++) {
			for(int j = 0; j<this.node;j++) {
				System.out.print(this.graph[i][j]+" ");
			}
			System.out.println();
		}
	}
}
