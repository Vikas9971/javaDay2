package com.vikas;

/*WAP that takes 2 String inputs from user.. After that, if letters in first string are exactly same as
 *  letters in other word, print "match" on the console and "not a match" otherwise.. After result, ask 
 *  user if user wants to exit or check for more strings..E.g. -- "student" and "dent sut" should return a match*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hello {
	public static void main(String args[]) throws IOException{
		
		String str1=null,str2=null;
		String arr1[],arr2[];
		char choice;
		int var=1;
		BufferedReader br;
		
		do{
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First String");
        str1 = br.readLine();
        arr1=str1.split("");
        System.out.println("Enter Second String");
        str2 = br.readLine();
        arr2=str2.split("");
        
        if(str1.length()==str2.length()){
	        label:for(int i=0;i<=str1.length();i++){
	        	lbl:for(int j=0;j<=str2.length();j++){
	        		if(arr1[i].equals(arr2[j])){
	        			var=0;
	        			break lbl;
	        		}
	        		else{
	        			var++;
	        		}
	        	}
	        	if(var>0){System.out.println("Not a Match");break label;}
	        }
        }
        else{
        	 System.out.println("Not a match");
        }
        if(var==0){System.out.println("Match");}
        System.out.println("Do you want to compare other strings as well(y/n)?");
        choice=(char) br.read();
	}while(choice=='y');
	}
}