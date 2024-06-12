# Project-06
Overview
This project contains two Java programs that demonstrate sorting of integers using different data structures from the Java Collections Framework: SortedLinkedList and SortedStack. The SortedLinkedList program uses a LinkedList to store and sort integers, while the SortedStack program uses a Stack for the same purpose. Both programs read a list of integers from standard input, sort them in ascending order, and then print the sorted list.

Instructions
Running the Programs
To run the SortedLinkedList program, open your terminal or command prompt and navigate to the directory containing the SortedLinkedList.java file. Compile the program using the command javac SortedLinkedList.java and then run it using the command java SortedLinkedList.
Similarly, for the SortedStack program, navigate to the directory containing the SortedStack.java file, compile it with the command javac SortedStack.java, and run it using the command java SortedStack.

Generating Javadocs
To generate Javadocs for either program, open your terminal or command prompt and navigate to the directory containing the respective .java file. Use the command javadoc SortedLinkedList.java or javadoc SortedStack.java to generate the documentation. This will create an index.html file in the current directory, which you can open in your web browser to view the Javadocs.
Usage
To run the programs, simply execute the compiled .class file. You will be prompted to enter integers, and typing 'end' will finish the input and display the sorted output. For example, running java SortedLinkedList or java SortedStack will start the respective program, prompting you to enter integers and then displaying the sorted list or stack after you type 'end'.

Author and Date
The programs were authored by John Drexler. The SortedLinkedList program was completed on May 30, 2024, and the SortedStack program was completed on June 4, 2024. Both programs were developed using Java Version 22.0.1.

Maintenance Notes
The SortedStack program was originally implemented using a LinkedList to store the integers. As part of a maintenance task, the data structure was switched to a Stack to better align with the application's requirements of LIFO (Last-In-First-Out) access pattern. This change leverages the Stack class's built-in methods and improves code clarity and performance for stack-specific operations.

This README provides a comprehensive guide for running, using, and understanding the project. The documentation ensures that anyone can easily follow along and work with the provided code, whether for educational purposes or further development.
