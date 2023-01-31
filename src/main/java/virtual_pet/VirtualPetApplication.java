package virtual_pet;

import java.util.*;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Pet Shelter!");
        System.out.println("Please pick  a pet you would like to adopt");
        VirtualPetShelter b = new VirtualPetShelter();
        Virtualpet a = new Virtualpet();
        System.out.println(b.petsUpForAdoption);
        System.out.println(b.getPetStats());
        System.out.println(b.adoptPetFromShelter());
        a.gameMenu();
        while (true) {
            System.out.println(a.getActions());

        }


    }

}
