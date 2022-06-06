package com.company;

public class Main {

    public static void main(String[] args) {
	    Charger charger = new Charger();
        Socket socket = new Socket();
        charger.startCharging(socket);
        Adapter adapter = new Adapter(socket);
        charger.startCharging(adapter);
    }
}
