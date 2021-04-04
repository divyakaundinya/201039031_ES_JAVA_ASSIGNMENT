import java.lang.Math;

class MersenneNumber{
	public static void main(String args[]){
		int number = 255;
		double temp = Math.log(number + 1)/Math.log(2);
		if( temp == (int) temp ){
			System.out.println("It is a Mersenne number");
	}
}
}