package week1.day1.assignment;

public class IsPrime {
	public static void main(String[] args) {
		int n = 20,count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1) {
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}

}


