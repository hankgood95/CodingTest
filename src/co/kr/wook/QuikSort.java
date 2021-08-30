package co.kr.wook;

import java.util.Arrays;

public class QuikSort {
	//여기서 내가 만들어야 할것
	
	//1. 큇소트를 호출했을때 시작 부분
	public void quikSort(String[] arr) {
		int start = 0;
		int end = arr.length - 1;
		quikSort(arr,start,end);
	}
	//2. 파티션을 나누는 함수를 시작점과 끝점을 가지고 호출 하는 부분 (quikSort() 오버로딩함)
	public void quikSort(String[] arr, int start, int end) {
		int part2 = part(arr,start,end);
		
		if(start < part2 - 1) { //정렬되서 나눠진게 끝에 한개가 아닌애들
			quikSort(arr,start,part2-1);
		}if(part2 < end) {
			quikSort(arr,part2,end);
		}
	}
	//3. 서로 특정 기준점을 통하여서 파티션을 나누는 부분
	public int part(String[] arr, int start, int end) {
		String pivot = arr[(start + end) / 2]; //중간지점의 값을 피봇 지점으로 지정함
		while(start <= end) { //서로를 지나칠때 빠져나온다.
			while(Integer.parseInt(arr[start]+pivot) > Integer.parseInt(pivot + arr[start]))
				start++;
			while(Integer.parseInt(arr[end]+pivot) < Integer.parseInt(pivot+arr[end]))
				end--;
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	//4. 서로 위치를 바꿔주는 부분
	public void swap(String[] arr, int start, int end) {
		String temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
