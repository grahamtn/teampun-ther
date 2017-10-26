package teampun_ther;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void getAndCreateDeckTest(){
        Card expectedCard = new Card("Ace", Suit.CLUB);
        Suit expected = expectedCard.getSuit();
        Deck deck = new Deck();
        Suit actual = deck.getCardFromDeck(0).getSuit();
        Assert.assertEquals(expected,actual);
    }

}