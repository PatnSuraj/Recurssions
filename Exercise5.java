import java.util.Scanner;
// class Exercise5
public class Exercise5 {
    // static recursive method countdown2 holds one integer argument
    public static void countDown2(int n) {
        // prints "BlastOff!" if n is equal to 0 for even or -1 for odd
        if (n == 0 || n == -1) {
            System.out.print("BlastOff!");
        // else if condition to check if n is even
        } else if (n % 2 == 0) {
            System.out.print(n+"\t");
            // recursive call
            countDown2(n-2);
        // else condition to check if n is odd
        } else {
            System.out.print(n+"\t");
            // recursive call
            countDown2(n-2);
        }
    }

    // main method
    public static void main(String[] args) {
        // Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        // Input
        int n = in.nextInt();
        countDown2(n);

    }

}
