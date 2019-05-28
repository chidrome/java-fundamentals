/*
 * Paolo Chidrome
 * Lab 1 for CF Java 401
 * 28 May 2019
 * Main.java
 */

import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
  // main method is the code that will be run when we compile/run this code
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);
    flipNHeads(5);

    clock();
  }

  /* 
   * Method takes in a word and a number and,
   * pluralizes the word if number is greater than 1 or 0.
   * @param word String
   * @param numberOfAnimals int
   * @return word String
   */
  public static String pluralize(String word, int numberOfAnimals){
    if(numberOfAnimals > 1 || numberOfAnimals == 0){
      return word+="s";
    } else {
      return word;
    }
  }

  /*
   * Accepts an integer n and flips coins until n heads are flipped in a row. 
   * @param neededNumberOfFlipsInARow
   */
  public static void flipNHeads(int neededNumberOfFlipsInARow){
    int headFlipsInARow = 0;
    int totalFlips = 0;
    while(neededNumberOfFlipsInARow != headFlipsInARow){
      boolean isLastFlipHead = false;
      double randomNumber = Math.random();
      if(randomNumber > .5 && isLastFlipHead) {
        System.out.println("Heads" + randomNumber);
        headFlipsInARow++;
      } else if(randomNumber > .5){
        isLastFlipHead = true;
        headFlipsInARow++;
        System.out.println("Heads" + randomNumber);
      } else {
        isLastFlipHead = false;
        headFlipsInARow = 0;
        System.out.println("Tails");
      }
      totalFlips++;
    }
    if(totalFlips > 1 && neededNumberOfFlipsInARow == 1){
      System.out.println("It took " + totalFlips + " flips to get 1 head in a row.");
    } else if(totalFlips == 1 && neededNumberOfFlipsInARow ==1){
      System.out.println("It took 1 flip to get 1 head in a row.");
    } else {
      System.out.println("It took " + totalFlips + " flips to get " + neededNumberOfFlipsInARow + " heads in a row");
    }
  }

  /* 
   * The program should run until someone manually kills it with CTRL-C
   * or presses the “stop” button in their IDE. 
   * Each time should only be printed once. 
   * Your program should detect when the seconds increase 
   * and only print something out when the timestamp changes.
   */
  public static void clock(){
    LocalDateTime timeNow = LocalDateTime.now();
    while(true){
      LocalDateTime currentTime = LocalDateTime.now();
      if(timeNow.getSecond() != currentTime.getSecond()){
        timeNow = currentTime;
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      }
    }
  }

}
