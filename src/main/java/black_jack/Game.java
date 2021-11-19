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

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("------WELCOME TO OUR BLACK JACK GAME-------");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||\n\n\n");

        // creating a full deck of cards
        deck.fullDeckOfCards();

        // shuffling the deck of cards
        deck.shuffleDeck();

        // giving each player two cards to start the game
        for(Player player : listOfPlayers){
            for (int i = 0; i < 2; i++){
                deck.drawFromDeck(player);
            }
        } //end of for loop

        /*
         * check which players are still in the game or not
         */

            for(Player player : listOfPlayers){
                if(player.getTotalValueAtHand() < 17) {
                    player.setStatus(Status.hit);
                    System.out.println("You have in your hand " + player.getPlayerDeck());
                    System.out.println(player.getName() +" hit with the score " + player.getTotalValueAtHand());
                    deck.drawFromDeck(player);

                }
                else if (player.getTotalValueAtHand() > 17 && player.getTotalValueAtHand() < 21){
                    player.setStatus(Status.stick);
                    System.out.println("You have in your hand " + player.getPlayerDeck());
                    System.out.println(player.getName() +" stick with the score " + player.getTotalValueAtHand());
                }
                else if(player.getTotalValueAtHand() > 21){
                    player.setStatus(Status.bust);
                    System.out.println("You have in your hand " + player.getPlayerDeck());
                    System.out.println(player.getName() +" busted with the score" + player.getTotalValueAtHand());
                    listOfPlayers.remove(player);
                }
            } // end of for loop

        //getting all players who have a total value of 21
        var exactlyTwentyOne = listOfPlayers.stream()
                .filter(player -> player.getTotalValueAtHand() == 21);

            // getting all players who have stick
            var playersThatStick = listOfPlayers
                    .stream()
                    .filter(s -> s.getTotalValueAtHand() >= 17 && s.getTotalValueAtHand() < 21);

            // keeping the game in a loop
        while (listOfPlayers.size() > 0){

            if (listOfPlayers.contains(exactlyTwentyOne)){
                break;
                //TODO
            }

            else if (listOfPlayers == playersThatStick){
                break;
                //TODO
            }

        }

    }




}
