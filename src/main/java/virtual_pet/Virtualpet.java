package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Virtualpet {
    public Random rand = new Random();
    public String petName;
    public int hunger;
    public int thirst;
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
        return " You fed " + petName + " food" + " hunger is now " +  ( hunger -3) ;
     } else if (userInput == 2) {
         return " You gave " + petName + " water" + " Thirst is now " +  (thirst -3) ;
     } else if (userInput== 3) {
         return "You played with " +  petName +   " boredom is now " +  (bordom -3)  ;
     } else if (userInput == 0) {
        System.exit(0);
     }
     return "Give a input from the list";
 }

    public  Virtualpet(String petName ){

        this.petName = petName;

    }

    public String petHunger (){
        hunger = rand.nextInt(1, 10);
        if (hunger <= 4){
            System.out.println(petName + " is very hungary please give " +petName + " food before they starve!");
        } else if (hunger >= 5) {
            System.out.println(petName + " is very full please dont feed " + petName);
        }
        return  "Hunger: " + hunger;
    }


    public String petThirst (){
        thirst = rand.nextInt(1, 10);
        if (thirst <= 4){
            System.out.println(petName + " is thirsty please give " +petName + " a drink!");
        } else if (thirst >= 5) {
            System.out.println(petName + " is quenched " + petName + " does not need a drink anymore");
        }
        return  "Thirst: " + thirst;
    }
    public String petBordom (){
        bordom = rand.nextInt(1, 10);
        if (bordom <= 4){
            System.out.println(petName + " is having fun continue playing with " +petName);
        } else if (bordom >= 5) {
            System.out.println(petName + " is getting bored please play with " + petName);
        }
        return  "Bordom: " + bordom;

    }
    public String getTick(){
     if (bordom < 4  || hunger < 3){
         thirst++;
     } else if (hunger>=5 || thirst>=5) {
         bordom++;
     }else if (bordom > 5 || thirst < 3) {
         hunger++;
     }
       return getActions();
    }

}
