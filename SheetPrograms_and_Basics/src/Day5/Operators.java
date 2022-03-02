package Day5;

public class Operators {
	public static void main(String args[])
	{
		int a=10,b=15;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
//--------------------------------------------------------------------------------------------------------------
		if(a>=b)
		{
			System.out.println("A is Greater");
		}else 
		{
			System.out.println("B is Greater");
		}
		if(a>=10 && b<20)
		{
			System.out.println("Given Input is Correct");
		}else
		{
			System.out.println("Given is Incorrect");
		}
		String name = "jk";
//-------------------------------------------------------------------------------------------------------------
		switch (name.toLowerCase()) 
		{
		case "sherlock":
			System.out.println("Holmes");
			break;
		case "Hero":
			System.out.println("RDJ");
			break;
		case "Straming":
			System.out.println("Star & HBO");
			break;
		default:
			System.out.println("No movies");
			break;
	}
//--------------------------------------------------------------------------------------------------------------
		while(a!=b) {
			System.out.println("True");
			a++;
		}
//---------------------------------------------------------------------------------------------------------------
}
}
