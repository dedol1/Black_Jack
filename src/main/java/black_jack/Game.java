package black_jack;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> listOfPlayers = new ArrayList<>();
    private Deck deck;

    /*
     * constructor for the game class
     */

    public Game(List<Player> listOfPlayers, Deck deck) {
        this.listOfPlayers = listOfPlayers;
        this.deck = deck;
    }

    /*
     * method to start the game
     */

    public void startGame(){
        // creating a full deck of cards
        deck.fullDeckOfCards();

        // shuffling the deck of cards
        deck.shuffleDeck();

        // giving each player two cards to start the game
        for(Player player : listOfPlayers){
            for (int i = 0; i < 2; i++){
                deck.drawFromDeck(player);
            }
        }

        /*
         * check which players are still in the game or not
         */

        for(Player player : listOfPlayers){
            if(player.getTotalValueAtHand() < 17) {
                deck.drawFromDeck(player);
                System.out.println("You hit");
            }
            else if(player.getTotalValueAtHand() > 17){
                System.out.println("You stick");
            }
            else if(player.getTotalValueAtHand() > 21){
                listOfPlayers.remove(player);
                System.out.println("Busted");
            }
        }

    }
}
