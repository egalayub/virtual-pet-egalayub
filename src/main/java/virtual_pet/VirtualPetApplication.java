package virtual_pet;

import java.util.*;

public class VirtualPetApplication {
List<Virtualpet> myPet = new ArrayList<>();

public  VirtualPetApplication (Virtualpet ... myPet) {
    for (Virtualpet a : myPet) {
        System.out.println(a.petName);
        System.out.println(a.petHunger());
        System.out.println(a.petThirst());
        System.out.println(a.petWaste());
        System.out.println(a.petBoredom());
        System.out.println(a.petSickness());
        System.out.println(a.actions);
        System.out.println(a.feedIt());
        System.out.println(a.waterIt());
        System.out.println(a.playWithIt());
        System.out.println(a.putToSleep());
        System.out.println(a.doNothing());
    }

}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Pet Game!");
        System.out.println("What is the name of your pet ?");
        VirtualPetApplication output1 = new VirtualPetApplication(new Virtualpet(input.next()));
        System.out.println(output1);
        

    }


}
