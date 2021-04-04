class RecursiveMultiplication{
	double product(double x, double y){
		if(y == 0){
			return 0;
		}
		else{
			return (x + product(x, y - 1));
		}
		
	}
	public static void main(String args[]){
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[1]);
		RecursiveMultiplication obj = new RecursiveMultiplication();
		System.out.println("product is : "+obj.product(number1,number2));
	}
}