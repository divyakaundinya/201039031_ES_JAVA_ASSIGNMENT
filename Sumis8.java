class Sumis8{

	public static void main(String args[]){
		int a, b;
		int number;
		int sum = 0;
		for(b = 1 ; b < 1000; b++){
			a = b;
			sum = 0;
			while(a > 0){
				number = a % 10;
				a = a / 10;
				sum = number + sum;
			}

			if(sum == 8){
				System.out.println("Sum is 8 in the number: "+b); 	
			}
		}
	}
}