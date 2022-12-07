package week1.day2.classwork;

public class DuplicateString {

	public static void main(String[] args) {
		String name = "mom";
		char[] charArray = name.toCharArray();
		for (int i = 0; i <= charArray.length-1; i++) {
			for (int j = i+1; j <=charArray.length-1; j++) {
				if(charArray[i] == charArray[j])
				{
					System.out.print(charArray[i]);
				}

			}

		}

	}

}
