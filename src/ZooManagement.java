import java.io.IOException;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre des cage : ");
        int nbCages = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Entrez le nom de zoo : ");
        String zooName = scanner.nextLine();

        System.out.println(zooName + " comporte " + nbCages + " cages");
    }
}