package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;
import java.util.Arrays.*; 

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //testing method 2
    String userInput;
    int numberSum; 

    System.out.println("Enter a sentence");
    userInput = key.readLine();

    numberSum = Utility.sumNumbers(userInput);

    System.out.println(numberSum); 

  }
}
