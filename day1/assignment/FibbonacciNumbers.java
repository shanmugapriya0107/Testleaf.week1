package week1.day1.assignment;

public class FibbonacciNumbers {
	public static void main(String[] args) {
		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum);
		for(int i=1; i<=10;i++)
		{
			sum = firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
			System.out.println(sum);
		}
	}

}
