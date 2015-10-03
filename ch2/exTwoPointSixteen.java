package javaLab.ch2;
// ex 2.16
/*
    (Comparing Integers) Write an application that asks the user to enter two integers,
    obtains them from the user and displays the larger number followed by the words "is larger".
    If the num- bers are equal,print the message"These numbers are equal".UsethetechniquesshowninFig. 2.15.
*/

// Library files block start
import java.util.Scanner;
// Library files block end

public class exTwoPointSixteen{ // class body start

    public static void main(String[] args){ // main method body start

        // Scanner object
        Scanner input = new Scanner(System.in);

        //initializing variables
        int userIntOne;
        int userIntTwo;

        // getting first value from user and assigning to variable
        System.out.print("Enter first Integer value: ");
        userIntOne      = input.nextInt();

        // getting second value from user and assigning to variable
        System.out.print("Enter second Integer value: ");
        userIntTwo      = input.nextInt();

        // Larger value condition
        if(userIntOne > userIntTwo){
            System.out.printf("%d is larger", userIntOne);
        }
        if(userIntTwo > userIntOne){
            System.out.printf("%d is larger", userIntTwo);
        }

        //Equal value condition
        if(userIntTwo == userIntOne){
        System.out.printf("These numbers are equal");
        }
        input.close();
    }// main method body end

}//class body end
