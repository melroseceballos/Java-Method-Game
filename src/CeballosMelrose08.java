// IMPORTING JAVA UTIL
import java.util.Scanner;

/**
 *User gets to choose what method they'd like to try out and interact with the code in the method chosen
 *@author      Ceballos,Melrose 
 *@assignment  ICS Assignment 8
 *@date        March 12, 2023
 *@bug         I have 5 bugs of which 3 is with my array, I'm not sure how to fix it.
 *             The rest is me not being able to convert my variables into an array
 **/
 
public class CeballosMelrose08 {
   public static void main(String[] args){
   
   // Declaring my variables here
      String name = "";
      int userChoice = 0;
      String first = "Method 1. Gives you a skittle color depending on your number";
      String second = "Method 2. I will return your words to you in an array!";
      String third = "Method 3. Give me your favorite word and I'll give it back to you!";
      String four = "Method 4. It's all about loops! Number will continue to loop until it reaches your number!";
   
   // Creating java class
      Scanner myScanner = new Scanner(System.in);
      
   // Ask user what their name is
      System.out.println("Hi There! What is your name?");
      name = myScanner.nextLine();
      System.out.println("Nice to meet you,!" + name);
   
   // Asks for user's choice
      System.out.println("Here are some methods I have prepared for you!");
      System.out.println(first);
      System.out.println(second);
      System.out.println(third);
      System.out.println(four);
      userChoice = myScanner.nextInt();
      
   // If statement that calls the method after user choose
   if(userChoice == 1){
       methodOne();
   } else if(userChoice == 2){
       methodTwo();
   } else if(userChoice == 3){
       methodThree();
   } else {
       methodFour();
   }
}
      
      // METHOD ONE GOES HERE
   public static String methodOne(String[] skittleArr) {
    Scanner read = new Scanner(System.in);
    System.out.println("Hey! You chose the Skittles color!");
     System.out.println("Pick a number");
     int userSkittle = 0;
     userSkittle = read.nextInt();
     String[] skittleArr = (["green","red","orange","yellow","purple"]);
     if(userSkittle == 0){
     System.out.println(skittleArr[0]);
   } else if (userSkittle == 1)  {
     System.out.println(skittleArr[1]);
   } else if (userSkittle == 2)  {
     System.out.println(skittleArr[2]);
   } else if (userSkittle == 3)  {
     System.out.println(skittleArr[3]);
   } else{
     System.out.println(skittleArr[4]);   
   }
   
   // METHOD TWO
   public static String methodTwo(String userWordOne, String userWordTwo){
   Scanner words = new Scanner (System.in);
   String userWordOne = "";
   String userWordTwo = "";
   System.out.println("You chose number 2! Give me two words!");
   userWordOne = words.nextLine();
   userWordTwo = words.nextLine();
   String[] array = (userWordOne, userWordTwo);
   System.out.println(array);
   }
      
   // Method Three
   public static String methodThree(String a)   {
   Scanner favoriteWord = new Scanner (System.in);
   String favWord = "";
   System.out.println("Hey! You chose method 3! What's your favorite word?");
   favWord = favoriteWord.nextLine();
   return favWord;
   }
    
    // Method Four
    public static int methodFour(int number){
    Scanner loop = new Scanner(System.in);
    int numberMethod = 0;
    System.out.println("Hey! You chose method 4! Give me a number from 10-15");
    numberMethod = loop.nextInt();
    for (int i= 0; i <numberMethod; i++){
    return numberMethod[i];
    }
    }
}
