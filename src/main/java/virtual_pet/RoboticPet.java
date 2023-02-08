package virtual_pet;

public class RoboticPet extends Virtualpet {
    public int petMaintenance = 50;
    public int  petOil= 75;
    public int boredom = 75;



    public RoboticPet(String petName, String petType) {
        super(petName, petType);
    }
    public String getRoboticPetName() {
        return petName;
    }
    public void playWithRoboticPet(){
        if (this.boredom < 0){
           this.boredom = 0;
        }
        this.boredom -= 15;
        this.petMaintenance+= 10;
    }
    public void OilPet(){
        if (this.petOil < 0 ){
            this.petOil =0;
        }
        this.petOil-= 15;

    }
  public void maintainPet(){
        if (this.petMaintenance <0){
            this.petMaintenance = 0;
        }
        this.petMaintenance-=15;
  }


    public String getRoboticPetBoredom() {

        return " boredom: " + boredom;
    }


    public String getPetOil() {

        return " Oil Level: " + petOil;
    }

    public String getPetMaintenance() {

        return " Maintenance Level: " + petMaintenance;
    }
    public void tickRoboticPets(){
        this.petOil += 10;
        this.petMaintenance +=10;
        this.boredom += 10;
    }
}
