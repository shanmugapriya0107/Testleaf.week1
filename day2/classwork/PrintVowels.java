package week1.day2.classwork;

public class PrintVowels {

	public static void main(String[] args) {
		String name = "Google";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'a' 
					|| charArray[i] == 'e' 
					|| charArray[i] == 'i' 
					|| charArray[i] == 'o' 
					|| charArray[i] == 'u') 	
			{
				System.out.println(charArray[i]);
			}
		}

	}

}
