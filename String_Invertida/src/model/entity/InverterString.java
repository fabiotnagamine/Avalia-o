package model.entity;

public class InverterString {
	   public static String reverterString(String str) {
	        char[] charArray = str.toCharArray(); 
	       
	        for (int i = 0; i < charArray.length / 2; i++) {
	            char temp = charArray[i];
	            charArray[i] = charArray[charArray.length - 1 - i];
	            charArray[charArray.length - 1 - i] = temp;
	        }
	        
	        return new String(charArray);
	   }
}