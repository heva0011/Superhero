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

    public void searchSuperhero(String searchName) {
        boolean find = false;
        for (Superhero superhero : superheroes) {
            System.out.println("The Superheroes real name is " + superhero.getRealName());
            System.out.println("The Superhero is called " + superhero.getSuperheroName());
            System.out.println("Their superpower(s) are " + superhero.getSuperPower());
            System.out.println("Their creation year is " + superhero.getYearCreated());
            System.out.println("The hero is " + superhero.getHeight() + "this tall.");
            System.out.println("The Superhero is a " + superhero.getHumanOrNot());
            find = true;
        }
        if (!find) {
            System.out.println("There is no match for your request." + searchName);
        }
    }
}
