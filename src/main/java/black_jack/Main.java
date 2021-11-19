package black_jack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deckOfCards = new Deck();
        deckOfCards.fullDeckOfCards();
        deckOfCards.shuffleDeck();
//        var n = deckOfCards.getValueOfHand();

//        System.out.println(deckOfCards);
//        System.out.println(n);
        List<Card> cardList = List.of(
                    new Card(Suit.Hearts,CardValue.Ace),
                    new Card(Suit.Hearts,CardValue.Ace)
        );
        Player player = new Player();
        Player player1 = new Player();
        Player player2 = new Player();
        player.setPlayerDeck(cardList);
        player1.setPlayerDeck(cardList);
        player2.setPlayerDeck(cardList);
        System.out.println(player.getTotalValueAtHand());

        List<Player> playerList = new ArrayList<>();
        playerList.add(player);
        playerList.add(player1);
        playerList.add(player2);

        Game game = new Game(playerList,deckOfCards);
        game.startGame();






    }
}
