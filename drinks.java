package com.mycompany.final_project;
public enum drinks {
    
    ristretto(1),
    cappuccino(2),
    latte(3),
    americano(4),
    espresso(5),
    mocha(6),
    macchiato(7),
    lungo(8),
    water(9);

    public int drinksnum;
    drinks(int drinksnum){
      this.drinksnum = drinksnum;
    }


    public int getDrinksnum() {
        return drinksnum;
    }

    public static drinks fromNumber(int number) {
      for (drinks drinks : drinks.values()) {
          if (drinks.getDrinksnum() == number) {
              return drinks;
          }
      }

      throw new IllegalArgumentException("# Invalid Number: " + number);

  }

}