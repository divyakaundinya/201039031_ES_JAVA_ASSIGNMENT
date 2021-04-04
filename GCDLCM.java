import java.util.Scanner;

public class GCDLCM{
	
   public static void main(String args[]){
      int temp1, temp2, num1, num2, temp, gcd, lcm;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First Number: ");
      num1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      num2 = scanner.nextInt();
      scanner.close();

      temp1 = num1;
      temp2 = num2;

      while(temp2 != 0){
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
      }

      gcd = temp1;
      lcm = (num1*num2)/gcd;

      System.out.println("HCF of input numbers: "+gcd);
      System.out.println("LCM of input numbers: "+lcm);
   }
}