class HarshadNumber{
	public static void main(String args[]){
		int number = 123;
		int temp = number;
		int sum = 0;
		int digit;
		while(number > 0){
			digit = number % 10;
			number = number / 10;
			sum = sum + digit;
		}
		if((temp % sum) == 0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("Not a Harshad number");
		}
	}
}