package com.company.pojo;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;

    public Game(Player firstPlayer, Player secondPlayer) {
        this.players = new ArrayList<Player>();
        players.add(firstPlayer);
        players.add(secondPlayer);
        this.dice = new Dice();
        this.board = new Board();
    }

    private boolean  checkWin(Player p){
        return p.getPosition().getIndex() == 100;
    }

    public void playMove(Player p){
        Integer dis = Dice.roll();
        Slot slot = p.getPosition();
        try {
            slot.setIndex(slot.getIndex() + dis);
            System.out.println("player : " + p + " rolled: " + dis.toString());
             slot = board.checkSnakeOrLedder(slot);
        }catch (Exception e){}
        p.setPosition(slot);
        System.out.println("player : " + p + " reached at slot" + slot);

    }

    private void declareWinner(Player p){
        System.out.println("Player " + p + " won the game!!");
    }

    public void run(){
        Integer index = 0;
        Player player;
        player = this.players.get(index);
        while(!checkWin(player)){
            player = this.players.get(index);
            playMove(player);
            index = 1 - index;
        }
        declareWinner(player);
    }
}
