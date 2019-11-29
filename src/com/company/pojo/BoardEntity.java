package com.company.pojo;

public abstract class  BoardEntity {

    private Slot start;
    private Slot end;

    private boolean validateRange(Slot x){
        return x.getIndex() >= 1 && x.getIndex() <= 100;
    }

    public BoardEntity(Slot start, Slot end) {
        if(validateRange(start) && validateRange(end)){
            this.start = start;
            this.end = end;
        }else{
            throw new IllegalArgumentException(start.toString() + " " + end.toString());
        }
    }

    public Slot getStart() {
        return start;
    }

    public void setStart(Slot start) {
        this.start = start;
    }

    public Slot getEnd() {
        return end;
    }

    public void setEnd(Slot end) {
        this.end = end;
    }

    public abstract void printMessage();

}
