package teampun_ther;

public class Card {
    private String value;
    private Suit suit;


    public Card(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
}

