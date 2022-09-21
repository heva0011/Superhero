import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private int count = 0;

    public void addSuperhero(String realName, String superheroName, String superPower, int yearCreated, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(realName, superheroName, superPower, yearCreated, humanOrNot, height);
        //Superhero[count] = superhero;
        count++;
    }

    public void addSuperhero(Superhero superhero) {
        //Superhero.add(superhero);
    }

    public void searchDatabase() {

        System.out.println("Type in the name of the Superhero you're looking for.");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();

        ArrayList<Superhero> searchResults = new ArrayList<Superhero>();

        for (Superhero nameSearch : superheroes) {
            if (nameSearch.getSuperheroName().contains(searchName)) {
                searchResults.add(nameSearch);
            }
        }
        if (!searchResults.isEmpty())
            for (Superhero nameSearch : searchResults)
                System.out.println(nameSearch);
        else System.out.println("There are no matches for " + "\"" + searchName + "\"");
    }
}

