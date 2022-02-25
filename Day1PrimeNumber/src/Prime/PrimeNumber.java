package Prime;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String args[])
	{
		System.out.print("Enter a Number ");
		Scanner Input = new Scanner(System.in);
		int Number = Input.nextInt();
		int TotalDivisible = 0;
		for (int i=1;i<=Number;)
		{
			if (Number%i == 0)
			{
				TotalDivisible++;
			}
			i++;
		}
		if (TotalDivisible == 2)
		{
			System.out.print(Number + " Is Prime Number");
		}
		else {
			System.out.print(Number + " Is Not Prime Number");
		}
	}
}


