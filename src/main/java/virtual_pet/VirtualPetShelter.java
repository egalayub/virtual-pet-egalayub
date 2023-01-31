package virtual_pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPetShelter {
    List<String> petsUpForAdoption = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public VirtualPetShelter() {

        petsUpForAdoption.add("1.Garfield The Cat");
        petsUpForAdoption.add("2.Scooby doo The Dog");
        petsUpForAdoption.add("3.Nemo The Fish");


    }

    public String getPetStats() {
        Virtualpet a = new Virtualpet();

        return petsUpForAdoption.get(0) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst() + " " + petsUpForAdoption.get(1) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst() + " " + petsUpForAdoption.get(2) + " " + a.petHunger() + " " + a.petBoredom() + " " + a.petThirst();

    }

    public void getPetFromShelterActions() {

    }

    public String adoptPetFromShelter() {

        int userInput = input.nextInt();
        if (userInput == 1) {
            System.out.println("You have adopted " + petsUpForAdoption.get(0));
           // a.petName = petsUpForAdoption.get(0);
            petsUpForAdoption.remove(0);

        } else if (userInput == 2) {
            System.out.println("You have adopted " + petsUpForAdoption.get(1));
           // a.petName = petsUpForAdoption.get(1);
            petsUpForAdoption.remove(1);

        } else if (userInput == 3) {
            System.out.println("You have adopted " + petsUpForAdoption.get(2));
          //  a.petName = petsUpForAdoption.get(2);
            petsUpForAdoption.remove(2);

        }
        return "";
    }

    public String admitPetIntoShelter() {
        Virtualpet a = new Virtualpet();
        System.out.println(" Enter The number of the pet to return it to the shelter");
            int userInput = input.nextInt();
            if (userInput == 1) {
                petsUpForAdoption.add("1.Garfield The Cat");
                System.out.println("You have admitted " + petsUpForAdoption.get(0) + " Back to the shelter");
                System.exit(0);
            } else if (userInput == 2) {
                petsUpForAdoption.add("2.Scooby doo The Dog");
                System.out.println("You have admitted " + petsUpForAdoption.get(1) + " Back to the shelter");
                System.exit(0);
            } else if (userInput == 3) {
                petsUpForAdoption.add("3.Nemo The Fish");
                System.out.println("You have admitted " + petsUpForAdoption.get(2) + " Back to the shelter");
                System.exit(0);
            }
            return admitPetIntoShelter();
        }
    }


