package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Virtualpet {
    public Random rand = new Random();
    public String petName;
    public int hunger;
    public int thirst;
    public int boredom;
    public String actions;
    public Scanner input = new Scanner(System.in);


public void gameMenu(){

}
    public String getPetName() {
        VirtualPetShelter a = new VirtualPetShelter();
        int userInput = input.nextInt();
        if (userInput ==1) {
            petName = a.petsUpForAdoption.get(0);
        } else if (userInput == 2) {
            petName = a.petsUpForAdoption.get(1);
        } else if (userInput == 3) {
            petName = a.petsUpForAdoption.get(2);
        }
        return petName;
    }
    public String getActions() {
        VirtualPetShelter a = new VirtualPetShelter();
        System.out.println("Enter the pet number to continue");
        petName =getPetName();
        System.out.println("What do you want to do with " + petName);
        System.out.println("1.feed " + petName);
        System.out.println("2.Water " + petName);
        System.out.println("3.Play with " + petName);
        System.out.println("4.Return " + petName + " Back to the Shelter");
        System.out.println("0.exit");

        int userInput = input.nextInt();
        if (userInput == 1 ) {
            return " You fed " + petName + " food" + " hunger is now " + petHunger() ;
        } else if (userInput == 2) {
            return " You gave " + petName + " water" + " Thirst is now " +  petThirst();
        } else if (userInput == 3) {
            return "You played with " + petName + " boredom is now "  + petBoredom() ;
        } else if (userInput == 0) {
            System.exit(0);
        } else if (userInput == 4) {
            return a.admitPetIntoShelter();
        }
        return "Give a input from the list";
    }


    public Virtualpet() {

        this.petName = petName;

    }

    public String petHunger() {
        hunger = 8;
        int a = getTick()+ hunger ;
        int b = hunger+ getTick();
        int c = b + a;
        return "Pet Hunger: " + c;
    }


    public String petThirst() {
        thirst = 5;
         int a = getTick()+ thirst ;
         int b = thirst + getTick();
        int c = a-b;
        return "Pet Thirst: " + c;
    }

    public String petBoredom() {
        boredom = 2;
        int a = getTick()+ boredom ;
        int b = boredom + getTick();
        int c = b + a;

        return "Pet Bordom: " + c;

    }

    public int getTick() {
        if (boredom < 4 || hunger < 3) {
           this.thirst = thirst + 2;
            return thirst;
        } else if (hunger >= 5 || thirst >= 5) {
            int b = boredom + 2;
            return b;
        } else if (boredom > 5 || thirst < 3) {
            int c = hunger + 2;
            return c;
        }
        return 0;
    }

}
