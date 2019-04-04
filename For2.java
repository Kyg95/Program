package ndjq;

import java.util.ArrayList;
import java.util.Arrays;

public class For2 {
//	김씨와 이씨는 각각 몇 명 인가요?
//			"이재영"이란 이름이 몇 번 반복되나요?
//			중복을 제거한 이름을 출력하세요.
//			중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

	public static void main(String[] args) {
		String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] names = input.split(",");// split() 함수의 인수로 구분자가 넘어가며 데이터가 없어도 배열에 담아 둡니다.

		int count_kim = 0;
		int count_lee = 0;
		int count_ljy = 0;
		// 각 문제를 풀기위해 각각의 변수를 선언하여 그릇을 준비한다
		ArrayList<String> name_list = new ArrayList<String>();// 배열 리스트를 할수있도록 설정

		for (int i = 0; i < names.length; i++) { // 이름의 길이만큼 반복하는 반복문 구성
			if (names[i].startsWith("김")) // startsWith는 .으로 받은 변수를 ()안에 값으로 김으로 시작하는지 판단하는 명령어
				count_kim++;
			if (names[i].startsWith("이")) // 동일
				count_lee++;
			if (names[i].equals("이재영")) //
				count_ljy++;
			if (!name_list.contains(names[i]))
				name_list.add(names[i]);
		}
		String[] name_arr = name_list.toArray(new String[name_list.size()]);

		System.out.println("김 씨: " + count_kim);
		System.out.println("이 씨: " + count_lee);

		System.out.println("이재영 씨: " + count_ljy);

		System.out.println("중복을 제거한 이름: ");
		for (int i = 0; i < name_arr.length; i++)
			System.out.print(name_arr[i] + ((name_arr.length == i + 1) ? "\n" : ", "));

		Arrays.sort(name_arr);
		System.out.println("중복을 제거한 이름을 오름차순으로: ");
		for (int i = 0; i < name_arr.length; i++)
			System.out.print(name_arr[i] + ((name_arr.length == i + 1) ? "\n" : ", "));

	}
}