package ndjq;

import java.util.Scanner;

public class Visioncompare {
	/*
	 * A씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다. 버전은 다음처럼 "." 으로 구분된 문자열이다. 버전 예) 1.0.0,
	 * 1.0.23, 1.1 두 개의 버전을 비교하는 프로그램을 작성하시오. 다음은 버전 비교의 예이다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("버전을 입력해주세요");
		String n = scan.next();
		System.out.println("버전을 입력해주세요");
		String c = scan.next();
		int compareTo = n.compareTo(c);
		if (compareTo > 0) {
			System.out.println(n + ">" + c);
		} else if (compareTo == 0) {
			System.out.println(n + "=" + c);
		} else {
			System.out.println(n + "<" + c);
		}
	}
}