package virtual_pet;

import java.util.Scanner;

public class VirtualPetSimulator {
    public void VirtualPetSimulator(){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println("what do you want to do with your pet");
        Virtualpet petActions = new Virtualpet(input.next());
        while (true){
            if (userInput == 1){
                System.out.println();
        } else if ( userInput == 2) {

            System.out.println(petActions.waterIt());
        }
    }

}
}
