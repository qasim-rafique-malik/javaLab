package javaLab.ch2;
//2.25
/*(Odd or Even) Write an application that reads an integer and determines and prints whether
it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
of 2 leaves a remainder of 0 when divided by 2.]*/

//Library files body start
import java.util.Scanner;
//Library files body end
public class exTwoPoint25 {// class body start
    public static void main(String[] args) {// main method body start

        Scanner input   = new Scanner(System.in);

        //declaring variables
        int userIntVal;

        // initializing variable
        System.out.print("Enter value : ");
        userIntVal      = input.nextInt();

        if((userIntVal%2) == 0){
            System.out.printf("%d is even" , userIntVal);
        }
        else{
            System.out.printf("%d is odd" , userIntVal);
        }

        input.close();

    }//main method body end
}// class body end