package Tables;
import java.util.*;
public class Multiplication 
{
	public static void main(String args[])
	{
	int EndNumber = 10;
	System.out.print("Enter the Number ");
	Scanner Input = new Scanner(System.in);
	int Number = Input.nextInt();
	for(int i=1;i<=EndNumber;i++)
	{
		System.out.println(i + "*" + Number + "=" +(Number*i));
	}
	}
	
}
