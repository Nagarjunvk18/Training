package cg.strings.exercises;

import java.util.Scanner;

public class Mirror {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str = sc.next();
		System.out.println(getImage(str));
		sc.close();
	}

	public static String getImage(String str) {
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.reverse();
		return str + "|" + strBuffer;
	}

}
