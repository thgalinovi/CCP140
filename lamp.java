package com.mycompany.orientecao_projeto;

public class lamp{
    private boolean power; //refers to the power of the lamp
    private int brightness; //refers to the brightness of the lamp
    private String color; //refers to the color of the lamp

    public void setPower (boolean power){
        if(power == false){
            System.out.println("# Turning off the Light.");
        }else{
            System.out.println("# Turning on the Light");
        }
        this.power = power;
    }
    
    public boolean getPower() {
        return power;
    }
    
    public void setBrightness(int brightness){
        boolean tpower = getPower();
        if(tpower==true){
            if(brightness >=0 && brightness <=100){
            System.out.println("# Setting the light to " + brightness + "% brightness.");
            this.brightness = brightness;
            }else{
                System.out.println("# The Brightness setted is invalid.");
            }
            
        }else{
            System.out.println("# I cannot change the Brightness.");
        }
    }
    public void setColor(String color){
        boolean tpower = getPower();
        if(tpower==true){
            System.out.println("# Setting the color for " + color);
            this.color = color;
        }else{
            System.out.println("# I cannot change the Color.");
        }
    }

}
