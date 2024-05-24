package com.mycompany.final_project;
import java.util.Scanner;

public class control {
    logger logger = new logger();
    Boolean power;
    double volume;
    int brightness;
    boolean ligar;
    boolean desligar;
    String mName;

    // Only a Simple Constructor
    public control() {
    }

    // Sound Class Constructor
    public control(double v) {
        this.volume = v;
    }

    // SmartTv and Lamp Class Constructor
    public control(int b) {
        this.brightness = b;
    }

    // public void moduleName(String text){
    // System.out.println("Object Name: " + nomeDoModulo);
    // }

    // Constructor polymorphism to Turn Off the objects
    public void off(control[] x) {
        int i = 0 ; 
        for(control c: x){
            if (x[i] instanceof smarttv) {
                System.out.println("# Lamp: Turning off your device.");
                //Log Message
                logger.log("# Lamp: Turning off your device.");
            }
            if (x[i] instanceof smartsound) {
                System.out.println("# SmartSound: Turning off your device.");
                //Log Message
                logger.log("# SmartSound: Turning off your device.");
            }
            if (x[i] instanceof coffee) {
                System.out.println("# Coffee Machine: Turning off your device.");
                //Log Message
                logger.log("# Coffee Machine: Turning off your device.");
            }
            if (x[i] instanceof lamp) {
                System.out.println("# Lamp: Turning off your device.");
                //Log Message
                logger.log("# Lamp: Turning off your device.");
            }
            i++;
        }
    }

    // Constructor polymorphism to Turn On the objects
    public void on(control[] x) {
        int i = 0 ; 
        for(control c: x){
            if (x[i] instanceof smarttv) {
                System.out.println("# Lamp: Turning on your device.");
                //Log Message
                logger.log("# Lamp: Turning on your device.");
            }
            if (x[i] instanceof smartsound) {
                System.out.println("# SmartSound: Turning on your device.");
                //Log Message
                logger.log("# SmartSound: Turning on your device.");
            }
            if (x[i] instanceof coffee) {
                System.out.println("# Coffee Machine: Turning on your device.");
                //Log Message
                logger.log("# Coffee Machine: Turning on your device.");
            }
            if (x[i] instanceof lamp) {
                System.out.println("# Lamp: Turning on your device.");
                //Log Message
                logger.log("# Lamp: Turning on your device.");
            }
            i++;
        }
    }

}
