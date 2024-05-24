
package com.mycompany.final_project;

import java.util.Scanner;

public class Final_project {

    public static void main(String[] args) {
    logger logger = new logger();
    logger.clear();
   
    Scanner sc2 = new Scanner(System.in);
    environment e2 = new environment();
    control c2 = new control();

    smarttv tv2 = new smarttv();
    smartsound s2 = new smartsound();
    lamp l2 = new lamp();
    coffee coffee2 = new coffee();
    //Serial Message
    System.out.println(">> HELLO, USER!! <<");
    System.out.println("# Choose:");
    System.out.println("#Type 1 for Preset Menu.");
    System.out.println("#Type 2 for Individual Choose.");
    System.out.println("#Type now:");
    //Log Message
    logger.log(">> HELLO, USER!! <<");
    logger.log("# Choose:");
    logger.log("#Type 1 for Preset Menu.");
    logger.log("#Type 2 for Individual Choose.");
    logger.log("#Type now:");
    String first_option = sc2.nextLine();
    int first_option_integer = Integer.parseInt(first_option);
    switch (first_option_integer) {
      case 1 -> {
        //Serial Message
        System.out.println("________________________________________________________");
        System.out.println(">> Initializing Preset Menu Mode... << ");
        System.out.println("#Type 1 for Netflix Preset.");
        System.out.println("#Type 2 for Music Preset.");
        System.out.println("#Type 3 for Sleep Preset.");
        System.out.println("#Type 4 for Morning Preset.");
        System.out.println("#Type your option now:");
        //Log Message
        logger.log("________________________________________________________");
        logger.log(">> Initializing Preset Menu Mode... << ");
        logger.log("#Type 1 for Netflix Preset.");
        logger.log("#Type 2 for Music Preset.");
        logger.log("#Type 3 for Sleep Preset.");
        logger.log("#Type 4 for Morning Preset.");
        logger.log("#Type your option now:");

        String preset_menu_option = sc2.nextLine();
        int preset_menu_option_integer = Integer.parseInt(preset_menu_option);
        switch (preset_menu_option_integer) {

          case 1 -> {
            e2.netflix();
          }
          case 2 -> {
            e2.music();
          }
          case 3 -> {
            e2.sleep();
          }
          case 4 -> {
            e2.morning();
          }
          default -> {
            System.out.println("# Invalid Command.");
          }
        }
      }
      case 2 -> {
        //Serial Message
        System.out.println("________________________________________________________");
        System.out.println(">> What do you want do in this moment? <<");
        System.out.println("# I want to send a command to the Coffee Machine. (Type 1)");
        System.out.println("# I want to send a command to the SmartTV. (Type 2)");
        System.out.println("# I want to send a command to the Lamp. (Type 3)");
        System.out.println("# I want to send a command to the Smart Sound (Type 4).");
        System.out.println("# Type your option now:");
        //Log Message
        logger.log("________________________________________________________");
        logger.log(">> What do you want do in this moment? <<");
        logger.log("# I want to send a command to the Coffee Machine. (Type 1)");
        logger.log("# I want to send a command to the SmartTV. (Type 2)");
        logger.log("# I want to send a command to the Lamp. (Type 3)");
        logger.log("# I want to send a command to the Smart Sound (Type 4).");
        logger.log("# Type your option now:");

        String second_option = sc2.nextLine();
        int second_option_integer = Integer.parseInt(second_option);
        switch (second_option_integer) {

          case 1 -> {

            System.out.println("# Do you want to turn on the Coffe Machine? (Type Y/N)");
            //Log Message
            logger.log("# Do you want to turn on the Coffe Machine? (Type Y/N)");
            String third_option = sc2.nextLine();
            if (third_option.equals("N") || third_option.equals("n")) {
                System.out.println(">> Bye, see you soon! << ");
                //Log Message
                logger.log(">> Bye, see you soon! << ");
                break;
            }else if (third_option.equals("Y") || third_option.equals("y")) {
              control[] x = new control[1];
              x[0] = new coffee();
              c2.on(x);
              coffee2.choose();
            } else {
              System.out.println("# Invalid option.! ");
              //Log Message
              logger.log("# Invalid option.! ");
              break;
            }

          }
          case 2 -> {
            //Log Message
            logger.log("# Do you want to turn on the SmarTV? (Type Y/N)");
            System.out.println("# Do you want to turn on the SmarTV? (Type Y/N)");
            String third_option = sc2.nextLine();
            if (third_option.equals("N") || third_option.equals("n")) {
                
                System.out.println(">> Bye, see you soon! << ");
                //Log Message
                logger.log(">> Bye, see you soon! << ");
                break;
            } else if (third_option.equals("Y") || third_option.equals("y")) {
              control[] x = new control[1];
              x[0] = new smarttv();
              c2.on(x);
              System.out.println("# What are  your preference channel number?");
              //Log Message
              logger.log("# What are  your preference channel number?");
              String channel_number = sc2.nextLine();
              int channel_number_integer = Integer.parseInt(channel_number);
              tv2.setChannel(channel_number_integer);
              
            } else {
              //Log Message
              logger.log("# What are  your preference channel number?");
              System.out.println("# Invalid option.! ");
              break;
            }

          }
          case 3 -> {

            System.out.println("# Do you want to turn on the Lamp? (Type Y/N)");
            //Log Message
            logger.log("# Do you want to turn on the Lamp? (Type Y/N)");
            String third_option = sc2.nextLine();
            if (third_option.equals("N") || third_option.equals("n")) {
              //Log Message
              logger.log(">> Bye, see you soon! << ");
              System.out.println(">> Bye, see you soon! << ");
              break;
            } else if (third_option.equals("Y") || third_option.equals("y")) {
              control[] x = new control[1];
              x[0] = new lamp();
              c2.on(x);
              System.out.println("# What are  your preference color?");
              //Log Message
              logger.log("# What are  your preference color?");
              String lamp_color = sc2.nextLine();
              l2.setColor(lamp_color);
              System.out.println("# What is the brightness value?");
              //Log Message
              logger.log("# What is the brightness value?");
              String brightness_number = sc2.nextLine();
              int brightness_number_integer = Integer.parseInt(brightness_number);
              l2.setBrightness(brightness_number_integer);
            } else {
              //Log Message
              logger.log("# What is the brightness value?");           
              System.out.println("# Invalid option.!");
              break;
            }
          }

          case 4 -> {
            //Log Message
            logger.log("# Do you want to turn on the Smart Sound? (Type Y/N)");         
            System.out.println("# Do you want to turn on the Smart Sound? (Type Y/N)");
            String third_option = sc2.nextLine();
            if (third_option.equals("N") || third_option.equals("n")) {
              //Log Message
              logger.log(">> Bye, see you soon! << ");
              System.out.println(">> Bye, see you soon! << ");
              break;
            } else if (third_option.equals("Y") || third_option.equals("y")) {
              control[] x = new control[1];
              x[0] = new smartsound();
              c2.on(x);
              //Log Message
              logger.log("What are your preference volume number?");
              System.out.println("# What are your preference volume number?");
              String volume_number = sc2.nextLine();
              int volume_number_integer = Integer.parseInt(volume_number);
              s2.setVolume(volume_number_integer);
            } else {
              //Log Message
              logger.log("# Invalid option.!");
              System.out.println("# Invalid option.!");
              break;
            }
          }
        }
      }
      default -> {
        //Log Message
        logger.log("# Invalid Command.");
        System.out.println("# Invalid Command.");
      }
    }
    }
}
