package black_jack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    /*
     * List to hold the card deck
     */
    private List<Card> cards = new ArrayList<>();

    /*
     * constructor for the deck class
     */

    public Deck() {
        this.cards = cards;
    }

    /*
     * creating a method to generate the deck of cards
     */
    public void fullDeckOfCards(){
        for (Suit cardSuit:Suit.values()){
            for (CardValue valueOfCard: CardValue.values()){
                cards.add(new Card(cardSuit,valueOfCard));
            }
        }
    }

    @Override
    public String toString() {

        String cardListOutput = "";
        int i = 0;
        for (Card card : cards){
            cardListOutput +="\n" + i + "-" + card.toString();
            i++;
        }
        return cardListOutput;
    }
}
