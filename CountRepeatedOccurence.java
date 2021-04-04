class CountRepeatedOccurence{
	public static void main(String args[]){
		int number = 4556835;
		int checkDigit = 5;
		int count = 0;
		int digit;
		while(number > 0){
			digit = number % 10;
			if(checkDigit == digit){
				count++;
			}		
			number = number / 10;
		}
		System.out.println("count of "+checkDigit+" : "+count);
	}
}