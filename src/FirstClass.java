import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

 while (true) {
     try {
         System.out.println("Enter numerator");
         int numerator = sc.nextInt();
         System.out.println("Enter denominator");
         int denominator = sc.nextInt();
         System.out.println("result : "+ numerator/denominator);
         break;

     } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero");
     } catch(java.util.InputMismatchException e) {
         System.out.println("Please enter a valid input !");
         sc.next();
     }
 }
    }
}