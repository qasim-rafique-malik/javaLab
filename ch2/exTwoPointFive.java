package javaLab.ch2;
/*  solving exercise 2.5
*/
// java library importer block start
import java.util.Scanner;
//java library importer block end

public class exTwoPointFive {// class body start

    // main function or the entering point
    public static void main(String[] args) {//main function body start

        //part a) State that a program will calculate the product of three integers.
        //The program will calculate the product of three integers.

        //part b) Create a Scanner called input that reads values from the standard input.
        Scanner input = new Scanner(System.in);

        //part c) Declare the variables x, y, z and result to be of type int.
        int x;
        int y;
        int z;
        int result;

        //part d) Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");

        //part e) Read the first integer from the user and store it in the variable x.
        x        = input.nextInt();

        //part f) Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");

        //part g) Read the second integer from the user and store it in the variable y.
        y        = input.nextInt();

        //part h) Prompt the user to enter the third integer.
        System.out.print("Enter the third integer: ");

        //part i) Read the third integer from the user and store it in the variable z.
        z        = input.nextInt();

        //part j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.
        result  = x * y * z;

        //part k) Display the message "Product is" followed by the value of the variable result.
        System.out.printf("%s%d","Product is ", result);

        input.close();
    }// main function body end


}// class body end
