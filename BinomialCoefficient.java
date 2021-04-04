class BinomialCoefficient{

	static int binomialCoeff(int n, int k){
		if(k > n)
			return 0;
		if(k == 0 || k == n)
			return 1;
		
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n -1, k);
	
	}
	public static void main(String args[]){
		int n = 6, k = 3;
		System.out.printf("value of coeff(%d, %d) is %d", n, k, binomialCoeff(n, k));	
	}
}