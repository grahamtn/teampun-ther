package teampun_ther;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Console.console();
    }

    public static void console() {

        Game newGame = new Game();
        System.out.println("Let's play a game!");

        Deck gameDeck = new Deck();
        gameDeck.shuffle(gameDeck.getCardsInDeck());
        double bet = Double.parseDouble(Game.getStringInput("Please place a bet."));

        newGame.dealOneCard(gameDeck);
        System.out.println("Everyone has been dealt one card.");
        newGame.dealOneCard(gameDeck);
        System.out.println("Everyone has been dealt a second card.\n");

        String playerHand = newGame.getPlayer().printPlayersHand();
        System.out.println("Your hand is: " + playerHand);

        String dealTopCard = newGame.getDealer().getHand().get(1).getValue()
                + " of " + newGame.getDealer().getHand().get(1).getSuit() + "s";

        System.out.println("The dealers top card is a: " + dealTopCard);


        int answer = Integer.parseInt(Game.getStringInput("Would you like to stay or hit?\n" +
                "1: Stay\n2: Hit"));

        do {

            if (newGame.getPlayer().playerHandValue()>=21){
                break;
            }


            if (answer == 2) {
                newGame.dealOneCardForPlayer(gameDeck);
                playerHand = newGame.getPlayer().printPlayersHand();
                System.out.println("Your hand is: " + playerHand);
                answer = Integer.parseInt(Game.getStringInput("Would you like to stay or hit?\n" +
                        "1: Stay\n2: Hit"));

            } else {
                System.out.println("Please pick 1 or 2.");
            }

        } while (answer == 2);

        ////playerHand = newGame.getPlayer().printPlayersHand();
        ////System.out.println("Your hand is: " + playerHand);

        int handValueOfPlayer = newGame.getPlayer().playerHandValue();
        int handValueOfDealer = newGame.getPlayer().playerHandValue();

        if (handValueOfPlayer > handValueOfDealer) {
            System.out.println("You win! Yay!");
            newGame.getPlayer().addBet(bet);
        } else if (handValueOfPlayer < handValueOfDealer) {
            newGame.getPlayer().subtractBet(bet);
            System.out.println("You lose!");
        } else {
            System.out.println("It's a tie... or whatever it's called.");
        }


        }
    }






//
//   print card value and suit
//
//   place bet
//
//   hit or stay
//
//   if hit deal card, print new card
//
//   if hand > 21 loser, remove bet
//    if hand < 21 hit or stay
//
//   if stay
//
//  compare player hand to dealer hand
//
//   if winner add bet print winner!
//
//   else if loser remove bet
//
//   ask to play again
// */
////        int menuChoice = 0;
////        Scanner mc = new Scanner(System.in);
////        boolean playChoice = false;
////        double betAmount;
////        int hitOrStay;
////
////        Player player = new Player("Player 1", 100);
////        Player dealer = new Player("Dealer", 100);
////
////
////        while (!playChoice){
////            System.out.println("Waddup playa lets play!");
////
////            //deal cards to players hand
////            //deal cards to dealers hand
////
////            System.out.println("Place bet: ");
////            betAmount = mc.nextInt();
////
////            //setBet
////
////            //print cards value and suit
////            //print one dealer card
////
////            System.out.println("Place bet: ");
////            betAmount = mc.nextInt();
////
////            do {
////                System.out.println("Hit or stay: \n1)Hit\n2)Stay");
////                hitOrStay = mc.nextInt();
////
////                if (hitOrStay == 1) {
////                    //deal and print card to players hand
////                }
////
////            }while(hitOrStay == 1);
////
////
////            //in game dealer logic
////
////            //compare player hand to dealer hand
////
//////            if(Game.compareHands == false){
//////                player.removeBet;
//////                dealer.addBet;
//////                System.out.println("You lose this round playa!");
//////            }
//////            else if (Game.compareHands == true){
//////                player.addBet;
//////                dealer.removeBet;
//////                System.out.println("You win this round playa!");
//////
//////            }
//////
//////            if (player.money == 0 || dealer.money == 0) {
//////                playChoice = true;
//////            }
////        }
//
//
//
//
//
//
//    }
//}