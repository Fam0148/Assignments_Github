package Day5;

public class Variables 
{
	public static void main (String args[])
	{
		byte byteMax = 127;
		byte byteMin = -128;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		short shortMax = 32767;
		short shortMin = -32768;
		int max = 2147483647;
		int min = -2147483648;
		System.out.println(max);
//-------------------------------------------------------------------------------------//
		int output = 5/3;
		float output_1 = 5f/3f;
		double output_2 = 5f/32f;
		System.out.println(output);
		System.out.println(output_1);
		System.out.println(String.format("%.2f",output_2));
//-------------------------------------------------------------------------------------//		
		boolean var = true;
		System.out.println(var);
		char var1 = '\u00Af';
		System.out.println(var1);
//---------------------------------------------------------------------------------------
	}
}
