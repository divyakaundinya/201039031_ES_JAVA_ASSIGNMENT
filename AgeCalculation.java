class AgeCalculation{

	void age(int i, int s)
	{
		int c = i+s-s-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu's age is "+c);
	}

	public static void main(String[] args) {
		
		AgeCalculation obj = new AgeCalculation();
		obj.age(14,11);
	}
}