package Palindrome;
import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		System.out.print("Enter the String ");
		Scanner input = new Scanner(System.in);
		String palindrome = input.nextLine();
		boolean b = checkPalindrome(palindrome);
		if (b == true)
		{
			System.out.print(palindrome + " Is Palindrome");
		}else {
			System.out.print(palindrome + " Is Not Palindrome");
		}
		}
	public static boolean checkPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)== str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
	return true;
	}
}