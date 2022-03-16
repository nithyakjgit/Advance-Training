import java.util.Scanner;

class GFG {
  
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        //int num1 = 0, num2 = 1;
  
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");

        System.out.print("Enter num2:");
        int num1=scan.nextInt();

        int num2=scan.nextInt();
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
  
    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 15;
  
        // Function Call
        Fibonacci(N);
    }
}