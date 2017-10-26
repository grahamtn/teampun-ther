package teampun_ther;


import org.junit.*;

public class CardTest {

    String value;
    Suit suit;
    Card card;

    @Before
    public void setUpTest(){
        value = "12";
        suit = Suit.CLUB;
        card = new Card("12", Suit.CLUB);

    }


    @Test
    public void getValueTest() {
        String expected = value;
        String actual = card.getValue();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSuitValue() {
        Suit expected = suit;
        Suit actual = card.getSuit();
        Assert.assertEquals(expected,actual);
    }
}