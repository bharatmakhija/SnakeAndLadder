package com.company;

import com.company.pojo.Game;
import com.company.pojo.Player;

public class RunSnakeAndLadderGame {

    public static void main(String[] args) {
        Player player = Player.getPlayer("bharat");
        Player secondPlayer = Player.getPlayer("Anki");
        Game game = new Game(player,secondPlayer);
        game.run();
    }
}
