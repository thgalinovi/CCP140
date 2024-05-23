public class smartsound extends control{
    private double volume;//refers to the volume of the smartsound
    private boolean power2;

    public smartsound(Boolean p){
        super(p);
        if(p == false){
            System.out.println("# Turning off the Sound.");
        }else{
            System.out.println("# Turning on the Sound");
        }
        this.power2 = p;
    }

    public boolean getPower2() {
        return power2;
    }

    public smartsound(Boolean p,double v){
        super(p,v);
        this.power2 = p;
        this.volume = v;
        boolean tpower = getPower2();
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