package teampun_ther;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;
    Card card;
    ArrayList<Card> hand;
    Deck deck = new Deck();

    @Before
    public void setUp() {
        player = new Player("Player One", 100);
        card = new Card("10", Suit.CLUB);
        hand = new ArrayList<Card>();
        deck = new Deck();

    }

    @Test
    public void addGetCardTest() {
        Card expected = card;
        player.addCard(card);

        Card actual = player.getCard(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHandTest() {
        ArrayList<Card> expected = hand;
        ArrayList<Card> actual = player.getHand();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest() {
        String expected = "Player One";
        String actual = player.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMoneyTest() {
        double expected = 100;
        double actual = player.getMoney();
        Assert.assertEquals(expected,actual, 0.001);
    }

    @Test
    public void subtractBetTest(){
        player.money = 1000;
        player.subtractBet(100);
        double expected = 900;

        double actual = player.money;

    }


}