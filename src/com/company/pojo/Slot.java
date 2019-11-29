package com.company.pojo;

import com.company.Util;

import java.util.Objects;

public class Slot {

    private Integer index;

    public static Slot getRandomSlot(){
        Integer x = Util.getRandomInRange(2,99); // no snake or ledder at starting and ending point
        Slot slot = new Slot(x);
        return slot;
    }

    public Slot(Integer index) {
        if(validate(index)){
            this.index = index;
        }
        else {
            throw new IllegalArgumentException("Slot of index " + index + " is invalid");
        }
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slot slot = (Slot) o;
        return Objects.equals(index, slot.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }

    private boolean validate(Integer index){
        return index >= 0 && index <= 100;
    }

    public void setIndex(Integer index) {
        if(validate(index)){
            this.index = index;
        }
        else {
            throw new IllegalArgumentException("Slot of index " + index + " is invalid");
        }
    }

    @Override
    public String toString() {
        return "slot{" +
                "index=" + index +
                '}';
    }
}
