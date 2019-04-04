package ndjq;

public class Square {
	// double result[] = { 1, 2, 3, 4 };
	// result0 = i+^2를 받을것
	// result1 = i+^2를 출력할것
	// result2 = 1+2+3..10를 받을것
	// result3 = 합의제곱을 출력할것

	public static void main(String[] args) {
		double result1 = 0;
		double result2 = 0;
		double result3 = 0;
		double result4 = 0;

		for (int i = 1; i <= 100; i++) {
			result1 = result1 + Math.pow(i, 2);
			result2 = result1;
		}
		for (int i = 1; i <= 100; i++) {
			result3 = i + result3;
			result4 = Math.pow(result3, 2);
		}
		System.out.println("합의제곱과 제곱의 합 차이 :" + ((int) result4 - (int) result2));
	}
}
/*
 * 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합). 1^2 + 2^2 + ... + 10^2 = 385 1부터
 * 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다(합의 제곱). (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다 그러면 1부터
 * 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까? 항상 널 응원한단다.
 */