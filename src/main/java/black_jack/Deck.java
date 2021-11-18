package black_jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        List<Card> shuffledCards = new ArrayList<>();
        // Using random
        Random random = new Random();
        int randomCardIndex = 0;
//        int sizeOfOriginalCardDeck = cards.size();
        for (int i = 0; i < cards.size(); i++){
            randomCardIndex = random.nextInt((cards.size() -1) - 0) + 0;

            // adding to new deck based on the random index generated
            shuffledCards.add(cards.get(randomCardIndex));

        }
        cards = shuffledCards;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
