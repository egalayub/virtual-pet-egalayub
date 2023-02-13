package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public HashMap<String, RoboticPet> roboticPetsInShelter = new HashMap<>();
    public HashMap<String, OraganicPet> organicPetsInShelter = new HashMap<>();

    public Collection<RoboticPet> getAllRoboticPets() {
        return roboticPetsInShelter.values();
    }

    public Collection<OraganicPet> getAllOrganicPets() {
        return organicPetsInShelter.values();
    }


    public void adoptOrganicPet(OraganicPet a) {
        organicPetsInShelter.put(a.getPetName(), a);
    }



    public void adoptRoboticPet(RoboticPet a) {
        roboticPetsInShelter.put(a.getRoboticPetName(), a);
    }


    public void ifAdopted() {
        String name = "";
        organicPetsInShelter.remove(name);
    }


    public void putOrganicPet(OraganicPet pet) {
        String usersChoice = pet.getPetName();
        organicPetsInShelter.put(usersChoice, pet);
    }

    public void putRoboticPet(RoboticPet pet) {
        String usersChoice = pet.getRoboticPetName();
        roboticPetsInShelter.put(usersChoice, pet);
    }

    public void feedOrganicPets() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
            OraganicPet organic = (OraganicPet) pets;
            organic.feedPet();
        }
    }

    public void waterOrganicPets() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
            OraganicPet oraganic = (OraganicPet) pets;
            oraganic.waterPet();
        }


    }

    public void playWithOrganicPets() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
            OraganicPet oraganic = (OraganicPet) pets;
            oraganic.playWithPet();

        }

    }

    public void playWithRoboticPets() {
        for (RoboticPet pets : roboticPetsInShelter.values()) {
            RoboticPet Robotic = (RoboticPet) pets;
            Robotic.playWithRoboticPet();
        }
    }

    public void MaintainRoboticPets() {
        for (RoboticPet pets : roboticPetsInShelter.values()) {
                RoboticPet Robotic = (RoboticPet) pets;
                Robotic.maintainPet();

        }

    }

    public void OilRoboticPets() {
        for (RoboticPet pets : roboticPetsInShelter.values()) {
                RoboticPet Robotic = (RoboticPet) pets;
                Robotic.OilPet();
        }

    }

    public void walkOrganicPets() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
                OrganicDog OrganicDog = (OrganicDog) pets;
                OrganicDog.WalkOrganicDog();
                OrganicCat organicCat = (OrganicCat) pets;
                organicCat.WalkOrganicCat();
            }
        }

    public void cleanLitterBoxes() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
                OrganicCat organicCat = (OrganicCat) pets;
                organicCat.cleanLitterBox();
        }
    }

    public void cleanDogCages() {
        for (OraganicPet pets : organicPetsInShelter.values()) {
                OrganicDog organicDog = (OrganicDog) pets;
                organicDog.cleanDogCage();
        }
    }

    public String OrganicPetStats() {
        String organicPetStats = "";
        for (Map.Entry<String, OraganicPet> pets : organicPetsInShelter.entrySet()) {
                organicPetStats += pets.getValue().getPetName().toString() + pets.getValue().getHunger() + pets.getValue().getThirst() + pets.getValue().getBordom();
            }
        return organicPetStats;
        }
    public String getDogCageStats() {
        String dogCageStats = "";
        for (OraganicPet pets : organicPetsInShelter.values()) {
                OrganicDog organicDog = (OrganicDog) pets;
               dogCageStats = organicDog.getDogCage();

        }
        return dogCageStats;
    }


    public String getLitterBoxStats() {
        String OrganicCatLitterBox = "";
        for (OraganicPet pets : organicPetsInShelter.values()) {
                OrganicCat organicCat = (OrganicCat) pets;
              OrganicCatLitterBox +=  organicCat.getLitterBox();
            }

        return OrganicCatLitterBox;
    }


    public String RoboticPetStats() {
        String roboticPetStats = "";
        for (Map.Entry<String, RoboticPet> pets : roboticPetsInShelter.entrySet()) {
            roboticPetStats += pets.getValue().getRoboticPetName().toString() + pets.getValue().getPetMaintenance() + pets.getValue().getPetOil() + pets.getValue().getRoboticPetBoredom() ;
        }

        return roboticPetStats;
    }



    public String userAdmitsOrganicPet(OraganicPet oraganicPet) {
        String userChoice = "";
        for (Map.Entry<String, OraganicPet> pets : organicPetsInShelter.entrySet()) {
            userChoice += pets.getValue() + " ";
        }
        return userChoice;
    }

    public String userAdmitsRoboticPet(RoboticPet roboticPet) {
        String userChoice = "";
        for (Map.Entry<String, RoboticPet> pets : roboticPetsInShelter.entrySet()) {
            userChoice += pets.getValue() + " ";
        }
        return userChoice;
    }

    public String userAdoptsOrganicPet() {
        String userChoice = "";
        for (Map.Entry<String, OraganicPet> pets : organicPetsInShelter.entrySet()) {
            userChoice += pets.getValue().getPetName() + " ";
        }
        return userChoice;

    }

    public String userAdoptsRoboticPet() {
        String userChoice = "";
        for (Map.Entry<String, RoboticPet> pets : roboticPetsInShelter.entrySet()) {
            userChoice += pets.getValue().getRoboticPetName() + " ";
        }
        return userChoice;
    }
    public void tickOrganicpets(){
        for (OraganicPet pets : organicPetsInShelter.values()){

                OrganicDog organicDog = (OrganicDog) pets;
                organicDog.OrganicDogTick();
                OrganicCat organicCat = (OrganicCat) pets;
                organicCat.OrganicCatTick();
            }
        }
        public void tickRoboticPets(){
        for (RoboticPet pets : roboticPetsInShelter.values() ){
           RoboticPet roboticPet = (RoboticPet) pets;
           roboticPet.tickRoboticPets();
        }
    }
}


