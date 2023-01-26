package virtual_pet;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class VirtualpetTest {
    @Test
    public void testUserInputForPetName() {
       Virtualpet userInput = new Virtualpet("Dog");
       String actions = userInput.petName;
        assertEquals("Dog",actions);
    }
    @Test
    public void hungerEquals(){
        Virtualpet userInput = new Virtualpet("");
        String a = userInput.petHunger();
        assertEquals(userInput.petHunger(),a);
    }
    @Test
    public void thirstEquals(){
        Virtualpet userInput = new Virtualpet("");
        String b = userInput.petThirst();
        assertEquals(userInput.petThirst(),b);
    }
    @Test
    public void bordomEquals(){
        Virtualpet userInput = new Virtualpet("");
        String b= userInput.petBordom();
        assertEquals(userInput.petBordom(),b);
    }

}