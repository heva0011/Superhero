public class Superhero {

    public String realName;
    public String superheroName;
    public String superPower;
    public String species;
    public double height;

    // constructor
    public Superhero(String RealName, String SuperheroName, String SuperPower, String Species, double Height) {
        this.realName = RealName;
        this.superheroName = SuperheroName;
        this.superPower = SuperPower;
        this.species = Species;
        this.height = Height;
    }
    public Superhero() {

    }

    // get method

    public String getRealName() {
        return realName;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return "Real Name: " + realName + "  Superhero name: " + superheroName + "  Superpower(s): " + superPower + "  Species: " + species + "  Height: " + height;
    }

    // set method

    public void setRealName(String RealName) {
        this.realName = RealName;
    }


}
