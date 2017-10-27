package teampun_ther;

import com.sun.org.glassfish.gmbal.GmbalException;

public class Game {
    public static Player player;
    public static Player dealer;
    private double bet;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getDealer() {
        return dealer;
    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public static void main(String[] args) {
        Game.player = new Player("Player One", 1000);
        /// Console should do this ^^^^


        Game.dealer = new Player("Dealer", 1000000);
        Deck gameDeck = new Deck();
        gameDeck.shuffle(gameDeck.getCardsInDeck());


        Game.dealOneCard(gameDeck);
        Game.dealOneCard(gameDeck);

        Card playerCardOne = Game.player.getHand().get(0);
        Card playerCardTwo = Game.player.getHand().get(1);



        System.out.println("Players cards: "+ playerCardOne.getValue()+" of "+playerCardOne.getSuit()+"s"+
                ", "+ playerCardTwo.getValue()+" of "+playerCardTwo.getSuit()+"s");


        Card dealerCardOne = Game.dealer.getHand().get(0);

        System.out.println("Dealer top card: "+ dealerCardOne.getValue()+" of "+dealerCardOne.getSuit()+"s");

        if (playerCardOne.getValue() == "King" || playerCardOne.getValue() == "Queen" || playerCardOne.getValue() == "Jack") {
            int cardOneValue = 10;
            System.out.println(cardOneValue);

        }
        else {
            int cardOneValue = Integer.parseInt(playerCardOne.getValue());
            System.out.println(cardOneValue);
        }










        }

    public static void dealOneCard(Deck gameDeck) {

        Card lastCard = gameDeck.getLastCardFromDeck(gameDeck);
        Game.player.addCard(lastCard);
        lastCard = gameDeck.getLastCardFromDeck(gameDeck);
        Game.dealer.addCard(lastCard);
    }

    }


