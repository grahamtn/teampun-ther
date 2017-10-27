package teampun_ther;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Console {

    public void console(){
/*
    deal cards to player
    deal cards to dealer

   print card value and suit

   place bet

   hit or stay

   if hit deal card, print new card

   if hand > 21 loser, remove bet
    if hand < 21 hit or stay

   if stay

  compare player hand to dealer hand

   if winner add bet print winner!

   else if loser remove bet

   ask to play again
 */
        int menuChoice = 0;
        Scanner mc = new Scanner(System.in);
        boolean playChoice = false;
        double betAmount;
        int hitOrStay;

        Player player = new Player("Player 1", 100);
        Player dealer = new Player("Dealer", 100);


        while (!playChoice){
            System.out.println("Waddup playa lets play!");

            //deal cards to players hand
            //deal cards to dealers hand

            System.out.println("Place bet: ");
            betAmount = mc.nextInt();

            //setBet

            //print cards value and suit
            //print one dealer card

            System.out.println("Place bet: ");
            betAmount = mc.nextInt();

            do {
                System.out.println("Hit or stay: \n1)Hit\n2)Stay");
                hitOrStay = mc.nextInt();

                if (hitOrStay == 1) {
                    //deal and print card to players hand
                }

            }while(hitOrStay == 1);


            //in game dealer logic

            //compare player hand to dealer hand

//            if(Game.compareHands == false){
//                player.removeBet;
//                dealer.addBet;
//                System.out.println("You lose this round playa!");
//            }
//            else if (Game.compareHands == true){
//                player.addBet;
//                dealer.removeBet;
//                System.out.println("You win this round playa!");
//
//            }
//
//            if (player.money == 0 || dealer.money == 0) {
//                playChoice = true;
//            }
        }






    }
}