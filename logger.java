package com.mycompany.final_project;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class logger {
  private static final String LOG_FILE = "log.txt";

  public static void log(String message) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String timestamp = now.format(formatter);

    PrintWriter writer = null;
    try {
      writer = new PrintWriter(new FileWriter(LOG_FILE, true));
      writer.println(timestamp + " - " + message);
    } catch (IOException e) {
      System.err.println("Error to print the Log: " + e.getMessage());
    } finally {
      if (writer != null) {
        writer.close();
      }
    }
  }

  public static void clear() {
      PrintWriter writer = null;
      try {
        writer = new PrintWriter(new FileWriter(LOG_FILE, false)); // O segundo argumento 'false' sobrescreve o arquivo
        writer.print(""); // Escreve uma string vazia no arquivo
      } catch (IOException e) {
        System.err.println("Error to clear the Log: " + e.getMessage());
      } finally {
        if (writer != null) {
          writer.close();
        }
      }
    }
  }
