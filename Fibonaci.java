package week1.day1;

public class Fibonaci {

	public static void main(String[] args) {
		
		int a = 0 ;
		int b = 1 ;
		int c = 0 ;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			a = b ;
			b = c ;
			c = a + b ;
			
			System.out.println(c);
		}
	}

}
