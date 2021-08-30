package co.kr.wook;

public class UnionFind {
	//일단은 노드를 연결해주는 부분이 있어야 한다.
	public void union(int x, int y, int[] parent) {
		x = find(x, parent); //2의 부모는 0
		y = find(y, parent); //4의 부모는 4
		
		if(x<y) {
			//x와 y의 부모노드값이 서로 다르면 같아지게 이어줘야 한다.
			//이어주는 부분에서 주의해야 할점은 노드들을 오름차순으로 정렬후에 먼저 받는 x의 값이 y값보다 작아야 한다.
			parent[y] = x;
		}else {
			parent[x] = y;
		}
	}

	public boolean checkLine(int x, int y, int[] parent) {
		// TODO Auto-generated method stub
		
		int getX = find(x,parent);
		int getY = find(y,parent);
	
		return getX==getY;
	}
	
	//여기선 부모 노드의 값을 리턴해주면 된다.
	public int find(int x, int[] parent) {
		// TODO Auto-generated method stub
		//주의해야할점은 부모 노드의 값과 전달 받은 값이 상이 하다면 해당 부모의 노드를 다시 받아와야 한다.
		if(x == parent[x]) {
			return x;
		}else { 
			//내 노드와 받은 노드의 값이 다르다면 부모 노드에 다른 값이 들어갔다는건데 그 값의 부모노드를 알기위해선 
			//parent[x] 안에 있는 값의 부모노드값을 받아와야 한다. 
			return find(parent[x],parent);
		}
	}	
}
