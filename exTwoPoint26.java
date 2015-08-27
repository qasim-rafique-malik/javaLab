// 2.6
/*
    (Multiples) Write an application that reads two integers, determines whether the first is a
    multiple of the second and prints the result. [Hint: Use the remainder operator.]
*/

//Library files block start
import java.util.Scanner;
//Library files block end

public class exTwoPoint26 {// class block start
    public static void main(String[] args) { // main method block start

        // creating object
        Scanner input       = new Scanner(System.in);

        //declaring variables
        int userIntOne;
        int userIntTwo;

        //getting first user input and storing it in variable
        System.out.print("Enter first value : ");
        userIntOne      = input.nextInt();

        //getting second user input and storing it in variable
        System.out.print("Enter second value : ");
        userIntTwo      = input.nextInt();

        // finding the first is a multiple of the second or not
        if((userIntOne%userIntTwo) == 0){
            System.out.printf("\n%d is the multiple of %d\n", userIntOne, userIntTwo);
        }
        else{
            System.out.printf("\n%d is not the multiple of %d\n", userIntOne, userIntTwo);
        }


    } // main method block end
} // class block end