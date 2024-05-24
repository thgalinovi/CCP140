package com.mycompany.final_project;
import java.util.Scanner;

public class coffee extends control {

    //private boolean power2;
    Scanner sc = new Scanner(System.in);

    public coffee(){

    }

    public void choose() {
        System.out.println("# Machine Coffe: Choose your drink: #");
        System.out.println("# Machine Coffe: Ristretto(1)");
        System.out.println("# Machine Coffe: Cappuccino(2)");
        System.out.println("# Machine Coffe: Latte(3)");
        System.out.println("# Machine Coffe: Americano(4)");
        System.out.println("# Machine Coffe: Espresso(5)");
        System.out.println("# Machine Coffe: Mocha(6)");
        System.out.println("# Machine Coffe: Macchiato(7)");
        System.out.println("# Machine Coffe: Lungo(8)");
        System.out.println("# Machine Coffe: Water(9)");
        System.out.println("# Machine Coffe: Type your option now: ");

        //Log Message
        logger.log("# Machine Coffe: Choose your drink: #");
        logger.log("# Machine Coffe: Ristretto(1)");
        logger.log("# Machine Coffe: Cappuccino(2)");
        logger.log("# Machine Coffe: Latte(3)");
        logger.log("# Machine Coffe: Americano(4)");
        logger.log("# Machine Coffe: Espresso(5)");
        logger.log("# Machine Coffe: Mocha(6)");
        logger.log("# Machine Coffe: Macchiato(7)");
        logger.log("# Machine Coffe: Lungo(8)");
        logger.log("# Machine Coffe: Water(9)");
        logger.log("# Machine Coffe: Type your option now: ");

        String temp = sc.nextLine();
        int temp2 = Integer.parseInt(temp);
        drinks drink = drinks.fromNumber(temp2);
        System.out.println("# Machine Coffe: The choosen was " + drink);
        //Log Message
        logger.log("# Machine Coffe: The choosen was " + drink);
    }
}