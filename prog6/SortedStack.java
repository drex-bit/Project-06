import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * Instructions for running the program and generating Javadocs:
 * 
 * To compile and run the program from the command line:
 * 1. Open your terminal or command prompt.
 * 2. Navigate to the directory containing the SortedStack.java file.
 * 3. Compile the program using the following command:
 *    javac SortedStack.java
 * 4. Run the program using the following command:
 *    java SortedStack
 * 
 * To generate Javadocs:
 * 1. Open your terminal or command prompt.
 * 2. Navigate to the directory containing the SortedStack.java file.
 * 3. Generate the Javadocs using the following command:
 *    javadoc SortedStack.java
 * 4. This will create an "index.html" file in the current directory. Open this file in your web browser to view the Javadocs.
 */

/**
 * The SortedStack program implements an application that
 * reads a list of integers from standard input, stores them in a Stack,
 * sorts the stack in ascending order, and then prints the sorted stack.
 * <p>
 * This program demonstrates the use of the Collections Framework to handle
 * basic stack operations such as pushing elements and sorting.
 * </p>
 * 
 * <p>Usage:</p>
 * <pre>
 * java SortedStack
 * </pre>
 * 
 * <p>Example:</p>
 * <pre>
 * Enter integers (type 'end' to finish):
 * 5
 * 3
 * 8
 * 1
 * end
 * Sorted stack:
 * 1
 * 3
 * 5
 * 8
 * </pre>
 * 
 * <p>Java Version: 22.0.1</p>
 * <p>Author: John Drexler</p>
 * <p>Date: June 4, 2024</p>
 * 
 * <p>This program effectively demonstrates code reuse by leveraging the existing functionality 
 * provided by the Java Collections Framework. The use of <code>Stack</code> allows the program to 
 * utilize built-in methods for adding elements to the stack and the <code>Collections.sort()</code> 
 * method enables sorting without the need to implement a custom sorting algorithm. By using these 
 * standard library features, the program avoids reinventing the wheel and ensures that the implementation 
 * is efficient and reliable.</p>
 * 
 * <p><b>Maintenance Task:</b> This program was originally implemented using a <code>LinkedList</code>
 * to store the integers. As part of a maintenance task, the data structure was switched to a 
 * <code>Stack</code> to better align with the application's requirements of LIFO (Last-In-First-Out) 
 * access pattern. This change leverages the <code>Stack</code> class's built-in methods and improves 
 * code clarity and performance for stack-specific operations.</p>
 */
 
public class SortedStack {

    /**
     * The main method is the entry point of the program.
     * It reads integer inputs from the user, stores them in a Stack,
     * sorts the stack, and prints the sorted stack.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store the integers
        Stack<Integer> numbers = new Stack<>();

        // Prompt the user to enter integers
        System.out.println("Enter integers (type 'end' to finish):");

        // Read integers from the input until 'end' is typed
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Push the integer onto the stack
                numbers.push(scanner.nextInt());
            } else {
                // Read the next input which is not an integer
                String input = scanner.next();
                if (input.equalsIgnoreCase("end")) {
                    // Exit the loop if the user types 'end'
                    break;
                } else {
                    // Prompt the user to enter a valid integer or 'end'
                    System.out.println("Please enter a valid integer or type 'end' to finish:");
                }
            }
        }

        // Close the scanner to release the resource
        scanner.close();

        // Sort the Stack in ascending order
        Collections.sort(numbers);

        // Print the sorted stack
        System.out.println("Sorted stack:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

