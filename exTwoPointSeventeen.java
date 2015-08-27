// ex 2.17
/*
    2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user
    and displays the sum,average,product,smallest and largest of the numbers.
    Use the techniques shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
    representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333�.]
*/
// Library files body start
import java.util.Scanner;
//Library files body end
public class exTwoPointSeventeen {// class body start

    public static void main(String[] args) { //method main body start

        // scanner object for data input
        Scanner input   = new Scanner(System.in);

        //Initializing variables block start
        int userIntOne;
        int userIntTwo;
        int userIntThree;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;
        int userTotalInput  = 3;
        //Initializing variable block end


        // getting first value from user and assigning to variable
        System.out.print("Enter first Integer value: ");
        userIntOne      = input.nextInt();

        // getting second value from user and assigning to variable
        System.out.print("Enter second Integer value: ");
        userIntTwo      = input.nextInt();

        // getting second value from user and assigning to variable
        System.out.print("Enter second Integer value: ");
        userIntThree      = input.nextInt();

        //Sum of all user input
        sum             = userIntOne + userIntTwo + userIntThree;

        //Average of all user input
        average         = sum/userTotalInput;

        //Product of all user input
        product         = userIntOne * userIntTwo * userIntThree;

        // largest number logic;
        if(userIntOne > userIntTwo){
            if(userIntOne > userIntThree){
                System.out.printf("%d is largest", userIntOne)
            }
            else{
                System.out.printf("%d is largest", userIntThree);
            }
        }
        else
        {
            if(userIntTwo > userIntThree){
                System.out.printf("%d is largest", userIntTwo);
            }
            else{
            System.out.printf("%d is largest", userIntThree)
            }
        }


        //test drive
        System.out.printf("sum = %d and average = %d and product = %d", sum, average, product);








    } //method main body end

}// class body end