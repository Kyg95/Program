package ndjq;

public class Allsupoja {

	public static void main(String[] args) {
		Saite sai = new Saite();
		sai.Saiten(sai.asu.Allp, sai.bsu.Bllp, sai.csu.Cllp, sai.sco.answer);

	}

}

class Asupoja { // a수포자

	int[] Allp = new int[100];

	Asupoja() {
	}

}

class Bsupoja { // b수포자
	int[] Bllp = new int[100];

	Bsupoja() {
	}
}

class Csupoja { // c수포자
	int[] Cllp = new int[100];

	Csupoja() {
	}
}

class Score { // 정답 담을 배열 생성
	int[] answer = new int[100];// 그릇

	Score() {
	}
}

class Foor { // 수학시험본사람과 정답지에 랜덤한숫자를 입력
	Foor() {
	}

	void For(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) ((Math.random() * 5) + 1);
		}
	}
}

class Saite { // 채점및 순위를 총괄할 클래스
	Saite() {
	}

	Asupoja asu = new Asupoja();
	Bsupoja bsu = new Bsupoja();
	Csupoja csu = new Csupoja();
	Score sco = new Score();
	Foor fo = new Foor();

	void Saiten(int a[], int b[], int c[], int d[]) {
		int count = 0, count1 = 0, count2 = 0; // 맞았을 경우

		fo.For(a);
		fo.For(b);
		fo.For(c);
		fo.For(d);// 각 수포자들과 정답지에 숫자를 넣음

		for (int i = 0; i < a.length; i++) { // A수포자의배열비교하여 점수체크
			if (a[i] == d[i]) {
				count++;
			}
		}
		for (int i = 0; i < b.length; i++) { // B수포자의배열비교하여 점수체크
			if (b[i] == d[i]) {
				count1++;
			}
		}
		for (int i = 0; i < b.length; i++) { // C수포자의배열비교하여 점수체크
			if (c[i] == d[i]) {
				count2++;
			} // c of d if문 end
		} // c of d for문 end

		if ((count > count1) && (count > count2)) {
			System.out.println("A가 가장 성적이 높습니다 :" + count);
		} else if ((count1 > count) && (count1 > count2)) {
			System.out.println("B가 성적이 가장 높습니다. : " + count1);
		} else {
			System.out.println("C가 성적이 가장 높습니다. :" + count2);
		}
	}// Saiten end
}// 끝