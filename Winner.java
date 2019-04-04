package ndjq;

import java.util.Arrays;

public class Winner {

	public static void main(String[] args) {
		String[] participant = { "josipa", "vinko", "filipa", "nikola", "marina" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		String answer = "";

		for (int i = 0; i < participant.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				System.out.println(answer);
				break;
			}
		}
	}

}