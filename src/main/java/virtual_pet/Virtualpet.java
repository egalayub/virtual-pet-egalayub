package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Virtualpet {
    public String petName;
    public int hunger;
    public int thirst;
    public int waste;
    public int boredom;
    public  int sickness;
    public String actions;
    public Random rand = new Random();

 public Scanner input;
    public Virtualpet( String petName ){

        this.petName = petName;

    }

    public String petHunger (){
        hunger = rand.nextInt(0, 10);
        return "Hunger: " + hunger;

    }
    public String petThirst (){
       thirst = rand.nextInt(0, 10);
        return  "Thirst: " + thirst;
    }
    public String petWaste (){
        waste = rand.nextInt(0, 10);
        return "Waste: " + waste;
    }
    public String petBoredom (){
        boredom= rand.nextInt(0, 10);
        return "Boredom: " +boredom;
    }
    public String petSickness (){
        sickness= rand.nextInt(0, 10);
        return "Sickness: "  + sickness;
    }

    public String feedIt (){
        return "1. Feed " + petName;
    }
    public String waterIt (){
        return "2. Water " + petName;
    }
    public String playWithIt() {
        return "3. Play with " + petName;
    }
public String putToSleep(){
    return "4. Put " + petName + " to sleep";
    }
    public String doNothing(){
        return "5. Do nothing";
    }
}
