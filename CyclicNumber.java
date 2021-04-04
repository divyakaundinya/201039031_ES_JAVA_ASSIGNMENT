class CyclicNumber{
	public static void main(String args[]){
		int number = 233798;
		int temp = number;
		int count = 0;
		int length = String.valueOf(number).length();
		int mask = 1, i, j;
		int digit;
		
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}

		for(i = 0; i < length; i++){
			digit = number % 10;
			number = number / 10;
			number = (digit * mask) + number;
			
			for(j = 1; j <= length; j++)
			{
				if(number == (temp * j)){
					count++;
				}
			}
		}
		if(count == length){
			System.out.print("The number is cyclic");
		}
		else{
			System.out.print("The number is not cyclic");
		}
		
	}
}