package com.mycompany.final_project;
import java.util.HashSet;
import java.util.Scanner;


public class environment{
    
    control c = new control();
    
   
    public void netflix(){
        System.out.println(">> Trying to intialize the Netflix Mode. <<");
            //Log Message
            logger.log(">> Trying to intialize the Netflix Mode. <<");
            control[] x = new control[1];
            x[0] = new smarttv();
            c.on(x);
            x[0] = new lamp();
            c.off(x);
            smartsound s = new smartsound();
            s.setVolume(80);
        
    }
    public void music(){
        System.out.println(">> Trying to intialize the Music Mode. <<");
        //Log Message
        logger.log(">> Trying to intialize the Music Mode. <<");
        smartsound s = new smartsound();
        lamp l = new lamp();
        control[] x = new control[2];
        x[0] = new lamp();
        x[1] = new smartsound();
        c.on(x);
        s.setVolume(80);
        l.setColor("Red");
    }
    public void sleep(){
        System.out.println(">> Trying to intialize the Sleep Mode. <<");
        //Log Message
        logger.log(">> Trying to intialize the Sleep Mode. <<");
        control[] x = new control[3];
        x[0] = new lamp();
        x[1] = new smartsound();
        x[2] = new smarttv();
        c.off(x);
    }
    public void morning(){
        System.out.println(">> Trying to intialize the Morning Mode. <<");
        //Log Message
        logger.log(">> Trying to intialize the Morning Mode. <<");
        control[] x = new control[4];
        x[0] = new lamp();
        x[1] = new smartsound();
        x[2] = new smarttv();
        x[3] = new coffee();
        c.on(x);
        smarttv tv = new smarttv();
        tv.setBrightness(50); //aqui
        lamp l = new lamp();
        l.setColor("White");
        l.setBrightness(80); //aqui     
        smartsound s = new smartsound();
        s.setVolume(30);
        coffee c = new coffee();
        c.choose();


    }

}