class PalindromeNumber{
	public static void main(String args[]){
		int number = 1234;
		int temp = number;
		int digit, ReversedNumber = 0;
		while(temp > 0){
			digit = temp % 10;
			temp = temp / 10;
			ReversedNumber = (ReversedNumber * 10) + digit;
		}
		if(ReversedNumber == number){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	
	}
}