public class lamp extends control {

    private Boolean power2;
    private int brightness; //refers to the brightness of the lamp
    private String color; //refers to the color of the lamp

    public lamp(Boolean p){
        super(p);
        if(p == false){
            System.out.println("# Turning off the Light.");
            this.power2 = p;
        }else{
            System.out.println("# Turning on the Light");
            this.power2 = p;
        } 
    }
    public Boolean getPower2(){
        return power2;
    }

    public void setBrightness(int brightness){
        boolean tpower = getPower2();
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
        boolean tpower = getPower2();
        if(tpower==true){
            System.out.println("# Setting the color for " + color);
            this.color = color;
        }else{
            System.out.println("# I cannot change the Color.");
        }

    }
}
