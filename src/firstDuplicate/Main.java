package firstDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Integer[] a = { 1, 16, 2, 14, 13, 3, 15, 4, 5, 6, 7, 8, 9, 10, 10, 9, 11, 11, 12, 13, 14, 15, 1, 16, 5, 8, 9, 3,
				2, 4, 7, 1, 4, 2, 3, 4, 1, 2, 4, 6, 7, 1 };
		System.out.printf("primeira duplicata: %d", getFirstDuplicate(a));
	}

	private static int getFirstDuplicate(Integer[] a) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(a));
		int firtIndexOfDuplicate = -1;
		int lastIndexOfDuplicate = a.length;
		boolean checkNextDuplicate;
		do {
			checkNextDuplicate = false;
			loopExterno: for (int i = firtIndexOfDuplicate + 1; i < lastIndexOfDuplicate; i++) {
				for (int j = i + 1; j < lastIndexOfDuplicate; j++) {
					if (numbers.get(i) == numbers.get(j)) {
						firtIndexOfDuplicate = i;
						lastIndexOfDuplicate = j;
						checkNextDuplicate = true;
						break loopExterno;
					}
				}
			}
		} while (checkNextDuplicate);

		return numbers.get(firtIndexOfDuplicate);
	}

}
