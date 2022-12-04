import java.util.Scanner;

// Exercise 3 class
public class Exercise3 {

    // Recursive static method multiples with an argument of integer n and m
    public static void multiples(int n, int m) {
        // for loop prints the multiples from given values
        for(int i=1; i <= m; i++) {
            // if enters last removes comma
            if (i == m) {
                System.out.print(n*m);
            } else {
                System.out.print(n*i+", ");
            }
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompting the user to enter the integer value
        System.out.println("Enter a value: ");
        int n = in.nextInt();
        System.out.println("How many multiples do you want?");
        int m = in.nextInt();
        System.out.println();

        // Output
        System.out.println("The first "+m+" multiples of "+n+" are:");
        multiples(n,m);
    }
}
