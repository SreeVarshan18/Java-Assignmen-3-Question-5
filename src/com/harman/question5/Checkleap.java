package com.harman.question5;

public class Checkleap {

    public int leapcheck(int x){
        if(x%4==0 && x%100==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
