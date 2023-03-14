package cg.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		String str="4441967484181";
		
		Pattern p = Pattern.compile("[1-9]{13}");
		Matcher match = p.matcher(str);
		System.out.println(match.matches());
	}

}
