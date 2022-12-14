package week1.day2.classwork;

public class CharacterCount {

	public static void main(String[] args) {
		String name = "Hexaware";
		char expected = 'e';
		int count = 0;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==expected)
			{
				count++;
				
			}
			
			
		}
		System.out.println(count);

	}

}
