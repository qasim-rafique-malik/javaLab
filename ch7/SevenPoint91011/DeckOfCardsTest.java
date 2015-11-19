package javaLab.ch7.SevenPoint91011;

public class DeckOfCardsTest {
	
	public static void main(String[] args){//main block start
	
		
		DeckOfCards DoC = new DeckOfCards();
		DoC.shuffle();
		
		// loop for printing cards
		for(int i = 1; i <=52; i++){//for block start
			System.out.printf("%-20s",DoC.dealCard());
			
			if(i%4 == 0){
				System.out.println();
				//System.out.printf("%d mod 4 == %d\n",i,i%4);
			}
		}//for block end
		
		/*DeckOfCards DoC = new DeckOfCards();
		DeckOfCards DoC1 = new DeckOfCards();
		DeckOfCards DoC2 = new DeckOfCards();
		
		DoC.testStatic = 5;
		DoC1.testStatic =10;
		DoC2.testStatic = 29;
		System.out.printf("DoC.testStatic = %d\n",DoC.testStaticVar());
		System.out.printf("DoC1.testStatic = %d\n",DoC1.testStaticVar());
		System.out.printf("DoC2.testStatic = %d\n",DoC2.testStaticVar());
		
		DoC.currentCard1 = 5;
		DoC1.currentCard1 =10;
		DoC2.currentCard1 =57;
		
		System.out.printf("DoC.currentCard1 = %d\n",DoC.testCCVar());
		System.out.printf("DoC1.currentCard1 = %d\n",DoC1.testCCVar());
		System.out.printf("DoC2.currentCard1 = %d\n",DoC2.testCCVar());*/
	}//main block end
}