package virtual_pet;

import java.util.*;

public class VirtualPetApplication {


    public static void main(String[] args) {
        VirtualPetShelter pet = new VirtualPetShelter();
        OrganicCat cat1 = new OrganicCat("Garfield The Cat", "Organic");
        OrganicDog dog1 = new OrganicDog("Scooby Doo The Dog", "Organic");
        RoboticDog dog2 = new RoboticDog("Robot Dog", "Robotic");
        RoboticCat cat2 = new RoboticCat("Robot Cat", "Robotic");
        pet.adoptOrganicPet(cat1);
        pet.adoptOrganicPet(dog1);
        pet.adoptRoboticPet(dog2);
        pet.adoptRoboticPet(cat2);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Virtual Pet Shelter!");
            System.out.println("Here are the pets in our Shelter");
            System.out.println("Organic Pets: " + pet.OrganicPetStats());
            System.out.println(pet.getDogCageStats());
            System.out.println(pet.getLitterBoxStats());
            System.out.println("Robotic Pets: " + pet.RoboticPetStats());
            System.out.println("What Would you like to do with the pets? ");
            System.out.println("1.Feed all Organic pets");
            System.out.println("2.Water all Organic Pets");
            System.out.println("3.Play with all the pets");
            System.out.println("4. Walk all the pets");
            System.out.println("5.Clean Litter box");
            System.out.println("6.Clean dog cage");
            System.out.println("7.Oil Robotic pets");
            System.out.println("8.Repair Robotic Pet");
            System.out.println("9.Adopt a pet");
            System.out.println("10.Admit a pet");
            System.out.println("0.exit");
            int userInput = input.nextInt();
            if (userInput == 1) {
                pet.feedOrganicPets();
                System.out.println(" You fed all The pets  food");
            } else if (userInput == 2) {
                pet.waterOrganicPets();
                System.out.println("You gave the pets Water");
            } else if (userInput == 3) {
                pet.playWithOrganicPets();
                pet.playWithRoboticPets();
                System.out.println("You Played with all  the pets");
            } else if (userInput == 4) {
                pet.walkOrganicPets();
                System.out.println("You Walked all the pets");
            } else if (userInput == 5) {
                pet.cleanLitterBoxes();
                System.out.println("You Cleaned all the Cats Litter boxes");
            } else if (userInput == 6) {
                pet.cleanDogCages();
                System.out.println("You Cleaned the Dogs Cages");
            } else if (userInput == 7) {
                pet.OilRoboticPets();
                System.out.println("You Oiled all The Robotic Pets");
            } else if (userInput == 8) {
                pet.MaintainRoboticPets();
                System.out.println("You just  maintained  the pets");
            } else if (userInput == 9) {
                System.out.println("which pet Would like to adopt");
                System.out.println(pet.userAdoptsOrganicPet());
                System.out.println(pet.userAdoptsRoboticPet());
                String adoptedPet = input.next();
                pet.ifAdopted();
                System.out.println("You have adopted" + adoptedPet);
            } else if (userInput == 10) {
                System.out.println("What is the name of the pet you want to admit to the shelter");
                String admitPet = input.next();
                System.out.println("You have removed" + admitPet);
            } else if (userInput == 0) {
                System.exit(0);
            }
            pet.tickOrganicpets();
            pet.tickRoboticPets();
        }
    }
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



