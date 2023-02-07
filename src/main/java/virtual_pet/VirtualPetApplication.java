package virtual_pet;

import java.util.*;

public class VirtualPetApplication {


    public static void main(String[] args) {
        VirtualPetShelter pet = new VirtualPetShelter();
        Virtualpet pet1 = new Virtualpet("Garfield The Cat", 34, 43, 21);
        Virtualpet pet2 = new Virtualpet("Scooby Doo The Dog", 24, 74, 54);
        Virtualpet pet3 = new Virtualpet("Nemo the Fish", 32, 60, 58);
        pet.adoptPet(pet1);
        pet.adoptPet(pet2);
        pet.adoptPet(pet3);
        Scanner input = new Scanner(System.in);
        int select = 1;

        while (true) {
            System.out.println("Welcome to the Virtual Pet Shelter!");
            System.out.println("Here are the pets in our Shelter");
            System.out.println(pet.allPetStats());
            System.out.println("What Would you like to do with the pets? ");
            System.out.println("1.Feed all the pets");
            System.out.println("2.Water The Pets");
            System.out.println("3.Play with the pets");
            System.out.println("4.Adopt a pet");
            System.out.println("5.Admit a pet");
            System.out.println("0.exit");
            int userInput = input.nextInt();
            if (userInput == 1) {
                pet.feedPets();
                System.out.println(" You fed all The pets  food");
            } else if (userInput == 2) {
                pet.waterPets();
                System.out.println("You gave the pets Water");
            } else if (userInput == 3) {
                pet.playWithPets();
                System.out.println("You Played with the pet");
            } else if (userInput == 0) {
                System.exit(0);
            }else if (userInput == 4){
                System.out.println("Which pet would u like adopt");
                System.out.println(pet.userChoice());
                String adoptedPet = input.next();
                 pet.ifAdopted(adoptedPet);
                 System.out.println("You have adopted " + adoptedPet);
            } else if (userInput == 5) {
                System.out.println("What is the name of the pet you want to admit to the shelter");
                String newPet = input.next();
                pet.adoptPet(new Virtualpet(newPet, 50,50,50));
            }

       /* Scanner input = new Scanner(System.in);

        VirtualPetShelter b = new VirtualPetShelter();
        Virtualpet a = new Virtualpet();
        System.out.println(b.petsUpForAdoption);
        System.out.println(b.getPetStats());
        System.out.println(b.adoptPetFromShelter());
        a.gameMenu();
        public String getActions() {
            VirtualPetShelter a = new VirtualPetShelter();
            System.out.println("Enter the pet number to continue");
            petName = getPetName();
            System.out.println("What do you want to do with " + petName);
            System.out.println("1.feed " + petName);
            System.out.println("2.Water " + petName);
            System.out.println("3.Play with " + petName);
            System.out.println("4.Return " + petName + " Back to the Shelter");
            System.out.println("0.exit");

            int userInput = input.nextInt();
            if (userInput == 1) {
                return " You fed " + petName + " food" + " hunger is now " + petHunger();
            } else if (userInput == 2) {
                return " You gave " + petName + " water" + " Thirst is now " + petThirst();
            } else if (userInput == 3) {
                return "You played with " + petName + " boredom is now " + petBoredom();
            } else if (userInput == 0) {
                System.exit(0);
            } else if (userInput == 4) {
                return a.admitPetIntoShelter();
            }
            return "Give a input from the list";
        }
        while (true) {
            System.out.println(a.getActions());

        }*/


        }

    }
}
