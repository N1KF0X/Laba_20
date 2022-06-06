package com.company;

public class Socket implements CurrentSource{

    @Override
    public int outputCurrent(){
        System.out.println("Идёт ток под напряжением 380 вольт");
        return 380;
    }
}
