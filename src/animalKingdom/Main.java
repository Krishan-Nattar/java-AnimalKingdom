package animalKingdom;

import java.util.*;

public class Main {
    public static void printVehicles(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println();
            }

        }
    }

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

        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>(Arrays.asList(panda, zebra, koala, sloth, armadillo, raccoon, bigfoot, pigeon, peacock, toucan, parrot, swan, salmon, catfish, perch));

        //Listing descending order by year
        
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println("*** ORDERING BY YEAR DESCENDING ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a);
        }
        
        animalList.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println("*** ORDERING BY NAME ALPHABETICALLY ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName());
        }

        animalList.sort((a1,a2)-> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("*** ORDERING BY MOVEMENT ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName() + " " + a.move());
        }


        animalList.sort((a1,a2)-> a1.breath().compareToIgnoreCase(a2.breath()));
        System.out.println("*** ORDERING BY BREATHING ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName() + " " + a.breath());
        }

    }
}