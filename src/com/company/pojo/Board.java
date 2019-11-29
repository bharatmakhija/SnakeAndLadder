package com.company.pojo;

import com.company.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {

    private List<BoardEntity> boardEntities;
    HashMap<Slot, BoardEntity> SnakeLedderStartPoints;

    private void populateSnakeLedderStartPointMapping(){
        SnakeLedderStartPoints = new HashMap<Slot, BoardEntity>();
        for(BoardEntity boardEntity : boardEntities){
            SnakeLedderStartPoints.put(boardEntity.getStart(), boardEntity);
        }
    }

    public Slot checkSnakeOrLedder(Slot s){
       Slot res = s;
        if(SnakeLedderStartPoints.containsKey(s)){
            BoardEntity boardEntity = SnakeLedderStartPoints.get(s);
            boardEntity.printMessage();
            res = boardEntity.getEnd();
        }
        return res;
    }

    public Board() {
        boardEntities = new ArrayList<BoardEntity>();
        this.CreateRandomSnakesAndLedders();
        this.populateSnakeLedderStartPointMapping();
    }

    private void createEntity(String s){
        boolean created = false;
        while(!created){
            try {
                BoardEntity boardEntity;
                if(s.toUpperCase().equals("SNAKE")){
                    boardEntity = new Snake(Slot.getRandomSlot(), Slot.getRandomSlot());

                } else {
                    boardEntity = new Ladder(Slot.getRandomSlot(), Slot.getRandomSlot());
                }

                System.out.println( s + " created start: " + boardEntity.getStart() + " end: " + boardEntity.getEnd());
                created = true;
                boardEntities.add(boardEntity);
            }catch (IllegalArgumentException e){}
        }
    }

    private void CreateRandomSnakesAndLedders(){
        Integer count = Util.getRandomInRange(1,10);
        for(int i = 0; i < count; i++){
            Integer val = Util.getRandomInRange(1,100);
            if(val % 2 == 1){
                this.createEntity("SNAKE");
            }
            else{
                this.createEntity("LEDDER");
            }
        }
    }
}
