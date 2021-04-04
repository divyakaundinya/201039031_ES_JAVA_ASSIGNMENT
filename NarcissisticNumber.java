import java.lang.Math;

class NarcissisticNumber{
	
	static boolean isNarcissistic(int number){
		int length = String.valueOf(number).length();
		int i, sum = 0, digit;
		int temp = number;
		while(number > 0){
			digit = number % 10;
			number = number /10;
			sum = sum + (int)Math.pow(digit, length);
		}
		if(sum == temp){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		int j;
		for(j = 1; j <= 1000; j++){
			if(isNarcissistic(j)){
				System.out.println(j);
			}
		}
	}
}
