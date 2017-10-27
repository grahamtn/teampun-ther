package teampun_ther;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardsInDeck = new ArrayList<>();
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    public Deck() {
        for (Suit suit:Suit.values()) {
            for (String card:ranks) {
                Card oneCard = new Card(card, suit);
                cardsInDeck.add(oneCard);
            }
        }
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public Card getCardFromDeck(int cardPosition) {
        return cardsInDeck.get(cardPosition);
    }

    public void shuffle(ArrayList cards) {
        Collections.shuffle(cards);
    }

    public Card getLastCardFromDeck(Deck deck) {
        int pos = deck.cardsInDeck.size()-1;
        Card value = deck.cardsInDeck.get(pos);
        deck.cardsInDeck.remove(pos);
        return value;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();

        //int pos = cardsInDeck.cardsInDeck.size();
//        System.out.println(cardsInDeck.cardsInDeck.get(1).);
//
//
//
//        Card card = new Card(value,suit);

    }

}

