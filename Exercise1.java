import java.util.Scanner;

// Exercise 1 class
public class Exercise1 {

    // Recursive static method factorial with an argument of integer n
    public static int factorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // returns the factorial of the values
        return n*factorial(n-1);
    }


    // Recursive static method power with an argument of integer x and n
    public static int power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // returns the result base to the power of exponent
        return power(x,n-1)*x;
    }

    // main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompting an user to enter x and n
        System.out.print("Enter the base: ");
        int x = in.nextInt();
        System.out.print("Enter the exponent: ");
        int n = in.nextInt();
        System.out.println();

        // for loop to print the factorials of the integer 1 through 10
        System.out.println("Factorials");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i+"! = "+factorial(i));
        }
        System.out.println();
        // prints the result of x to the power of n
        System.out.println(x+" to the power of "+n+" is "+power(x,n));
    }
}
