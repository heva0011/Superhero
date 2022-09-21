import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    public void startUI() {
        Scanner sc = new Scanner(System.in);
        // Superhero superhero = new Superhero();
        Database database = new Database();

        Superhero superhero1 = new Superhero("Bruce Wayne", "Batman", "None. Relies on skills, wealth and intellect.", 1939, true, 1.88);
        Superhero superhero2 = new Superhero("Diana Prince", "Wonder Woman", "Super strength, speed and the ability to fly.", 1942, false, 1.78);
        Superhero superhero3 = new Superhero("Barry Allen", "Flash", "Incredible speed and reflexes", 1956, true, 1.83);

        int userChoice = 0;
        do {
            System.out.println("""
                    Welcome to the Super Hero Universe. 
                    Enter 1 to create your own Super Hero.
                    Enter 2 to search for a Super Hero.
                    Enter 3 to show all Super Heroes.
                    Enter 9 to exit.
                    """);
            try {

                userChoice = sc.nextInt();
                if (userChoice == 1) {
                    System.out.println("Enter their real name.");
                    String realName = sc.nextLine();
                    sc.next();
                    System.out.println("Enter their Superhero name.");
                    String superheroName = sc.nextLine();
                    sc.next();
                    System.out.println("Enter superpower(s).");
                    String superPower = sc.nextLine();
                    sc.next();
                    System.out.println("Enter their creation year.");
                    int yearCreated = sc.nextInt();
                    System.out.println("Enter their height.");
                    double height = sc.nextDouble();
                    System.out.println("Enter if they're a human or not. (y/n)");
                    sc.next();
                    String humanOrNotString = sc.nextLine();
                    boolean humanOrNot = false;
                    if (humanOrNotString.equals("y")) ;
                    humanOrNot = true;
                    break;

                } else if (userChoice == 2) {
                    String searchName = sc.nextLine();
                    database.searchDatabase();
                    break;

                } else if (userChoice == 3) {
                    System.out.println("Bruce Wayne or Batman. No superpowers but extremely skilled. Relies on intellect. Human. 1.88m tall. From 1939.");
                    System.out.println("Diana Prince or Wonder Woman. Powers include super strength, speed and the ability to fly. Demigoddess. 1.78m tall. From 1942.");
                    System.out.println("Barry Allen or Flash. Incredible speed and reflexes. Human. 1.83m tall. From 1956.");
                    System.out.println(" ");
                    break;

                } else if (userChoice == 9) {
                    System.exit(0);
                }
                Superhero[] superheroList = new Superhero[3];
                superheroList[0] = superhero1;
                superheroList[1] = superhero2;
                superheroList[2] = superhero3;

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please choose a number from the menu.");
                System.out.println(" ");
            }
        } while (userChoice != 9);
    }
}
