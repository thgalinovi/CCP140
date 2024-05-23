import java.util.HashSet;
import java.util.Scanner;


public class enviroment {
    
    Scanner sc = new Scanner(System.in);

    public void netflix(){
        System.out.println(">> Trying to intialize the Netflix Mode. <<");
        smarttv tv = new smarttv(true);
        smartsound sound = new smartsound(true, 80);
        lamp lamp = new lamp(false);
        tv.mode();
    }
    public void music(){
        System.out.println(">> Trying to intialize the Music Mode. <<");
        smartsound sound = new smartsound(true, 100);
        lamp lamp = new lamp(true);
        lamp.setColor("red");
        smarttv tv = new smarttv(false);
    }
    public void sleep(){
        System.out.println(">> Trying to intialize the Sleep Mode. <<");
        smartsound sound = new smartsound(false);
        lamp lamp = new lamp(false);
        smarttv tv = new smarttv(false);
    }
    public void morning(){
        System.out.println(">> Trying to intialize the Morning Mode. <<");
        lamp lamp = new lamp(true);
        lamp.setColor("White");
        lamp.setBrightness(80);      
        smarttv tv = new smarttv(true);
        smartsound sound = new smartsound(true,30);
        coffee coffee = new coffee(true);
        
        System.out.println("# Choose your drink: ");
        System.out.println("# ristretto(1)");
        System.out.println("# cappuccino(2)");
        System.out.println("# latte(3)");
        System.out.println("# americano(4)");
        System.out.println("# espresso(5)");
        System.out.println("# mocha(6)");
        System.out.println("# macchiato(7)");
        System.out.println("# lungo(8)");
        System.out.println("# water(9)");
        System.out.println("# Type now: ");

        
        String temp = sc.nextLine();
        int temp2 = Integer.parseInt(temp);
        drinks drink = drinks.fromNumber(temp2);
        System.out.println("# The choosen was: " + drink);


    }

}