package black_jack;

public class Main {
    public static void main(String[] args) {

        Deck deckOfCards = new Deck();
        deckOfCards.fullDeckOfCards();
        deckOfCards.shuffleDeck();
        var n = deckOfCards.getValueOfHand();

//        System.out.println(deckOfCards);
        System.out.println(n);





    }
}
