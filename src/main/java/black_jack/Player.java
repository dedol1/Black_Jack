package black_jack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private List<Card>playerDeck = new ArrayList<>();
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    /*
     * getters for the fields
     */

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public List<Card> getPlayerDeck() {
        return playerDeck;
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
