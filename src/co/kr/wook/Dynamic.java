package co.kr.wook;

public class Dynamic {
	
	public int pivo(int n, int[] arr) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 1;
		if(arr[n-1] != 0) {
			return arr[n-1];
		}
		return arr[n-1] = pivo(n-1,arr) + pivo(n-2,arr);
	}
	
}
