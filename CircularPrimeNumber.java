class CircularPrimeNumber{
	static boolean isPrime(int number){
		int i;
		for(i = 2; i < number; i++){
			if((number % i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int number = 21100;
		int length = String.valueOf(number).length();
		int mask = 1, i;
		int digit;
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}
		
		for(i = 0; i < length; i++){
			digit = number % 10;
			number = number / 10;
			number = (digit * mask) + number;
			if(!(isPrime(number))){
				System.out.println("The number is not circular prime");
				return;
			}
		}
		System.out.println("The given number is circular prime");
	}
}