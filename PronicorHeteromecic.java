class PronicorHeteromecic{
	public static void main(String args[]){
		int number = 91;
		int i;
		for( i = 1; i < number; i++){
			if((number % i) == 0){
				if((number % (i + 1))== 0){
					System.out.println("Number is pronic");
					return;
				}
			}
		}
		System.out.println("Number is not pronic");
	}
}