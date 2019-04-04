package ndjq;

import java.util.Arrays;
import java.util.Scanner;

public class MediumDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		String[] numbers = line.split(",[\\s]*");

		int[] nums = new int[numbers.length];

//		for (int i = 0; i < numbers.length; i++) {
//			nums[i] = Integer.parseInt(numbers[i]);
//		}

		Double[] doubleNums = { 11.0, 12.0, 13.0 };

		double medium = MediumDemo.<Double>findMedium(doubleNums);

		System.out.println(medium);

	}

//	private static int findMedium(int[] nums) {
//		// 5--2
//		// 3--1
//		// 7--3
//		Arrays.sort(nums);
//		if (nums.length % 2 == 0) {
//			// 0 1 2 3 --> 1
//			// 0 1 2 3 4 5 --> 2
//			// 0 1 2 3 4 5 6 7
//			int index = nums.length / 2 - 1;
//			return (nums[index] + nums[index + 1]) / 2;
//		} else {
//			int index = nums.length / 2;
//			return nums[index];
//		}
//
//	}

	@SuppressWarnings("unchecked")
	private static <T> T findMedium(T[] nums) {
		// 5--2
		// 3--1
		// 7--3
		Arrays.sort(nums);
		if (nums instanceof Double[]) {
			// 제네릭
			// 런타임시 자기가 사용하는 타입으로 바뀌어진 코드가 생성됨
			Double[] n = (Double[]) nums; // 더블타입 캐스팅
			if (nums.length % 2 == 0) {
				// 0 1 2 3 --> 1
				// 0 1 2 3 4 5 --> 2
				// 0 1 2 3 4 5 6 7
				int index = nums.length / 2 - 1;
				return (T) (new Double((n[index].doubleValue() + n[index + 1].doubleValue()) / 2));
			} else {
				int index = nums.length / 2;
				return (T) (new Double(n[index].doubleValue()));
			}
		} else if (nums instanceof Integer[]) {
			Integer[] n = (Integer[]) nums; // 인트타입 캐스팅
			if (nums.length % 2 == 0) {
				// 0 1 2 3 --> 1
				// 0 1 2 3 4 5 --> 2
				// 0 1 2 3 4 5 6 7
				int index = nums.length / 2 - 1;
				return (T) (new Integer(n[index].intValue() + n[index + 1].intValue() / 2));
			} else {
				int index = nums.length / 2;
				return (T) (new Integer(n[index].intValue()));
			}
		}
		return null;
	}
}