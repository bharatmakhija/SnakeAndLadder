package com.company.pojo;

import java.security.PrivateKey;
import java.util.function.Predicate;

public class Player {

    private Slot Position;
    private String name;

    public Slot getPosition() {
        return Position;
    }

    public void setPosition(Slot position) {
        Position = position;
    }

    public static Player getPlayer(String name){
        Slot slot = new Slot(0);
        Player player = new Player(name);
        player.setPosition(slot);
        return player;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Position=" + Position +
                ", name='" + name + '\'' +
                '}';
    }
}
