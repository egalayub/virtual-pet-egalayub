package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Virtualpet {
    public Random rand = new Random();
    public String petName;
    public int hunger;
    public int thirst ;
    public int bordom;
    public String actions;
    public Scanner input = new Scanner (System.in);



 public String getActions(){
     System.out.println("What do you want to do with " + petName);
     System.out.println("1.feed " + petName);
     System.out.println("2.Water " + petName);
     System.out.println("3.Play with " + petName);
     System.out.println("0.exit");
     int userInput = input.nextInt();
     if (userInput == 1){
        return " You fed " + petName + " food" + " hunger is now " +  ( hunger -3);
     } else if (userInput == 2) {
         return " You gave " + petName + " water" + " Thirst is now " +  (thirst -3) ;
     } else if (userInput== 3) {
         return "You played with " +  petName +   " boredom is now " +  (bordom -3) ;
     } else if (userInput == 0) {
        System.exit(0);
     }
     return "Give a input from the list";
 }

    public Virtualpet( String petName ){
        this.petName = petName;

    }

    public String petHunger (){
        hunger = rand.nextInt(5, 10);
        return  "Hunger: " + hunger;
    }


    public String petThirst (){
       thirst = rand.nextInt(5, 10);
        return  "Thirst: " + thirst;
    }
    public String petBordom (){
        bordom = rand.nextInt(5, 10);
        return  "Bordom: " + thirst;
    }
    public boolean getTick(){
     int userInput = input.nextInt();
     if (userInput == 1){
         thirst++;
     } else if (userInput == 2) {
         bordom++;
     } else if (userInput == 3) {
         hunger++;
     }
        this.hunger++;
     this.thirst++;
     this.bordom++;
        return false;
    }

    /*  public String petWaste (){
        waste = rand.nextInt(0, 10);
        return "Waste: " + waste;
    }*/

    /*public String feedIt (){
        return "1. Feed " + petName;
    }
    public String waterIt (){
        return "2. Water " + petName;
    }

public String putToSleep(){
    return "4. Put " + petName + " to sleep";
    }
    public String doNothing(){
        return "5. Do nothing";
    }*/
}
