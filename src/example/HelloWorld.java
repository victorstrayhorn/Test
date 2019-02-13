package example;

import java.util.Scanner;

    public class HelloWorld {

        public static void main (String[] args) {  // Main Method

            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Username");

            String userName = userInput.nextLine();

            System.out.println("Hello World");    //This will print Hello World when ran

    } // End of main method

}  //End of class
