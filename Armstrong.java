public class Armstrong
{
	public static void main (String  args[])
	{
		int num = 153;

		int rem, res = 0;
		int number = num;
		while(num !=0)
		{
			rem = num % 10;
            res += rem*rem*rem;
            num /= 10;
		}

		if(res == number)
		{
			System.out.println(number + " is an armstrong number");
		}
		else
		{
			System.out.println(number +" is not an armstrong number");
		}
	}
}
