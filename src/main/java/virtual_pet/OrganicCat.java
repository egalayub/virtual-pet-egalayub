package virtual_pet;

public class OrganicCat extends OraganicPet{
    public int litterBox = 25;
    public int walkOrganicCat = 50;
    public OrganicCat(String petName, String petType) {
        super(petName, petType);
    }
    public void WalkOrganicCat(){
        this.walkOrganicCat-= 15;
        this.litterBox -=10;
        this.boredom -=10;
    }
    public void cleanLitterBox(){
        this.litterBox -= 20;
    }
    public  String getLitterBox (){

        return "Litter box: " + litterBox;
    }
}

