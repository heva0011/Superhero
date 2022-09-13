import java.util.ArrayList;

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
}
