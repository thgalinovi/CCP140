package com.mycompany.final_project;
public class lamp extends control implements ibrightness{

    // private Boolean power2;
    private String color; //refers to the color of the lamp


    //Only a constructor
    public lamp(){}    

    //setBrightness Interface Module 
    public boolean setBrightness(int v){
        if(v >=0 && v <=100){
            System.out.println("# Lamp: Setting the Lamp Brightness to " + v + "% brightness.");
            //Log Message
            logger.log("# Lamp: Setting the Lamp Brightness to " + v + "% brightness.");
            return true;
            }else{
                System.out.println("# Lamp: The Tv Lamp setted is invalid.");
                //Log Message
                 logger.log("# Lamp: The Tv Lamp setted is invalid.");
            return false;
            }
    }

    //setBrightness Constructor
    public lamp(int b){
        super(b);
        setBrightness(b);
    }
    
    //setBrightness Interface Module 
    public void setColor(String color){
            System.out.println("# Lamp: Setting the color to " + color);
            this.color = color;
            //Log Message
            logger.log("# Lamp: Setting the color to " + color);
            
        }
}
