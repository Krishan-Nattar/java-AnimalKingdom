package animalKingdom;

import java.util.*;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a);
            }

        }
    }

    public static void main(String[] args) {

        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>(Arrays.asList(panda, zebra, koala, sloth, armadillo, raccoon, bigfoot, pigeon, peacock, toucan, parrot, swan, salmon, catfish, perch));

        //Listing descending order by year
        
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println("*** ORDERING BY YEAR DESCENDING ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName() + " " + a.getYear());
        }
        System.out.println();
        animalList.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println("*** ORDERING BY NAME ALPHABETICALLY ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName());
        }

        System.out.println();
        animalList.sort((a1,a2)-> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("*** ORDERING BY MOVEMENT ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName() + " " + a.move());
        }

        System.out.println();
        animalList.sort((a1,a2)-> a1.breath().compareToIgnoreCase(a2.breath()));
        System.out.println("*** ORDERING BY BREATHING ***");
        for (AbstractAnimal a : animalList) {
            System.out.println(a.getName() + " " + a.breath());
        }
        System.out.println();
        System.out.println("*** ANIMALS WITH LUNGS ***");
        printAnimals(animalList, a->a.breath().equals("Lungs"));

        System.out.println();
        System.out.println("*** LUNGS AND 1758 ***");
        printAnimals(animalList, a-> (a.breath().equals("Lungs")) && (a.getYear()==1758));

        System.out.println();
        System.out.println("*** LUNGS AND EGGS ***");
        printAnimals(animalList, a-> (a.breath().equals("Lungs")) && (a.reproduce().equals("Eggs")));

        System.out.println();
        System.out.println("*** 1758 ***");
        printAnimals(animalList, a-> (a.getYear()==1758));

        //Ordering alphabetically
        
        System.out.println();
        System.out.println("*** Alphabetical and Lungs ***");
        animalList.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalList, a-> (a instanceof Mammal));
        

    }
}