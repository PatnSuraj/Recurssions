import java.util.Scanner;
// class Exercise6
public class Exercise6 {
    // static recursive method writeVertical holds one integer argument
    public static void writeVertical(int n) {
        // if condition checks the n value given by user is greater than zero and implements the condition
        if(n == 0) {
            return;
        } else {
            int remainder = n%10;
            // recursive call
            writeVertical(n/10);
            System.out.println(remainder);
        }
    }

    // main method
    public static void main(String[] args) {
        // Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        // Input
        int n = in.nextInt();
        writeVertical(n);
    }
}