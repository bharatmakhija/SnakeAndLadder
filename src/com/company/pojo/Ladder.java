package com.company.pojo;

public class Ladder extends BoardEntity implements ValidationBoardEntityI {

    public Ladder(Slot start, Slot end) {
        super(start, end);
        if(!validate(start,end)){
            throw new IllegalArgumentException(start.toString() + " " + end.toString());
        }
    }

    @Override
    public void printMessage() {
        System.out.println("OHH FOUND LEDDER, going up!!!!");
    }

    @Override
    public boolean validate(Slot start, Slot end) {
        return start.getIndex() < end.getIndex() && end.getIndex() != 100;
    }


}
