package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int[] result = new int[100];
		
		int max = result[0] * result[1]; //받은 배열을 먼저 계산하는 부분

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (max < arr[i] * arr[j]) { //max보다 큰 경우
					max = arr[i] * arr[j];
					result[0] = arr[i];
					result[1] = arr[j];
				}
			}
		}
		System.out.println("[" + result[0] + "," + result[1] + "]");

	}
}
