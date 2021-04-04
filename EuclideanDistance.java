import java.lang.Math;

class EuclideanDistance{
	public static void main(String args[]){
		int x1= 7;
		int x2 = 12;
		int y1 = 9;
		int y2 = 8;
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance : " + distance);
	}
}