package com.mycompany.final_project;
public class smarttv extends control implements ibrightness{
    private int channel;//refers to the channel of the smartt

    //Only a constructor
    public smarttv(){}

    //setBrightness Interface Module 
    public boolean setBrightness(int v){
        if(v >=0 && v <=100){
            System.out.println("# SmartTv: Setting the Tv Brightness to " + v + "% brightness.");
            //Log Message
            logger.log("# SmartTv: Setting the Tv Brightness to " + v + "% brightness.");
            return true;
            }else{
                System.out.println("# SmartTv: The Tv Brightness setted is invalid.");
                //Log Message
                logger.log("# SmartTv: The Tv Brightness setted is invalid.");
            return false;
            }
    }

    //setBrightness Constructor
    public smarttv(int b){
        super(b);
        setBrightness(b);
    }

    //setChannel Module 
    public void setChannel(int c){
        this.channel = c;
        if(channel>=0 && channel <=100){
                System.out.println("# SmartTv: You are in " + this.channel + " channel.");
                //Log Message
                logger.log("# SmartTv: You are in " + this.channel + " channel.");

            }else{
                System.out.println("# SmartTv: This channel does not exist. Try again later.");
                //Log Message
                logger.log("# SmartTv: This channel does not exist. Try again later.");
            }
        }

    

}