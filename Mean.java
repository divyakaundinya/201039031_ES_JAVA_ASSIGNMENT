import java.util.Scanner;

public class Mean
{
	public static void main (String  args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 number\n");
		int n1 = sc.nextInt();	
		int n2 = sc.nextInt();	
		int n3 = sc.nextInt();	
		int n4 = sc.nextInt();	
		int n5 = sc.nextInt();	


		int mean=(n1+n2+n3+n4+n5)/5;

		System.out.printf("mean of 5 numbers: %d",mean);
	}
}