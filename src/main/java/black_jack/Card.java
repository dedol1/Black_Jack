package black_jack;

public class Card {
    /*
     * Declaring the properties of the card class
     */
    private Suit suit;
    private CardValue value;

    /*
     * This is the constructor for the card class
     */
    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    /*
     * Getter to return the value of a card for usage
     * Note: we only need the value of the card not the suit
     */

    public CardValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
