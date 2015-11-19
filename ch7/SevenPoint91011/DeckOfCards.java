package javaLab.ch7.SevenPoint91011;
//importing library
import java.util.Random;

public class DeckOfCards{
	
	//instance variables
	private Card[] deck;
	private int currentCard;
	public int currentCard1;
	public static int testStatic;
	private static final int NUMBER_OF_CARDS 		= 52;
	private static final Random randNumbers 		= new Random();
	
	public DeckOfCards(){//Contractor block start
		
		//initializing variables
		String[] faces 		= {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits 		= {"Hearts", "Diamonds", "Clubs", "Spades"};
		deck  				= new Card[NUMBER_OF_CARDS];
		currentCard			= 0;
		
		// creating card's objects and initializing deck array
		for(int count = 0; count < deck.length; count++){//for block start
			deck[count] = new Card(faces[count%13], suits[count/13]);
			//System.out.printf("faces[%d] --- suits[%d]\n", count%13, count/13 );
			//System.out.printf("deck[%d] = %s\n",count, deck[count] );
			
			
		}//for block end
			
	}//Contractor block end
	
	public void shuffle(){//shuffle block start
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++){//for block start
			
			int second 		= randNumbers.nextInt(NUMBER_OF_CARDS);
			Card temp 		= deck[first];
			deck[first] 	= deck[second];
			deck[second] 	= temp;
			
		}//for block end
		
	}//shuffle block end
	
	public Card dealCard(){
		if(currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
	
	public int testStaticVar(){
		return testStatic++;
	}
	public int testCCVar(){
		return currentCard1++;
	}
	
} 