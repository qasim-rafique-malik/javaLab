package javaLab.ch6.SixPoint8;

//importing library
import java.util.Random;

public class Craps {
	
	private static final Random randNum = new Random();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES 		= 2;
	private static final int TREY 			= 3;
	private static final int SEVEN 			= 7;
	private static final int YO_LEVEN 		= 11;
	private static final int BOX_CARS 		= 12;
	
	
	public static void main(String[] args){//main block start
		
		// new type variable 
		Status gameStatus;
		
		//primitive type variables
		int myPoint 		= 0;
		int sumOfDice 		= rollDice();
		
		switch(sumOfDice){//switch block start
			case SEVEN:
			case YO_LEVEN:
				gameStatus 		= Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus 		= Status.LOST;
				break;
			default:
				gameStatus 		= Status.CONTINUE;
				myPoint 		= sumOfDice;
				System.out.printf("point is %d \n", myPoint);
				//break;
		
		}//switch block end
		
		while(gameStatus == Status.CONTINUE){//while block start
			
			sumOfDice = rollDice();
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else
				if(sumOfDice == SEVEN)
					gameStatus = Status.LOST;
		}//while block end
		
		if(gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
		
	}//main block end
	
	private static int rollDice(){//rollDice block start
		
		int die1 = 1 + randNum.nextInt(6);
		int die2 = 1 + randNum.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d +%d = %d\n",
				die1, die2, sum);
		return sum;
	}//rollDice block end
}
