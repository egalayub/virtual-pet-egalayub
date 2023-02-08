package virtual_pet;

public class OraganicPet extends Virtualpet {
    public int hunger = 50;
    public int thirst = 50;
    public int boredom = 50;


    public OraganicPet(String petName, String petType) {
        super(petName, petType);
    }




    public void playWithPet() {
        this.boredom -= 15;
        this.hunger += 5;
        if (this.boredom <=0) {
            this.boredom = 0;
        }

    }

    public void feedPet() {
        this.hunger -= 15;
        this.thirst += 5;
        if (this.hunger <= 0) {
            this.hunger = 0;
        }

    }

    public void waterPet() {
        this.boredom -= 15;
        this.thirst += 5;
        if (this.thirst <=0) {
            this.thirst = 0;
        }

    }

    public String getPetName() {
        return petName;
    }

    public String getHunger() {

        return " Hunger: " + hunger + " ";
    }


    public String getThirst() {

        return "Thirst: " + thirst + " ";
    }

    public String getBordom() {

        return "Boredom: " + boredom + " ";
    }


}
