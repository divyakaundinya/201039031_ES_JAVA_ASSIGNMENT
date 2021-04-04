import java.util.Scanner;
//import java.lang.Math;
 
public class BodyMassIndex
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in Kg :");
        int weight = sc.nextInt();

        System.out.println("Enter the height in metre :");
        double height = sc.nextDouble();

        double bmi=weight/(height*height);

        System.out.printf("the BMI is: %2f", bmi);
    }
}