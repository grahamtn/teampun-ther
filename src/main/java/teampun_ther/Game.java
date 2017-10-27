package teampun_ther;

import com.sun.org.glassfish.gmbal.GmbalException;

import java.util.Scanner;

public class Game {
    private Player player;
    private Player dealer;
    private double bet;

    public Game(){
        this.dealer = new Player("Dealer", 1000);
        this.player = getGetPlayerInfo();
    }

    public Player getGetPlayerInfo() {
        String name = getStringInput("What is your name?");
        double money = Double.parseDouble(getStringInput("Enter an amount of money you would like to start with."));
        Player player1 = new Player(name, money);
        return player1;
    }

    public static String getStringInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        return sc.nextLine();
    }

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

    //public String getP()

    public void main(String[] args) {
        this.player = new Player("Player One", 1000);
        /// Console should do this ^^^^


        this.dealer = new Player("Dealer", 1000000);
        Deck gameDeck = new Deck();
        gameDeck.shuffle(gameDeck.getCardsInDeck());


//        Game.dealOneCard(gameDeck);
//        Game.dealOneCard(gameDeck);

        Card playerCardOne = this.player.getHand().get(0);
        Card playerCardTwo = this.player.getHand().get(1);



        System.out.println("Players cards: "+ playerCardOne.getValue()+" of "+playerCardOne.getSuit()+"s"+
                ", "+ playerCardTwo.getValue()+" of "+playerCardTwo.getSuit()+"s");


        Card dealerCardOne = this.dealer.getHand().get(0);

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

    public void dealOneCardForPlayer(Deck gameDeck) {

        Card lastCard = gameDeck.getLastCardFromDeck(gameDeck);
        this.player.addCard(lastCard);
    }

    public void dealOneCard(Deck gameDeck) {

        Card lastCard = gameDeck.getLastCardFromDeck(gameDeck);
        this.player.addCard(lastCard);

        lastCard = gameDeck.getLastCardFromDeck(gameDeck);
        this.dealer.addCard(lastCard);
    }

}


