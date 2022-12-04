import java.util.Scanner;

// Exercise 2 class
public class Exercise2 {

    // Recursive static method countdown with an argument of integer n
    public static void countDown(int n) {
        //  prints the numbers down to 1 from n followed by printing ‘BlastOff!’
        if (n == 0) {
            System.out.println("BlastOff!");
        } else {
            System.out.print(n+"\t");
            countDown(n-1);
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompting the user to enter the integer value and counting it down until 1 followed by string value
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        countDown(n);

    }
}
