package cg.strings.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class JavaToKawa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("enter the String");
		str = sc.next();
		sc.close();
		System.out.println(alterString(str));
	}

	public static String alterString(String str) {
		String str1 = "";
		char[] charArray = str.toCharArray();
		// char[]charArray1;
		for (int i = 0; i < charArray.length; i++) {
			char ch;
			ch = charArray[i];
			if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u')) {
				ch = charArray[i];
				str1 += ch;
			} else {
				ch = (char) (ch + 1);
				str1 += ch;
			}
		}
		return new String(str1);
	}

}
