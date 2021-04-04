class AmicableNumber{
	public static void main(String args[]){
		int number1 = 361;
		int number2 = 442;
		int i, sum1 = 0, sum2 = 0;
		for( i = 1; i < number1; i++){
			if((number1 % i) == 0){
				sum1= sum1 + i;
			}
		}
		for( i = 1; i < number2; i++){
			if((number2 % i) == 0){
				sum2 = sum2 + i;
			}
		}
		if(( sum1 == number2) && (sum2 == number1)){
			System.out.println("Amicable numbers");
		}
		else{
			System.out.println("Not Amicable numbers");
		}
		
	}
}