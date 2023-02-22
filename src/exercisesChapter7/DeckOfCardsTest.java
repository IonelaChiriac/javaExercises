package exercisesChapter7;
// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest {
    // execute application
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++) {
            // deal and display a Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) // output a newline after every fourth card
                System.out.println();
        }
    }
} // end class DeckOfCardsTest


//Five of Diamonds   Eight of Diamonds  Queen of Clubs     Ten of Diamonds
//Five of Clubs      Ace of Spades      King of Hearts     Three of Diamonds
//Ten of Spades      King of Diamonds   Ace of Diamonds    Jack of Spades
//Nine of Diamonds   King of Spades     Deuce of Hearts    Six of Hearts
//Six of Clubs       Four of Clubs      Five of Spades     Queen of Hearts
//Ten of Clubs       Eight of Spades    Queen of Diamonds  Eight of Hearts
//Three of Spades    King of Clubs      Queen of Spades    Four of Spades
//Deuce of Spades    Seven of Hearts    Six of Spades      Ten of Hearts
//Nine of Spades     Ace of Hearts      Five of Hearts     Nine of Clubs
//Six of Diamonds    Four of Diamonds   Three of Clubs     Four of Hearts
//Seven of Spades    Deuce of Diamonds  Ace of Clubs       Nine of Hearts
//Jack of Clubs      Seven of Clubs     Jack of Diamonds   Eight of Clubs
//Seven of Diamonds  Three of Hearts    Jack of Hearts     Deuce of Clubs
