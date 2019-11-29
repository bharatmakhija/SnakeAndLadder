package com.company.pojo;

public class Snake extends BoardEntity implements ValidationBoardEntityI {

    public Snake(Slot start, Slot end) {
        super(start,end);
        if(!validate(start,end)){
            throw new IllegalArgumentException(start.toString() + " " + end.toString());
        }
    }

    @Override
    public void printMessage() {
        System.out.println("Hissss, Snake Bited you!!! Going DOWN!!!!");
    }

    @Override
    public boolean validate(Slot start, Slot end) {
        return start.getIndex() > end.getIndex() && start.getIndex() != 100;
    }
}
