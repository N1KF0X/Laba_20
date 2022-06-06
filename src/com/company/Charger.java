package com.company;

public class Charger {
    public void startCharging(CurrentSource currentSource){
        if(currentSource.outputCurrent() <= 220){
            System.out.println("Идёт разядка");
        }
        else{
            System.out.println("Замыкание");
        }
    }
}
