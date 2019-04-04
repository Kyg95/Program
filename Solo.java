package ndjq;

public class Solo {

	public static void main(String[] args) {
		String name = "ASDJCasdS";
		String toLowerCase = name.toLowerCase();
		System.out.println(toLowerCase);
		for (int i = 0; i < name.length(); i++) {
		}
		if (name.charAt(3) == 'J') {
			System.out.println("J발견");
		}
		String substring = name.substring(2, 6).toLowerCase();
		System.out.println(substring);

	}

}
//String numStr2 = String.valueOf(numInt);
//String substring = str.substring(0, 2);
//System.out.println("substring: " + substring);

//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.