package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a software tester in NTT Data"; 
		String [] split_word = str.split(" ");
		for (int i = 0; i < split_word.length; i++) {
			if(i%2 == 0)
			{
				char[] charArray = split_word[i].toCharArray();
				for (int j = charArray.length-1; j >=0 ; j--) {
					System.out.print(charArray[j]);

				}
			}
			else
			{
				System.out.print(" "+split_word[i]+" ");
			}

		}

	}

}
