package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String rev = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			rev = rev+charArray[i];
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
