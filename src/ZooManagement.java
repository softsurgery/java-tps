import java.util.Scanner;

public class ZooManagement {
    static boolean isCharacterIncluded(char c, char b,char e){
        return c >= b && c <= e;
    }

    static boolean isAlpha(String string){
        int i = 0;
        string = string.toUpperCase();
        boolean test = true;
        while(i < string.length() && test){
            if (isCharacterIncluded(string.charAt(i),'A','Z')) i = i + 1;
            else test = false;
        }
        return i == string.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbCages;
        do{
            System.out.println("Entrez le nombre des cage : ");
            nbCages = scanner.nextInt();
            if(nbCages < 0){
                System.out.println("Veuillez saisir un nombre positif.");
            }
        }while(nbCages < 0);

        scanner.nextLine();

        String zooName;
        do{
            System.out.println("Entrez le nom de zoo : ");
            zooName = scanner.nextLine();
            if (!isAlpha(zooName)){
                System.out.println("Veuillez saisir un nom alphabetique.");
            }
        }while(!isAlpha(zooName));


        System.out.println(zooName + " comporte " + nbCages + " cages");
    }
}