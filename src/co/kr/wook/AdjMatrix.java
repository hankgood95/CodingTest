package co.kr.wook;

public class AdjMatrix {
	private int[][] adjGraph; //정점에 대한 그래프
	private int vertax; //정점
	
	
	public AdjMatrix(int vertax) {
		super();
		this.vertax = vertax;
		this.adjGraph = new int[vertax][vertax];
	}
	
	public void addEdge(int v1, int v2) {
		adjGraph[v1][v2] = 1;
		adjGraph[v2][v1] = 1;
	}
	
	public void printGraph() {
		for(int i = 0; i<vertax;i++) {
			System.out.print(i+" : ");
			for(int j = 0; j<vertax; j++) {
				System.out.print(adjGraph[i][j]+" ");
			}
			System.out.println();
		}
	}

	public int[][] getAdjGraph() {
		return adjGraph;
	}

	public void setAdjGraph(int[][] adjGraph) {
		this.adjGraph = adjGraph;
	}
	
	
	
	
}
