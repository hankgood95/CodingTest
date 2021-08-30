package co.kr.wook;

public class QuikSortPractice {
	
	//오버로딩한 다른 quiㅏSort() 호출
	public void quikSort(int[] arr) {
		quikSort(arr, 0, arr.length-1);
	}

	//여기서는 파티션을 나누고 그 나눈 파티션을 가지고 다시 quikSort를 재귀호출한다.
	private void quikSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int part2 = part(arr,start, end); //나뉜 부분의 시작 index를 받는다.
		
		if(start < part2 - 1) { //하나만 잘려서 만들어진 애는 quikSort하면 안되기 때문
			quikSort(arr,start,part2 - 1); //재귀호출을 해서 하나만 나올때까지 계속함
			//시작위치 전까지 sort해야함
		}
		if(part2 < end) {
			quikSort(arr,part2,end);
		}
	}

	//피봇을 기준으로 파티션을 나누는 부분
	private int part(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[(start + end) / 2];
		while(start <= end) {
			while(arr[start]>pivot) {
				start++;
			}
			while(arr[end]<pivot) {
				end--;
			}
			if(start <= end) { //index들이 서로를 지나치지 않았을때 진입
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		
		return start;
	}

	//start index에 있는 수와 end index에 있는 수를 서로 바꿔줌.
	private void swap(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
