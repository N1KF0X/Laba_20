package com.company;

public class Adapter implements CurrentSource{
    private Socket socket;

    public Adapter(Socket socket){
        this.socket = socket;
    }

    @Override
    public int outputCurrent() {
        int volt = (int)(socket.outputCurrent() * 0.5);
        System.out.printf("Напряжение пониженно до %d", volt);
        System.out.println();
        return volt;
    }
}
