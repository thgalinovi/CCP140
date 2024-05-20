package com.mycompany.orientecao_projeto;

public class smarttv{
    private int channel;//refers to the channel of the smartt
    private boolean power;
    
    
    public void setPower(boolean power){
        if(power == false){
            System.out.println("# Turning off the Tv.");
        }else{
            System.out.println("# Turning on the Tv");
        }
        this.power = power;
    }
    
    public void setChannel(int channel){
        if(power==true){
            if(channel>=0 && channel <=100){
                System.out.println("# You are in " + this.channel + "channel.");

            }else{
                System.out.println("# This channel does not exist. Try again later.");
            }
        }else{
            System.out.println("# The Tv is offline in this moment. Try again.");
        }
    }

    public boolean getPower() {
        return power;
    }
    
    public void mode(){
        boolean tpower = getPower();
        if(tpower==true){
            System.out.println("# Initializing choosen option.");
        }else{
            System.out.println("# The Tv is offline in this moment. Try again.");
        }
    }
    


}
