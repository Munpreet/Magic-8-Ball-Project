// import math to use random tool
import java.lang.Math;

public class Magic8 {

  // declaring the random instance, use static to "save" the value when using in main
  static int rand= (int)(Math.random() * 8);

  public static void main(String[] args) {
    
    // run the code in main and print out the randomly decided fortune-telling
    switch(rand) {
      
      case 0:
      System.out.println("Be happy better things will come have faith");
      break;
      case 1:
      System.out.println("Expect good things coming your way~");
      break;
      case 2:
      System.out.println("Ohh nooo better luck is not on your side this month");
      break;
      case 3:
      System.out.println(" Good news Luck in wealth, is coming your way!");
      break;
      case 4:
      System.out.println("Always look after yourself espcially this week");
      break;
      case 5:
      System.out.println("Always be aware whats around the corner");
      break;
      case 6:
      System.out.println("Overcome your fears; success awaits in the near future. ");
      break;
      case 7:
      System.out.println("Gain a partner; lose a partner");
      break;
      default: 
      System.out.println("Uhoohh something doesnt seem too good");
      break;
    }
  }
}