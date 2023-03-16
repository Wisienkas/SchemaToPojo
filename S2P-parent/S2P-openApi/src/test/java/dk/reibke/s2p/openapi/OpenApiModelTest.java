package dk.reibke.s2p.openapi;

import dk.reibke.s2p.openapi.generated.Error;
import dk.reibke.s2p.openapi.generated.NewPet;
import dk.reibke.s2p.openapi.generated.Pet;
import dk.reibke.s2p.openapi.generated.PetAllOf;
import org.junit.Test;

public class OpenApiModelTest {

    @Test
    public void testError() {
        Error error = new Error();
        error.setCode(13);
        error.setMessage("Some messsage");

        System.out.println(error);
    }

    @Test
    public void testNewPet() {
        NewPet newPet = new NewPet()
                .tag("Bubble")
                .name("bulbasaur");

        System.out.println(newPet);
    }

    @Test
    public void testPet() {
        Pet pet = new Pet()
                .tag("Petty")
                .id(13L)
                .name("Patti");

        System.out.println(pet);
    }

    @Test
    public void testPetAllOf() {
        PetAllOf petAllOf = new PetAllOf().id(4L);

        System.out.println(petAllOf);
    }
}
