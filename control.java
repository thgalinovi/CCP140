import java.util.Scanner;

public class control {

    Boolean power;
    double volume;
    int channel;

    public control(Boolean p, double v){
        this.power = p;
        this.volume = v;      
    }
    public control(Boolean p, int c){
        this.power = p;
        this.channel = c;      
    }
    public control(Boolean p){
        this.power = p;  
    }
    
    
    
}