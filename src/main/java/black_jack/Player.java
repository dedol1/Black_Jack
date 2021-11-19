package black_jack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private List<Card>playerDeck = new ArrayList<>();
    Deck deck;

    /*
     * getters and setters for the fields
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(List<Card> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public void addCard(Card card){
        playerDeck.add(card);
    }

    /*
     *getting total value of the cards at hand
     */
    public int getTotalValueAtHand(){
        return  playerDeck.stream().mapToInt(p -> p.getValue().getVal()).sum();
    }

    /*
     * Implementing the hit method
     */
    public void hit(Card card){

    }
}
