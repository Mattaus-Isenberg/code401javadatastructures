package utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest
{

    AnimalShelter animalShelter;
    @Before
    public void emptyShelter()
    {
        animalShelter = new AnimalShelter();
    }
    @Test
    public void enqueue()
    {
        Hunde frenchy = new Hunde("French Bulldog", "Grey", "M");
        animalShelter.enqueue(frenchy);
        assertEquals( frenchy, animalShelter.hunde_Haus.peek());
    }

    @Test
    public void dequeueCat()
    {
        Katze tino = new Katze("Manx", "Marble", "M");
        Katze mauri = new Katze("American Short Hair", "Yellow Tabby", "M");
        animalShelter.enqueue(tino);
        animalShelter.enqueue(mauri);
        assertEquals(tino, animalShelter.dequeue(Katze.class));
    }

    @Test
    public void dequeueMultipleCats()
    {
        Katze tino = new Katze("Manx", "Marble", "M");
        Katze mauri = new Katze("American Short Hair", "Yellow Tabby", "M");
        animalShelter.enqueue(tino);
        animalShelter.enqueue(mauri);
        animalShelter.dequeue(Katze.class);
        assertEquals(mauri, animalShelter.dequeue(Katze.class));
    }

    @Test
    public void dequeueDog()
    {
        Hunde frenchy = new Hunde("French Bulldog", "Grey", "M");
        animalShelter.enqueue(frenchy);
        assertEquals(frenchy, animalShelter.dequeue(Hunde.class));
    }

    @Test
    public void dequeueMultipleDogs()
    {
        Hunde frenchy = new Hunde("French Bulldog", "Grey", "M");
        Hunde aussie = new Hunde("Australian Shepperd", "Natural", "F");
        animalShelter.enqueue(frenchy);
        animalShelter.enqueue(aussie);
        animalShelter.dequeue(Hunde.class);
        assertEquals(aussie, animalShelter.dequeue(Hunde.class));
    }

}