package javaLab.ch7.SevenPoint91011;

public class Card{

	private String face;
	private String suit;
	
	public Card( String cardFace, String cardSuit )
	{
		face = cardFace; // initialize face of card
		suit = cardSuit; // initialize suit of card
	} // end two-argument Card constructor
	
	public String toString(){
		return face+ " of " + suit;
	}

} // end class Card