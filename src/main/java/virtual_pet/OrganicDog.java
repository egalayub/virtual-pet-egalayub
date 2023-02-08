package virtual_pet;

public class OrganicDog extends OraganicPet{
    public int dogCage;
    public int walkOrganicDog = 50;
    public OrganicDog(String petName, String petType) {
        super(petName, petType);
    }
    public void WalkOrganicDog(){
        this.walkOrganicDog-= 15;
        this.dogCage -=10;
        this.boredom -=10;
    }
    public void cleanDogCage(){
        this.dogCage -= 50;
    }
    public String getDogCage(){
        return " Dog cage Cleanliness" + dogCage;
    }
}
