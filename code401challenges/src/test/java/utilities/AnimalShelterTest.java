package utilities;

import org.checkerframework.checker.units.qual.K;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter animalShelter;
    @Before
    public void setUp(){
        animalShelter = new AnimalShelter();
    }
    @Test
    public void enqueue() {
        Hunde abby = new Hunde("Abby", "Belgian Malinois", "M");
        animalShelter.enqueue(abby);
        assertEquals("Should add Abby to the queue", abby, animalShelter.hunde_Haus.peek());
    }

    @Test
    public void dequeueDog() {
        Hunde abby = new Hunde("Abby", "Belgian Malinois", "F");
        animalShelter.enqueue(abby);
        assertEquals("Should dequeue the preferred animal", abby, animalShelter.dequeue(Hunde.class));
    }

    @Test
    public void dequeueDogMultiple() {
        Hunde abby = new Hunde("Abby", "Belgian Malinois", "M");
        Hunde ginger = new Hunde("Ginger", "Fluff", "M");
        animalShelter.enqueue(abby);
        animalShelter.enqueue(ginger);
        animalShelter.dequeue(Hunde.class);
        assertEquals("Should dequeue the preferred animal", ginger, animalShelter.dequeue(Hunde.class));
    }

    @Test
    public void dequeueCat() {
        Katze peaches = new Katze("Peaches", "Tabby", "F");
        Katze tilly = new Katze("Tilly", "Tabby", "F");
        animalShelter.enqueue(peaches);
        animalShelter.enqueue(tilly);
        assertEquals("Should dequeue the preferred animal", peaches, animalShelter.dequeue(Katze.class));
    }

    @Test
    public void dequeueCatMultiple() {
        Katze peaches = new Katze("Peaches", "Tabby", "M");
        Katze tilly = new Katze("Tilly", "Tabby", "F");
        animalShelter.enqueue(peaches);
        animalShelter.enqueue(tilly);
        animalShelter.dequeue(Katze.class);
        assertEquals("Should dequeue the preferred animal", tilly, animalShelter.dequeue(Katze.class));
    }
}