package com.vikas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//- WAP to count number of characters and words in a string

public class Exer5 {
	
	public static void main(String...strings) throws IOException{
		String str;
		String arr[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		arr=new String[str.length()];
		arr=str.split(" ");
		System.out.println("Number of characters :"+str.length());
		System.out.println("Number of words :"+arr.length);
	}

}
