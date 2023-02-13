package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetShelterTest {



    @Test
    void admitAnOrganicPet() {
        new VirtualPetShelter().userAdmitsOrganicPet(new OraganicPet("Felix", "Organic"));
    }

    @Test
    void admitAnRoboticPet() {
        new VirtualPetShelter().userAdmitsRoboticPet(new RoboticPet("Robo", "Robotic"));
    }

    @Test
    void organicPetStats() {
        for (OraganicPet organicPet : new VirtualPetShelter().getAllOrganicPets()) {
            System.out.println(organicPet);
        }

    }

    @Test
    void roboticPetStats() {
        for (RoboticPet roboticPet : new VirtualPetShelter().getAllRoboticPets()) {
            System.out.println(roboticPet);
        }
    }
}