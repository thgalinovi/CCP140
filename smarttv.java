public class smarttv extends control{
    private int channel;//refers to the channel of the smartt
    private boolean power2;


    public smarttv(Boolean p){
        super(p);
        if(p == false){
            System.out.println("# Turning off the Tv.");
        }else{
            System.out.println("# Turning on the Tv");
        }
        this.power2 = p;
    }

    public smarttv(Boolean p, int c){
        super(p,c);
        this.power2 = p;
        this.channel = c;
        if(p==true){
            if(channel>=0 && channel <=100){
                System.out.println("# You are in " + this.channel + " channel.");

            }else{
                System.out.println("# This channel does not exist. Try again later.");
            }
        }else{
            System.out.println("# The Tv is offline in this moment. Try again.");
        }

    }

    public boolean getPower2() {
        return power2;
    }

    public void mode(){
        boolean tpower = getPower2();
        if(tpower==true){
            System.out.println("# Initializing choosen option.");
        }else{
            System.out.println("# The Tv is offline in this moment. Try again.");
        }
    }



}