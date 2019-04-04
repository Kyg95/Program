package ndjq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {

		int arr1[] = new int[] { -1, 5, 2, -5, 7, 6, 10, -10 };
		Arrays.sort(arr1); // 오름차순 정렬이고 무조건 반복문을 사용해야함

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("들어있는 숫자 :" + arr1[i]);
		}

//		List<int[]>list = Arrays.asList(arr1);
//		Collections.reverse(list);
//		
//		for(int m = 0; m < arr1.length; m++) {
//			System.out.println("들어있는 숫자: " + arr1[m]);
//		}
//내림차순 정렬이고 list를 사용해야함		
	}

}