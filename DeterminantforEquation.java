class DeterminantforEquation{
	static 	int size = 3;
	static int[][] matrix = new int[5][5];
	static	int k = 0;
	
	public static void initialize_matrix(){
		int i, j;
		for(i = 0; i < size; i++){
			for(j = 0 ; j < size; j++){
				matrix[i][j] = k;
				k++;
			}
		}
	}
	
	public static double determinant(int i, int j){
		double determinant = 0;
		for(; i < size; i++){
			if((i % 2) == 0){
				determinant = determinant + ((minor(i,j))*matrix[i][j]);
			}
			else{
				determinant = determinant - ((minor(i,j))*matrix[i][j]);
			}
		}
		return determinant;
	}
	
	public static double minor(int i, int j){
		double answer =0;
		if((size - j )>3){
			
		}
		else{
			answer = matrix[(i + 1)%3][(j+1)%3] * matrix[(i + 2)%3][(j+2)%3] - matrix[(i + 2)%3][(j+1)%3] * matrix[(i + 1)%3][(j+2)%3];
		}
		return answer;
		
	}
	
	public static void main(String args[]){
		
		initialize_matrix();
		System.out.println("Determinant of matrix : "+determinant(0,0));
	}
}