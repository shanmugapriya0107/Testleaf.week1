package week1.day2.classwork;

public class ReverseWord {

	public static void main(String[] args) {
		String name = "Amazon Developement Center,Chennai";
		String [] split_word = name.split(" ");
		for (int i = split_word.length-1; i >= 0; i--) {
			String out = split_word[i].toLowerCase();
			System.out.print(out+" ");
			
		}

	}

}
