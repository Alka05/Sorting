package arrayquestions;

public class Sorting {

	public static void main(String[] args) {
		int[] num = { 5, 4, 6, 9, 2, 1, 8, 6, 8, 9, 2, 0, 7 };
		for (int i = num.length - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (num[j] > num[j - 1]) {
					int temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
			System.out.print(num[i]);
		}
	}
}
