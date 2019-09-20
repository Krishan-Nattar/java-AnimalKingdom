package animalKingdom;

public abstract class AbstractAnimal implements Animal
{
    private int id;
    private static int maxId;
    private String name;
    private int year;


    public AbstractAnimal(String name, int year)
    {
        maxId++;
        this.id = maxId;        
        this.name = name;
        this.year = year;
    }

    public String eat()
    {
        return "Munch";
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getYear()
    {
        return this.year;
    }

    @Override
    public String toString()
    {
        return this.name + " " +
        this.year + "\n";
    }

    

//     All animals consume food the same way

// Each animal is assigned a unique number, a name, and year discovered regardless of classification.

// Methods will return a string saying how that animal implements the action

// All animals can move, breath, reproduce. How they do that, so what string should get returned when the method is executed, varies by animal type.








}