package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String name = "shanmugapriya";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
				
				System.out.print(Character.toUpperCase(charArray[i]));
				
			}
			else
			{
				System.out.print(Character.toLowerCase(charArray[i]));
			}
			
		}
	}
	 
	 
	

}
