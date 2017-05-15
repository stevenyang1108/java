package java50;

import java.util.Scanner;

public class WordsCount {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dialog = sc.nextLine();
		System.out.println(dialog);

		int alphaCount = 0, numberCount = 0, blankCount = 0, others = 0;
		char temp;
		for (int i = 0; i < dialog.length(); i++) {
			temp = dialog.charAt(i);

			if (temp >= '0' && temp <= '9')
				numberCount++;
			else if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z'))
				alphaCount++;
			else if (temp == ' ')
				blankCount++;
			else
				others++;

		}
		System.out.println(alphaCount + ", " + numberCount + ", " + blankCount + ", " + others);
		sc.close();
	}
}