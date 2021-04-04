import java.lang.Math;
class CubeNumber{
	public static void main(String args[]){
		int number = 27;
		int n = (int) Math.round(Math.pow(number, 1.0/3.0));
		if(number ==(n*n*n)){
			System.out.print("The given number is a perfect cube");
		}
		else{
			System.out.print("The number is a not a perfect cube");
		}
	}
}