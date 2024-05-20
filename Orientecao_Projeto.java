package com.mycompany.orientecao_projeto;

import java.util.Scanner;

public class Orientecao_Projeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enviroment e = new enviroment();
        coffee c = new coffee();
        smarttv tv = new smarttv();
        lamp l = new lamp();
        smartsound s = new smartsound();

        System.out.println(">> HELLO, USER!! <<");
        System.out.println("# Choose:");
        System.out.println("#Type 1 for Preset Menu.");
        System.out.println("#Type 2 for Individual Choose.");
        System.out.println("#Type now:");
        String first_option = sc.nextLine();
        int first_option_integer = Integer.parseInt(first_option);
        switch (first_option_integer) {
            case 1 -> {
                System.out.println("________________________________________________________");
                System.out.println(">> Initializing Preset Menu Mode... << ");
                System.out.println("#Type 1 for Netflix Preset.");
                System.out.println("#Type 2 for Music Preset.");
                System.out.println("#Type 3 for Sleep Preset.");
                System.out.println("#Type 4 for Morning Preset.");
                System.out.println("#Type your option now:");

                String preset_menu_option = sc.nextLine();
                int preset_menu_option_integer = Integer.parseInt(preset_menu_option);
                switch (preset_menu_option_integer) {

                    case 1 -> {
                        e.netflix();
                    }
                    case 2 -> {
                        e.music();
                    }
                    case 3 -> {
                        e.sleep();
                    }
                    case 4 -> {
                        e.morning();
                    }
                    default -> {
                        System.out.println("# Invalid Command.");
                    }
                }
            }
            case 2 -> {
                System.out.println(">> What do you want do in this moment? <<");
                System.out.println("# I want to send a command to the Coffee Machine. (Type 1)");
                System.out.println("# I want to send a command to the SmartTV. (Type 2)");
                System.out.println("# I want to send a command to the Lamp. (Type 3)");
                System.out.println("# I want to send a command to the Smart Sound (Type 4).");
                System.out.println("# Type your option now:");

                String second_option = sc.nextLine();
                int second_option_integer = Integer.parseInt(second_option);
                switch (second_option_integer) {

                    case 1 -> {

                        System.out.println("# Do you want to turn on the Coffe Machine? (Type Y/N)");
                        String third_option = sc.nextLine();
                        if (third_option.equals("N") || third_option.equals("n")) {
                            System.out.println(">> Bye, see you soon! << ");
                            break;
                        } else if (third_option.equals("Y") || third_option.equals("y")) {

                            c.setPower(true);
                            c.choose();
                        } else {
                            System.out.println("# Invalid option.! ");
                            break;
                        }

                    }
                    case 2 -> {

                        System.out.println("# Do you want to turn on the SmarTV? (Type Y/N)");
                        String third_option = sc.nextLine();
                        if (third_option.equals("N") || third_option.equals("n")) {
                            System.out.println(">> Bye, see you soon! << ");
                            break;
                        } else if (third_option.equals("Y") || third_option.equals("y")) {
                            tv.setPower(true);
                            System.out.println("# What are  your preference channel number?");
                            String channel_number = sc.nextLine();
                            int channel_number_integer = Integer.parseInt(channel_number);
                            tv.setChannel(channel_number_integer);
                        } else {
                            System.out.println("# Invalid option.! ");
                            break;
                        }

                    }
                    case 3 -> {

                        System.out.println("# Do you want to turn on the Lamp? (Type Y/N)");
                        String third_option = sc.nextLine();
                        if (third_option.equals("N") || third_option.equals("n")) {
                            System.out.println(">> Bye, see you soon! << ");
                            break;
                        } else if (third_option.equals("Y") || third_option.equals("y")) {
                            l.setPower(true);
                            System.out.println("# What are  your preference color?");
                            String lamp_color = sc.nextLine();
                            l.setColor(lamp_color);
                        } else {
                            System.out.println("# Invalid option.!");
                            break;
                        }
                        System.out.println("# What is the brightness value?");
                        String brightness_number = sc.nextLine();
                        int brightness_number_integer = Integer.parseInt(brightness_number);
                        l.setBrightness(brightness_number_integer);
                    }
                    
                    case 4 ->{
                        
                        System.out.println("# Do you want to turn on the Smart Sound? (Type Y/N)");
                        String third_option = sc.nextLine();
                        if (third_option.equals("N") || third_option.equals("n")) {
                            System.out.println(">> Bye, see you soon! << ");
                            break;
                        } else if (third_option.equals("Y") || third_option.equals("y")) {
                            s.setPower(true);
                            System.out.println("# What are your preference volume number?");
                            String volume_number = sc.nextLine();
                            int volume_number_integer = Integer.parseInt(volume_number);
                            s.setVolume(volume_number_integer);
                        } else {
                            System.out.println("# Invalid option.!");
                            break;
                        }                                     
                    }
                }
            }
            default -> {
                System.out.println("# Invalid Command.");
            }
        }
    }
}
