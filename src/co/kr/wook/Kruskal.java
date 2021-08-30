package co.kr.wook;

import java.util.Arrays;

public class Kruskal {
	
	public int giveMst(int[][] costs, int[] parent) {
		int mst = 0;
		
		UnionFind uf = new UnionFind();
		System.out.println(Arrays.deepToString(costs));
		//여기서 할것은 costs에 있는 간선들이 서로 연결되어 있는지 확인하고 아니라면 
		for(int i = 0; i<costs.length;i++) {
			int x = costs[i][0];
			int y = costs[i][1];
			int cost = costs[i][2];
			if(uf.checkLine(x,y,parent)) { //간선이 연결되어 있는지 확인
				System.out.println(x+" - "+y+ " 존재!!");
				continue;
			}else {
				System.out.println(x+" - "+y+ " 연결!!");
				uf.union(x, y, parent);
				System.out.println("부모 노드 : " +Arrays.toString(parent));
				mst+=cost;
			}
		}
		
		return mst;
	}
	
}
