class KeithNumber{
	public static void main(String args[]){
		int number = 129;
		int temp = number;
		int[] array1 = new int[100];
		int[] array2 = new int[100];
		int length = String.valueOf(number).length();
		int sum = 0, i, j = 0; 
		for(i = 0; number > 0; i++){
			array1[i] = number % 10;
			number = number / 10;
		}
		i--;
		while(i >= 0){
			array2[j] = array1[i];
			i--; j++;
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = array2[j - i] + sum;
			}
			j++;
			array2[j] = sum;
			
			if(sum == temp){
				System.out.println("It is a Keith number");
				return;
			}
		}
		System.out.println("It is not a Keith number");

	}
}