package com.spriadka.pitest;

public class Calculator {
    public int add(int x,int y){
        if (x == Integer.MAX_VALUE && y > 0){
            return 0;
        }
        if (x == Integer.MIN_VALUE && y < 0){
            return 0;
        }
        return x + y;
    }
}
