import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print(&quot;Enter the first number: &quot;);
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print(&quot;Enter the second number: &quot;);
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println(&quot;The sum of &quot; + num1 + &quot; and &quot; + num2 + &quot; is: &quot; + sum);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}

}
#vivekconflict change the code

import java.io.*;

class GFG {
    public static void main (String[] args) {
        System.out.println(&quot;GFG!&quot;);
    }
}