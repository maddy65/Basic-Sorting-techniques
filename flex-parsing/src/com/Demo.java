package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		String a ="bullet";
		String b = "weapon1 = new SingleBarrelGun()";
		boolean containExactWord = isContainExactWord(b,a);
		
	}

	private static boolean isContainExactWord(String fullString, String partWord){
	    String pattern = "\\b"+partWord+"\\b";
	    Pattern p=Pattern.compile(pattern);
	    Matcher m=p.matcher(fullString);
	    return m.find();
	}
	
}
