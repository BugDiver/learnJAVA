import java.io.*;
import java.util.*;
import java.lang.*;

public class StringFunction{

	public int countVowels(String text) {
		char ch;
		int vowels = 0;
		for (int i = 0;i<text.length() ;i++ ) {
			ch = text.toLowerCase().charAt(i);
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch =='o'||ch=='u'){
				vowels++;
			}
		}
		return vowels;
	}

	public int countConsonants(String text) {
		char ch;
		int consonants = text.length();
		for (int i = 0;i<text.length() ;i++ ) {
			ch = text.toLowerCase().charAt(i);
			if(Character.isDigit(ch) || Character.isWhitespace(ch) || !Character.isLetter(ch)){
				consonants--;
			}
		}
		return consonants-countVowels(text);
	}

	public boolean isPalindrome(String text){
		StringBuffer s  = new StringBuffer(text);
		return new String(s.reverse()).equals(text);
	}
	public String strip(String text){
		return text.replaceAll(" ","");
	}

}
