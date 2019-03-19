package String;

import java.util.Scanner;
import java.util.Stack;

public class paranthesis {
	public static void main(String[] args) {
		System.out.println("Enter string of paranthesis: ");
		Scanner s = new Scanner(System.in);

		String input = s.nextLine().trim();
		Stack<String> stack = new Stack<String>();
		int i = 0;
		String c2;
		String str = "";
		int x = 0;
		for (char c : input.toCharArray()) {
			str = str + c;
			if (c == '}' && !stack.isEmpty()) {

				c2 = stack.pop();
				if (c2 == "{")
					x++;
				else {
					stack.push(c2);
					stack.push(str);
					str = "";
				}
			}

		}
	}
}
