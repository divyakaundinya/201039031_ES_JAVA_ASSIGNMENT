class PellNumbers{
	public static void main(String args[]){
		int number1 = 0;
		int number2 = 1;
		int number3;
		int i;
		System.out.println(number1);
		System.out.println(number2);
		for( i = 0; i < 13; i++){
			number3 = (2 * number2) + number1;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
		}
	}
}