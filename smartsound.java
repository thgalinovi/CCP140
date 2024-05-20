package com.mycompany.orientecao_projeto;

public class smartsound{
    private int volume;//refers to the volume of the smartsound
    private boolean power;
    
    public void setPower (boolean power){
        if(power == false){
            System.out.println("Turning off the Sound.");
        }else{
            System.out.println("Turning on the Sound");
        }
        this.power = power;
    }

    public boolean getPower() {
        return power;
    }
    
    public void setVolume(int volume){
        boolean tpower = getPower();
        if(tpower==true){
          if(volume>=0 && volume<=100 ){        
              this.volume = volume;
              System.out.println("# Your Sound Volume are setted to " + this.volume);
          }else{
              System.out.println("# This sound setting does not exist.");
          }
          if(volume>=80 && volume<=100){
             System.out.println("# Warning: It is so high. Be careful!!");
    
          }
        }else{
            System.out.println("# The SmartSound is offline in this moment. Try again.");
        }
  
    }
      
}