package virtual_pet;

public class OraganicPet extends Virtualpet {
    public int hunger;
    public int thirst;
    public int boredom;
    public int litterBox;
    public OraganicPet(String petName, String petType) {
        super(petName, petType);
    }
    public void playWithPet(){
        if (boredom < 0){
            boredom = 0;
        }
        this.boredom -= 15;
        this.hunger+= 5;
    }
    public void feedPet(){
        if (hunger< 0){
            hunger= 0;
        }
        this.hunger-= 15;
        this.thirst += 5;
    }
    public void waterPet(){
        if (thirst< 0){
            thirst =0;
        }
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
    public void cleanLitterBox(){
        this.litterBox -= 50;
    }
    public  String getLitterBox (){
        return "Litter box: " + litterBox;
    }
}
