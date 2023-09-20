package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number n: ");
		int n = in.nextInt();
		
		boolean[] sieve = new boolean[n];

		
		
		//System.out.println(sieve[0]);
		for (int i = 2; i < sieve.length; i++)
		{
			sieve[i] = true;
			
		}
		for(int i=2; i < Math.sqrt(n); i++)
		{
			for(int j = i * i; j < n; j = j+i)
			{
			sieve [j] = false;
			}
		}
		for (int i = 2; i < n; i++)
		{
			if (sieve[i])
			{
				System.out.println(i);
			
			}
		}

		
	}

}










