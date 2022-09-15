import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Superhero superhero = new Superhero();
        Database database = new Database();
        System.out.println("random text");

        Superhero superhero1 = new Superhero("Bruce Wayne", "Batman", "None. Relies on skills, wealth and intellect.", 1939, true, 1.88);
        Superhero superhero2 = new Superhero("Diana Prince", "Wonder Woman", "Super strength, speed and the ability to fly.", 1942, false, 1.78);
        Superhero superhero3 = new Superhero("Barry Allen", "Flash", "Incredible speed and reflexes", 1956, true, 1.83);

        int brugerValg = 0;
        do {
            System.out.println("""
                    Welcome to the Super Hero Universe. 
                    Enter 1 to create your own Super Hero.
                    Enter 2 to search for a Super Hero.
                    Enter 3 to show all Super Heroes.
                    Enter 9 to exit.
                    """);

            brugerValg = sc.nextInt();
            if (brugerValg == 1) {
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

            } else if (brugerValg == 2) {
                String searchName = sc.nextLine();
                database.searchDatabase();

            } else if (brugerValg == 3) {
                System.out.println("Bruce Wayne or Batman. No superpowers but extremely skilled. Relies on intellect. Human. 1.88m tall. From 1939.");
                System.out.println("Diana Prince or Wonder Woman. Powers include super strength, speed and the ability to fly. Demigoddess. 1.78m tall. From 1942.");
                System.out.println("Barry Allen or Flash. Incredible speed and reflexes. Human. 1.83m tall. From 1956.");

            } else {
                System.exit(0);
            }
            Superhero[] superheroList = new Superhero[3];
            superheroList[0] = superhero1;
            superheroList[1] = superhero2;
            superheroList[2] = superhero3;

        } while (brugerValg != 9);
    }
}
