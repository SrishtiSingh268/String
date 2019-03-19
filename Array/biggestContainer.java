package Array;

import java.util.Scanner;

public class biggestContainer {
	public static void main(String[] args) {
		System.out.println("Enter y coordinates: ");
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int arr[] = new int[input.length];
		int k = 0;

		for (String str : input) {
			arr[k++] = Integer.parseInt(str);
		}
		int area = (arr.length - 1) * Math.min(arr[0], arr[arr.length - 1]);
		for (int i = 0, j = arr.length - 1; i < j && i < arr.length && j > 0;) {
			if ((j - i - 1) * Math.min(arr[i + 1], arr[j]) > area) {
				area = (j - i - 1) * Math.min(arr[i + 1], arr[j]);
				i++;
			} else if ((j - 1 - i) * Math.min(arr[i], arr[j - 1]) > area) {
				area = (j - i - 1) * Math.min(arr[i], arr[j - 1]);
				j--;
			} else {
				if (i < j)
					i++;
				else
					j--;
			}
		}
		System.out.println(area);
	}
}
