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
}
