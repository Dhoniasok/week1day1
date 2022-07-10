package week1.day1;

public class Isprimenumber {

	public static void main(String[] args) {
		
		int n = 30 ;
		
		for(int i = 2; i <= n-1; i ++)
		{
			if(n%i !=0)
			{
				System.out.println("Is a prime number");
			}
			else
				if(n%i ==0)
				{
					System.out.println("Is not a prime number");
				}
			break;
		}
	}
}
