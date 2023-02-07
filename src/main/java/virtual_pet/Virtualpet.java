package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Virtualpet {

    public String petName;
    public int hunger;
    public int thirst;
    public int boredom;


    public Virtualpet(String petName,int hunger, int thirst, int boredom) {
        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    public void playWithPet(){
        this.boredom -= 15;
        this.hunger+= 5;
    }
    public void feedPet(){
        this.hunger-= 15;
        this.thirst += 5;
    }
    public void waterPet(){
        this.boredom -= 15;
        this.thirst += 5;
    }
    public String getPetName() {
        return petName;
    }

    public String getHunger() {

        return " Hunger: " + hunger  + " ";
    }


    public String getThirst() {

        return "Thirst: " +thirst  + " ";
    }

    public String getBordom() {

        return "Boredom: " + boredom + " ";
    }
}

