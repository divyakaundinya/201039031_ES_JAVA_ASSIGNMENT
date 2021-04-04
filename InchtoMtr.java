import java.util.Scanner;
 
public class InchtoMtr
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the length in inches :"); 
    	int inch = sc.nextInt();
        
        double mtr = inch/39.37;

        System.out.printf("the length in metre is: %2f",mtr);
    }
}
