public class Zoo {
    private Animal[] animals = new Animal[25];
    protected String name;
    String city;
    int nbrCages;


    public void addAnimal(Animal animal){
        for(int i = 0; i < animals.length; i++){
            if(animals[i] == null){
                animals[i] = animal;
                return;
            }
        }
        System.out.println("Zoo is full. Cannot add more animals.");
    }
}
