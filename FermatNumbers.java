import java.lang.Math;

class FermatNumbers{
	public static void main(String args[]){
		int i;
		double number;
	
		for( i = 0; i < 10; i++){
			number = Math.pow(2, Math.pow(2, i)) + 1.0;
			System.out.println(number);
		}
	}
	
}