class SpeedDisplay{
	public static void main(String args[]){
		double distance = 400;
		int seconds = 50;
		int minutes = 34;
		int hours = 1;
		
		double totalSeconds= (double)(seconds + (minutes * 60) + ( hours * 60 * 60));
		double mps = distance/ totalSeconds;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println("mps : "+mps+"  kmph : "+kmph+"  mph : "+mph); 
		
	}
}