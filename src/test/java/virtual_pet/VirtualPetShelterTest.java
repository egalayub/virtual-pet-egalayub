package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetShelterTest {

    @Test
    void printsOutPetsNameWhenCalled() {
        VirtualPetShelter test = new VirtualPetShelter();
        assertEquals("2.Scooby doo The Dog", test.petsUpForAdoption.get(1));
    }

    @Test
    void printsAllPetsStats() {
        VirtualPetShelter test = new VirtualPetShelter();
        Virtualpet a = new Virtualpet();
        assertEquals(test.petsUpForAdoption.get(0) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst() + " " + test.petsUpForAdoption.get(1) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst() + " " + test.petsUpForAdoption.get(2) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst(), test.getPetStats());
    }
}