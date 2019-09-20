package animalKingdom;

public abstract class AbstractAnimal implements Animal {
    private int id;
    private static int maxId;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }

    public String eat() {
        return "Munch";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.name + " " + this.year;
    }

}