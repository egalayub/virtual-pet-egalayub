package virtual_pet;

public class RoboticPet extends Virtualpet {
    public int petChargeLevel;
    public int  petOil;
    public int boredom;



    public RoboticPet(String petName, String petType) {
        super(petName, petType);
    }
    public void playWithRoboticPet(){
        if (boredom < 0){
            boredom = 0;
        }
        this.boredom -= 15;
        this.petChargeLevel+= 10;
    }
    public void OilPet(){
        if (petOil < 0 ){
            petOil =0;
        }
        this.petOil-= 15;

    }
  public void chargePet(){
        if (petChargeLevel <0){
            petChargeLevel = 0;
        }
        this.petChargeLevel-=15;
  }


    public String getRoboticPetBoredom() {

        return "boredom: " + boredom;
    }


    public String getPetOil() {

        return "Oil Level: " + petOil;
    }

    public String getPetCharge() {

        return "Battery Level : " + petChargeLevel;
    }
}
