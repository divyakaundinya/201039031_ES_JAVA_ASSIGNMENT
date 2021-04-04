class HammingNumbers{
	public static void main(String args[]){
		int number = 2, numberCopy;
		int count = 0;
		System.out.println("Hamming numbers");
		System.out.println(1);
		while(count < 20){
			numberCopy = number;
			while(number % 2 == 0){
				number = number / 2;
			}
			while(number % 3 == 0){
				number = number / 3;
			}
			while(number % 5 == 0){
				number = number / 5;
			}
			if( number == 1){
				System.out.println(numberCopy);
				count++;
			}
			
			number = numberCopy;
			number++;
		}			
	}
}