package virtual_pet;

import java.security.PublicKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public HashMap<String, Virtualpet> petsInShelter = new HashMap<>();


    public Collection<Virtualpet> getAllPets() {
        return petsInShelter.values();

    }

    public void adoptPet(Virtualpet a) {
        petsInShelter.put(a.getPetName(), a);

    }
    public boolean ifAdopted( String name){
        petsInShelter.remove(name);
        return false;
    }

    public Virtualpet returnPet(String petName) {
        return petsInShelter.get(petName);
    }

    public void getPet(Virtualpet pet) {
        String usersChoice = pet.getPetName();
        petsInShelter.put(usersChoice, pet);
    }

    public void feedOrganicPets() {
        for (Virtualpet pets : petsInShelter.values()) {
            if (pets instanceof OraganicPet){
                OraganicPet organic = (OraganicPet) pets;
                organic.feedPet();
            }
        }
    }

    public void waterOrganicPets() {
        for (Virtualpet pets : petsInShelter.values()) {
           if (pets instanceof  OraganicPet){
               OraganicPet oraganic = (OraganicPet) pets;
               oraganic.waterPet();
           }
        }


    }

    public void playWithOrganicPets() {
        for (Virtualpet pets : petsInShelter.values()) {
            if (pets instanceof  OraganicPet){
                OraganicPet oraganic = (OraganicPet) pets;
                oraganic.playWithPet();
            }
        }

    }
    public void playWithRoboticPets() {
        for (Virtualpet pets : petsInShelter.values()) {
            if (pets instanceof  RoboticPet){
                RoboticPet Robotic = (RoboticPet) pets;
                Robotic.playWithRoboticPet();
            }
        }

    }
    public void chargeRoboticPets() {
        for (Virtualpet pets : petsInShelter.values()) {
            if (pets instanceof  RoboticPet){
                RoboticPet Robotic = (RoboticPet) pets;
                Robotic.chargePet();
            }
        }

    }
    public void OilRoboticPets() {
        for (Virtualpet pets : petsInShelter.values()) {
            if (pets instanceof  RoboticPet){
                RoboticPet Robotic = (RoboticPet) pets;
                Robotic.OilPet();
            }
        }

    }
    public String allPetStats(){
        String petStats= "";
        for (Map.Entry<String, Virtualpet> pets : petsInShelter.entrySet()){
            petStats += pets.getValue().getPetName() +  pets.getValue().getHunger() + pets.getValue().getThirst() + pets.getValue().getBordom();
        }
        return  petStats;
    }
    public String userChoice(){
        String userChoice = "";
        for (Map.Entry<String,Virtualpet> pets : petsInShelter.entrySet()){
            userChoice += pets.getValue().getPetName() + " ";
        }
        return userChoice;
    }
    public boolean petCheck(String name) {
        return petsInShelter.containsKey(name);
    }

}


