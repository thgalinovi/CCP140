package com.mycompany.orientecao_projeto;

import java.util.HashSet;
import java.util.Scanner;


public class enviroment {
    
    coffee c = new coffee();
    smarttv tv = new smarttv();
    lamp l = new lamp();
    smartsound s = new smartsound();       
    Scanner sc = new Scanner(System.in);
    //ordem (smarttv, lamp, smartsound, coffee
    
    public void netflix(){
        System.out.println(">> Trying to intialize the Netflix Mode. <<");
        l.setPower(false);
        s.setVolume(70);
        tv.setPower(true);
        tv.mode();
    }
    public void music(){
        System.out.println(">> Trying to intialize the Music Mode. <<");
        s.setPower(true);
        s.setVolume(100);
        l.setPower(true);
        l.setColor("red");
        tv.setPower(false);
    }
    public void sleep(){
        System.out.println(">> Trying to intialize the Sleep Mode. <<");
        s.setPower(false);
        l.setPower(false);
        tv.setPower(false);      
    }
    public void morning(){
        System.out.println(">> Trying to intialize the Morning Mode. <<");
        l.setPower(true);
        l.setColor("White");
        l.setBrightness(80);       
        tv.setPower(true);
        s.setPower(true);
        s.setVolume(30);
        
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
