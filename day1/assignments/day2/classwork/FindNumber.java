package week1.day2.classwork;

public class FindNumber {

	public static void main(String[] args) {
		String name = "Amazon has 11400 employees in chennai";
		String res = name.replaceAll("[^0-9]", "");
		System.out.println(res);


	}

}
