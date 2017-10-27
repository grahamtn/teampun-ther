package teampun_ther;

import java.util.ArrayList;

public class Player {
    ArrayList<Card> hand = new ArrayList<>();
    String name;
    double money;

    public Player(String name, double money) {
        this.name = name;
        this.money = money;
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", money=" + money + '}';
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public Card getCard(int cardOneOrTwo) {
        return this.hand.get(cardOneOrTwo);
    }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }


    public double getMoney() {
        return money;
    }

    public void subtractBet(double betAmount) {
        this.money -= betAmount;
    }
}

