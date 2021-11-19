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
    public void drawFromDeck(Player player){
       var card = cards.get(0);
       player.addCard(card);
       cards.remove(card);
    }

    /*
     * a method to return the size of a deck
     */
    public int getSizeOfDeck(){
        return cards.size();
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
