package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2= "99.12.255.243";
		System.out.println("Input: " + str2); 
        System.out.println( 
            "Output: "
            + isValidAddress(str2)); 
		

	}
	
	public static boolean isValidAddress(String ip) {
		
		String zeroTo255 = "(\\d{1,2}|"
				+ "(0|1)\\d{2} |"
				+ "2[0-4]\\d|"
				+ "25[0-5])";
	

	
	String regex = zeroTo255 +"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
	Pattern p = Pattern.compile(regex);
	if(ip==null) {
		return false;
	}
	Matcher m = p.matcher(ip);
		
	return m.matches();
}
}