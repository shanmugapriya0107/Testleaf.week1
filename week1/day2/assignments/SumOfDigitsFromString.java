package week1.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String str = "Tes12Le79af65";
		int sum=0;
		String txt = str.replaceAll("[^0-9]", "");
		char[] charArray = txt.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			sum = sum+Character.getNumericValue(charArray[i]);

		}
		System.out.println("Sum of Digits from the String:" +sum);

	}

}
//FOR INTERVIEW PERSPECTIVE
/*String str = "Tes12Le79af65";
int sum=0;
String txt = str.replaceAll("[^0-9]", "");
int parseInt = Integer.parseInt(txt);
while(parseInt>0) {
	int rem=parseInt%10;
	sum=sum+rem;
	parseInt=parseInt/10;
}
System.out.println("Sum of Digits from the String:" +sum);
*/

