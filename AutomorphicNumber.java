class AutomorphicNumber{
	public static void main(String args[]){
		double number = 91;
		double temp = number;
		double SquareNumber = number * number;
		double mask = 1;
		double lastDigits;
		int length = String.valueOf(number).length();
		
		int i;
		for( i = 0; i < length - 2 ; i++){
			mask = mask * 10;
		}		
		lastDigits = SquareNumber % mask;
		if(temp == lastDigits){
			System.out.println("Number is automorphic");
		}
		else
		{
			System.out.println("Number is not automorphic");
		}
	}
}