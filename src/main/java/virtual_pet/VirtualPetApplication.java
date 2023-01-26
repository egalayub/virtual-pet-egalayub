package virtual_pet;

import java.util.*;

public class VirtualPetApplication {
List<Virtualpet> myPet = new ArrayList<>();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Pet Game!");
        System.out.println("What is the name of your pet ?");
        Virtualpet a = new Virtualpet(input.next());
        System.out.println(a.petName);
        System.out.println(a.petHunger());
        System.out.println(a.petThirst());
        System.out.println(a.petBordom());

int select = 1;
while (true){
    System.out.println(a.getActions());
    System.out.println(a.getTick());

}

    }

}
