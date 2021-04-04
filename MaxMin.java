import java.util.Scanner;

public  class MaxMin{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int max,min;

		if(num1>num2)
		{
			max=num1;
			min=num2;
		}
		else
		{
			max=num2;
			min=num1;
		}

		System.out.printf("maximum number is %d\n",max);
		System.out.printf("minimum number is %d",min);
	}
}