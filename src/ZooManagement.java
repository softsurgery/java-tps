import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
       Animal lion = new Animal();
       Zoo myZoo = new Zoo();

       lion.name = "Leo";
       lion.family = "Panthera leo";
       lion.age = 10;
       lion.isMammal = true;

       myZoo.addAnimal(lion);
       myZoo.name = "My Zoo";
       myZoo.city = "New York";
       myZoo.nbrCages = 100;
    }
}