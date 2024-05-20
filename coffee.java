package com.mycompany.orientecao_projeto;

import java.util.Scanner;

public class coffee {

    private boolean power;
    Scanner sc = new Scanner(System.in);
    
    public void setPower(boolean power) {
        if(power == false){
            System.out.println("# The Coffee Machine is offline now.");
        }else{
        System.out.println("# Turning on the Coffee Machine.");
        this.power = power;
        }
    }

    public void choose() {
        System.out.println("# Choose your drink: #");
        System.out.println("# ristretto(1)");
        System.out.println("# cappuccino(2)");
        System.out.println("# latte(3)");
        System.out.println("# americano(4)");
        System.out.println("# espresso(5)");
        System.out.println("# mocha(6)");
        System.out.println("# macchiato(7)");
        System.out.println("# lungo(8)");
        System.out.println("# water(9)");
        System.out.println("# Type your option now: ");

        String temp = sc.nextLine();
        int temp2 = Integer.parseInt(temp);
        drinks drink = drinks.fromNumber(temp2);
        System.out.println("# The choosen was: " + drink);
    }
}
