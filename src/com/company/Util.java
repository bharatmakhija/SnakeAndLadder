package com.company;

import java.util.Random;

public class Util {

    public static Integer getRandomInRange(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public Util() {
    }
}
