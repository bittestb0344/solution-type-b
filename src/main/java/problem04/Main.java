package problem04;

import java.util.HashMap;

public class Main {

	// # : 강, O : 돌
	public static void main(String[] args) {

		// HashMap<Integer, String> map = new HashMap<Integer, String>();

		int stone = 0;
		int river = 0;

		for (int i = 0; i < 10; i++) {
			stone = (int) ((Math.random()) + 10);
			river = (int) ((Math.random()) + 10);
		}
		char arr[] = new char[20];

		for (int i = 0; i <= stone; i++) {
			arr[i] = 'O';
			System.out.print(arr[i]);
		}
		for (int j = 0; j <= river; j++) {
			arr[j] = '#';
			System.out.print(arr[j]);
		}

	}

}

