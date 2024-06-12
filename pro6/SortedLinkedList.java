/**
 * Instructions for running the program and generating Javadocs:
 * 
 * To compile and run the program from the command line:
 * 1. Open your terminal or command prompt.
 * 2. Navigate to the directory containing the SortedLinkedList.java file.
 * 3. Compile the program using the following command:
 *    javac SortedLinkedList.java
 * 4. Run the program using the following command:
 *    java SortedLinkedList
 * 
 * To generate Javadocs:
 * 1. Open your terminal or command prompt.
 * 2. Navigate to the directory containing the SortedLinkedList.java file.
 * 3. Generate the Javadocs using the following command:
 *    javadoc SortedLinkedList.java
 * 4. This will create an "index.html" file in the current directory. Open this file in your web browser to view the Javadocs.
 */


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * The SortedLinkedList program implements an application that
 * reads a list of integers from standard input, stores them in a LinkedList,
 * sorts the list in ascending order, and then prints the sorted list.
 * <p>
 * This program demonstrates the use of the Collections Framework to handle
 * basic list operations such as adding elements and sorting.
 * </p>
 * 
 * <p>Usage:</p>
 * <pre>
 * java SortedLinkedList
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
 * Sorted list:
 * 1
 * 3
 * 5
 * 8
 * </pre>
 * 
 * <p>Java Version: 22.0.1</p>
 * <p>Author: John Drexler</p>
 * <p>Date: May 30, 2024</p>
 * 
 * <p>This program effectively demonstrates code reuse by leveraging the existing functionality 
 * provided by the Java Collections Framework. The use of <code>LinkedList</code> allows the program to 
 * utilize built-in methods for adding elements to the list and the <code>Collections.sort()</code> 
 * method enables sorting without the need to implement a custom sorting algorithm. By using these 
 * standard library features, the program avoids reinventing the wheel and ensures that the implementation 
 * is efficient and reliable.</p>
 */

public class SortedLinkedList {
    
     /**
     * The main method is the entry point of the program.
     * It reads integer inputs from the user, stores them in a LinkedList,
     * sorts the list, and prints the sorted list.
     *
     * @param args Command line arguments (not used).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (type 'end' to finish):");

        // Read integers from the input until 'end' is typed
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("end")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer or type 'end' to finish:");
                }
            }
        }

        // Sort the LinkedList
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}

