package com.company.pojo;

import com.company.Util;

import java.util.Random;

public class Dice {

    public static Integer roll(){
         return Util.getRandomInRange(1,6);
    }


}
