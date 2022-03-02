package Fibonacci;
import java.util.*;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		int fNumber=7;
		fibonacci(fNumber);
	}
		public static void fibonacci(int fn)
		{
			int sn=1,r=0;
		for(int i=1;i<=fn;i++)
		{
			System.out.println(sn);
			int add = sn+r;
			r=sn;
			sn=add;
		}
	}
}

