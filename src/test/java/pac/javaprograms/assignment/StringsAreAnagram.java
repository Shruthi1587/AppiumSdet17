package pac.javaprograms.assignment;

import java.util.Arrays;

public class StringsAreAnagram {

	public static void main(String[] args) {
		   String s1="Brag";  
	        String s2="Grab";  
	  
	        //Converting both the string to lower case.  
	        s1 = s1.toLowerCase();  
	        s2 = s2.toLowerCase();  
	  
	        //Checking for the length of strings  
	        if (s1.length() != s2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        else {  
	            //Converting both the arrays to character array  
	            char[] string1 = s1.toCharArray();  
	            char[] string2 = s2.toCharArray();  
	  
	            //Sorting the arrays using in-built function sort ()  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            //Comparing both the arrays using in-built function equals ()  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        }  
	}

}
