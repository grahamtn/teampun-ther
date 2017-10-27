package teampun_ther;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DeckTest {
    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void getAndCreateDeckTest(){
        Card expectedCard = new Card("Ace", Suit.CLUB);
        Suit expected = expectedCard.getSuit();

        Suit actual = deck.getCardFromDeck(0).getSuit();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getLastCardFromDeckTest() {
        Deck deck = new Deck();
        Card expectedCard = new Card("King", Suit.SPADE);
        Suit expected = expectedCard.getSuit();
        Suit actual = deck.getLastCardFromDeck(deck).getSuit();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDeckTest(){
        ArrayList returnedDeck = deck.getCardsInDeck();
        Assert.assertNotNull(returnedDeck);
    }

}