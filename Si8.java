package ndjq;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Si8 {

	public static void main(String[] args) {

		double syu = Math.random();
		double cat = Math.random(); // 슈뢰딩거랑 고양이 랜덤함수범위설정
		int intsyu = (int) (Math.random() * 7) + 1;
		int intcat = (int) (Math.random() * 7) + 1;
		int Day = 0;

		for (int i = 0; i < 100; i++) { // 최대 1000일로 설정
			Timer timer = new Timer(); // 타이머
			timer.schedule(new WorkTask(), 1000, 2000);
			if (intsyu == intcat) {
				System.out.println("잡혔습니다.");
				System.out.println(Day + "Day");
				break;
			} else if (intsyu != intcat) {
				System.out.println("못잡음");
				Day++;
			}
		}
	}

	public static class WorkTask extends TimerTask { // 타임 상속
		@Override
		public void run() {
		}
	}
}
//규칙 1 : 슈뢰딩거는 7개의 방 중 '하루에 한 곳의 문'만 열어 고양이의 위치를 알 수 있다.o
//규칙 2 : 문을 열었을 때 고양이가 없다면 문을 닫아야 한다.o
//규칙 3 : 본문에서 보았듯이 고양이는 하루가 지날 때마다 왼쪽 혹은 오른쪽 방으로 한 칸 이동한다. x 