// class Exercise4
public class Exercise4 {
    // static recursive method fib holds one integer argument
    public static int fib(int n) {
        // base case
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            // recursive call
            return fib(n-1)+fib(n-2);
        }
    }


    // main method
    public static void main (String args[]) {
        // for loop to print the first 20 numbers in fibonacci series
        for(int i = 0;i < 20;i++) {
            if(i == 19) {
                System.out.println(fib(i));
            } else {
                System.out.print(fib(i)+", ");
            }
        }
    }
}
