class PowerofNumber{
	public static void main(String args[]){
		int power = 7;
		int base = 3;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			System.out.println(temp);
			power--;
		}
		System.out.println("Ans : " + temp);
	}
}