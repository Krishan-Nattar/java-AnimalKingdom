package animalKingdom;

public class Main
{
    public static void main(String[] args) {
    
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1869);
    Mammal koala = new Mammal("Koala", 1869);
    Mammal sloth = new Mammal("Sloth", 1869);
    Mammal armadillo = new Mammal("Armadillo", 1869);
    Mammal raccoon = new Mammal("Raccoon", 1869);
    Mammal bigfoot = new Mammal("Bigfoot", 1869);


    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1837);
    Bird toucan = new Bird("Toucan", 1837);
    Bird parrot = new Bird("Parrot", 1837);
    Bird swan = new Bird("Swan", 1837);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1758);
    Fish perch = new Fish("Perch", 1758);


    System.out.println(panda.breath());
    System.out.println(panda.move());
    System.out.println(panda.reproduce());
    System.out.println(panda.eat());
    System.out.println(panda.getId());
    
    
    }
}