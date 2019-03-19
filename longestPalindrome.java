package String;

import java.util.Scanner;

public class longestPalindrome {
	public static void main(String args[]) {

		System.out.println("Enter string: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output = "";
		String temp = "";
		String pal = "";
		for (int i = 1; i < input.length(); i++) {
			pal = temp = "";

			if (input.charAt(i) != input.charAt(i - 1)) {
				continue;
			} else {
				// if same

				pal = pal + input.charAt(i) + input.charAt(i - 1); // middle
																	// letters
				int k = i - 2;
				for (int j = i + 1; j < input.length() && k >= 0; k--, j++) {
					if (input.charAt(k) == input.charAt(j)) {
						pal = input.charAt(k) + pal + input.charAt(k);
					} else {
						if (temp.length() < input.substring(k, i).length()) {
							temp = pal;
						}
					}
				}
				if (output.length() < temp.length())
					output = temp;
				else if (output.length() < pal.length())
					output = pal;
			}
		}
		// System.out.println("Longest palindrome:" + output);
		for (int i = 1; i < input.length() - 1; i++) {
			pal = temp = "";
			if (input.charAt(i + 1) != input.charAt(i - 1)) {
				continue;
			} else {
				// if same

				pal = pal + input.charAt(i - 1) + input.charAt(i) + input.charAt(i + 1);
				;// middle // letters

				int k = i - 2;
				for (int j = i + 2; j < input.length() && k >= 0; k--, j++) {
					if (input.charAt(k) == input.charAt(j)) {
						pal = input.charAt(k) + pal + input.charAt(k);
					} else {
						if (temp.length() < input.substring(k, i).length()) {
							temp = pal;
						}
					}
				}
				if (output.length() < temp.length())
					output = temp;
				else if (output.length() < pal.length())
					output = pal;
			}
		}
		System.out.println("Longest palindrome:" + output);
	}

}
