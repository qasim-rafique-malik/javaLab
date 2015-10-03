package javaLab.ch2;
/* solution of 2.15
    the following code is for simple calculator that will work under two integer
*/

// Library file block start
import java.util.Scanner;
// Library file block end

public class exTwoPointFifteen{//class body start

    public static void main(String[] args){// main method body start

        Scanner input = new Scanner(System.in);

        // variable initialization  start
        int userValOne;
        int userValTwo;
        int sum;
        int difference;
        int product;
        int division;
        // variable initialization  end

        // getting and storing first value
        System.out.print("Enter first value :");
        userValOne      = input.nextInt();

        // getting and storing second value
        System.out.print("Enter second value :");
        userValTwo      = input.nextInt();

        // computing sum
        sum         = userValOne + userValTwo;

        //computing difference
        difference  = userValOne - userValTwo;

        //computing product
        product     = userValOne * userValTwo;

        //computing division
        division    = userValOne / userValTwo;

        // prompting sum to user
        System.out.printf("%s%d\n", "sum is = ", sum);

        // prompting difference to user
        System.out.printf("%s%d\n", "difference is = ", difference);

        // prompting product to user
        System.out.printf("%s%d\n", "product is = ", product);

        // prompting division to user
        System.out.printf("%s%d\n", "division is = ", division);

        input.close();
    }// main method body end

}//class body end