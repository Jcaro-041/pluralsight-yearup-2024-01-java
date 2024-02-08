package com.pluralsight.games;

import java.util.ArrayList;

public class CardGame
{
    private ArrayList<Hand> players = new ArrayList<>();

    public void start()
    {
        // start by adding a few players
        players.add(new Hand("Daisy"));
        players.add(new Hand("Tee"));
        players.add(new Hand("Gabe"));

        // loop and deal the cards
        Deck deck = new Deck();
        deck.shuffle();

        for(Hand player: players){
            Card card = deck.deal();
            player.deal(card);
            card.flip();
            System.out.println(player.getPlayerName() + " " + card);
        }
        // loop and determine who won
        Hand winner = players.getFirst();
        for(Hand player: players){
            if(player.getValue() > winner.getValue()){
                winner = player;
            }
    }
        // display the winner
        System.out.println("The winner is " + winner.getPlayerName());
    }
}