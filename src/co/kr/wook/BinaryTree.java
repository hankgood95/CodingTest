package co.kr.wook;

public class BinaryTree{
	//트리를 
	class Node {
		int data;
		Node leftNode;
		Node rightNode;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node root;
	public void makeTree(int[] arr) {
		root = makeTree(arr,0,arr.length-1);
	}
	public Node makeTree(int[] arr, int start, int end) {
		if(start> end)
			return null;
		int mid = (start+end)/2;
		Node node = new Node(arr[mid]);
		node.leftNode = makeTree(arr,start,mid-1);
		node.rightNode = makeTree(arr,mid+1,end);
		
		return node;
	}
	
	public void searchBTree(Node node, int find) {
		if(find<node.data) {
			System.out.println("찾으려는 데이터가 "+node.data+"보다 작음");
			searchBTree(node.leftNode,find);
		}else if(find>node.data) {
			System.out.println("찾으려는 데이터가 "+node.data+"보다 큼");
			searchBTree(node.rightNode,find);
		}else {
			System.out.println("찾았당");
		}
	}
}
