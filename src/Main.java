import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Superhero superhero = new Superhero();
        Database database = new Database();
        System.out.println("random text");


        Superhero superhero1 = new Superhero("Bruce Wayne", "Batman", "None. Relies on skills, wealth and intellect.", "Human", 1.88);
        Superhero superhero2 = new Superhero("Diana Prince", "Wonder Woman", "Super strength, speed and the ability to fly.", "Demigoddess", 1.78);
        Superhero superhero3 = new Superhero("Barry Allen", "Flash", "Incredible speed and reflexes", "Metahuman", 1.83);

        Superhero[] superheroList = new Superhero[3];
        superheroList[0] = superhero1;
        superheroList[1] = superhero2;
        superheroList[2] = superhero3;

        for (int i = 0; i < superheroList.length; i++) {
            System.out.println(superheroList[i]);

        }
    }
}
