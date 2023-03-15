package dk.reibke.s2p.jsonschema;

import dk.reibke.s2p.jsonschema.generated.Eatables;
import dk.reibke.s2p.jsonschema.generated.Veggie;
import org.junit.Test;

import java.util.List;

public class JsonSchemaGenTest {

    @Test
    public void testSchemaGeneration() {
        Eatables eatables = new Eatables();
        eatables.setFruits(List.of(
                "Banana", "Apple", "Lime"
        ));
        eatables.setVegetables(List.of(
                createVeggie("Lettuce", false),
                createVeggie("Pickles", true),
                createVeggie("Jalapenos", true)
        ));

        System.out.println(eatables);
    }

    private Veggie createVeggie(String name, boolean veggieLike) {
        Veggie veggie = new Veggie();
        veggie.setVeggieLike(veggieLike);
        veggie.setVeggieName(name);

        return veggie;
    }

}
