package black_jack;

import java.util.ArrayList;
import java.util.Collections;
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

    /*
     * a method to shuffle the deck of cards
     */
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    /*
     * A method to remove a card from a deck
     */
    public void Cardremover(int card){
        cards.remove(card);
    }

    /*
     * a getter to return a  card
     */
    public Card Cardgetter(int card){

        return cards.get(card);
    }

    /*
     * a setter for adding cards
     */
    public void CardAdder(Card card){
        cards.add(card);
    }

    /*
     * a method to draw to from a deck of cards
     */
    public void drawFromDeck(Deck card){
        cards.add(card.Cardgetter(0));
        card.Cardremover(0);
    }

    /*
     * a method to return the size of a deck
     */
    public int getSizeOfDeck(){
        return cards.size();
    }

    /*
     * a method to get the value of a hand
     * Note: the value of the ace must be checked because two aces
     *          will sum up to 22 which is out of bounds
     * This method returns the total of deck in hand
     */
    public int getValueOfHand(){
        int value = 0;
        for (Card card : cards){
            switch (card.getValue()){
                case Ace -> {value += 11; break;}
                case Two -> {value += 2; break;}
                case Three -> {value += 3; break;}
                case Four -> {value += 4; break;}
                case Five -> {value += 5; break;}
                case Six -> {value += 6; break;}
                case Seven -> {value += 7; break;}
                case Eight -> {value += 8; break;}
                case Nine -> {value += 9; break;}
                case Ten -> {value += 10; break;}
                case Jack -> {value += 10; break;}
                case Queen -> {value += 10; break;}
                case King -> {value += 10; break;}
            }

        }
        return value;
    }

    @Override
    public String toString() {
      String listOfCardsOuput = "";
      int i = 0;
      for (Card card : cards){
          listOfCardsOuput += "\n" + i + "-" + card.toString();
          i++;
      }
      return  listOfCardsOuput;
    }
}
