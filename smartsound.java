package com.mycompany.final_project;
public class smartsound extends control implements isound{
    private double volume;//refers to the volume of the smartsound

    //Only a constructor
    public smartsound(){}

    //setSound Interface Module 
    public boolean setVolume(double value){
         if(value >= 0 && value <= 100){
             if(value>=80 && value<=100){
                  System.out.println("# SmartSound: Warning: It is so high. Be careful!!");
                  //Log Message
                logger.log("# SmartSound: Warning: It is so high. Be careful!!");
            }
             System.out.println("# SmartSound: Increasing the volume to " + value + "%.");
             //Log Message
            logger.log("# SmartSound: Increasing the volume to " + value + "%.");
             this.volume = value;
             return true;
        }else{
            System.out.println("# SmartSound: The volume setted is invalid.");
            //Log Message
            logger.log("# SmartSound: The volume setted is invalid.");
            return false;
        }        
    }

    //smartSound Constructor
    public smartsound(double v){
        super(v);
        setVolume(v);
    }
    
}