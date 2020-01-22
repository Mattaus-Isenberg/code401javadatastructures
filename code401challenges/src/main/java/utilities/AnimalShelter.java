package utilities;

import stacksandqueues.Queue;

public class AnimalShelter<E>
{
    Queue<Katze> katzen_Haus;
    Queue<Hunde> hunde_Haus;

    public AnimalShelter()
    {
        this.katzen_Haus = new Queue<>();
        this.hunde_Haus = new Queue<>();
    }

    public void enqueue(Animal species)
    {
        if(species.getClass() == Katze.class)
            katzen_Haus.enqueue((Katze) species);

        if(species.getClass() == Hunde.class)
            hunde_Haus.enqueue((Hunde) species);
    }

    public <E> E dequeue(Class<E> pref)
    {
        if(pref.equals(Hunde.class))
            return pref.cast(hunde_Haus.dequeue());


        if(pref.equals(Katze.class))
            return pref.cast(katzen_Haus.dequeue());

        return null;

    }

    public static void main(String[] args)
    {
        Katze cat1 = new Katze("Manx", "Tricolor", "Male");
        Katze cat2 = new Katze("Manx", "Red", "Female");
        Katze cat3 = new Katze("Manx", "Grey", "Male");

        Hunde dog1 = new Hunde("Frenchy", "grey", "Male");
        Hunde dog2 = new Hunde("Australian Shepperd", "Natural", "Female");

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(cat1);
        shelter.enqueue(dog1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog2);
        shelter.enqueue(cat3);


    int catCount = shelter.katzen_Haus.getLength();
    int dogCount = shelter.hunde_Haus.getLength();
    System.out.printf(Integer.toString(catCount));
    System.out.printf(Integer.toString(dogCount));


    shelter.dequeue(Hunde.class);
    dogCount = shelter.hunde_Haus.getLength();
    System.out.printf(Integer.toString(dogCount));

    shelter.dequeue(Katze.class);
    catCount = shelter.katzen_Haus.getLength();
    System.out.printf(Integer.toString(catCount));
    }
}
