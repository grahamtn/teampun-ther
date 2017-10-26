package teampun_ther;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    public Deck() {
        for (Suit suit:Suit.values()) {
            for (String card:ranks) {
                Card oneCard = new Card(card, suit);
                cards.add(oneCard);
            }
        }
    }

    public Card getCardFromDeck(int cardPosition) {
        return cards.get(cardPosition);
    }

    public static void main(String[] args) {

    }
}
