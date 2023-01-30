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

    public String getPetName(){
        VirtualPetShelter a = new VirtualPetShelter();
        int userInput = input.nextInt();
        if (userInput == 1){
            petName = a.petsUpForAdoption.get(0);
        } else if (userInput ==2 ) {
            petName = a.petsUpForAdoption.get(1);
        }else if (userInput == 3){
            petName = a.petsUpForAdoption.get(2);
        }
        return petName;
    }

 public String getActions(){
     VirtualPetShelter a = new VirtualPetShelter();
     System.out.println("What do you want to do with " + getPetName());
     System.out.println("1.feed " + getPetName());
     System.out.println("2.Water " + getPetName());
     System.out.println("3.Play with " + getPetName());
     System.out.println("4.Return " + getPetName() + " Back to the Shelter");
     System.out.println("0.exit");
     int userInput = input.nextInt();
     if (userInput == 1){
        return " You fed " + getPetName() + " food" + " hunger is now " + getTick() +  ( hunger -3) ;
     } else if (userInput == 2) {
         return " You gave " + getPetName() + " water" + " Thirst is now " + getTick() + (thirst -3)   ;
     } else if (userInput== 3) {
         return "You played with " +  getPetName() +   " boredom is now " + getTick() + (bordom -3)  ;
     } else if (userInput == 0) {
        System.exit(0);
     }else if (userInput == 4){
         System.out.println(a.admitPetIntoShelter());
     }
     return "Give a input from the list";
 }


    public  Virtualpet( ){

        this.petName = petName;

    }

    public String petHunger (){
        hunger = rand.nextInt(1,10);

        return  "Hunger: " + hunger;
    }


    public String petThirst (){
        thirst = rand.nextInt(1,10);

        return  "Thirst: " + thirst;
    }
    public String petBordom (){
        bordom = rand.nextInt(1,10);

        return  "Bordom: " + bordom;

    }
    public  int getTick(){
     if (bordom < 4  || hunger < 3){
        int a= thirst+2;
        return a;
     } else if (hunger >=5 || thirst>=5) {
         int b = bordom+2;
       return b;
     }else if (bordom > 5 || thirst < 3) {
         int c = hunger + 2;
         return c;
     }
       return 0;
    }

}
