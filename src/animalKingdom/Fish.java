package animalKingdom;

public class Fish extends AbstractAnimal
{
    public Fish(String name, int year)
    {
        super(name, year);
    }


    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Breathes with gills";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

}