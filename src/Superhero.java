public class Superhero {
    public String realName;
    public String superheroName;
    public String superPower;
    int yearCreated;
    public double height;
    private boolean humanOrNot;

    // constructor
    public Superhero(String RealName, String SuperheroName, String SuperPower, int yearCreated, boolean humanOrNot, double Height) {
        this.realName = RealName;
        this.superheroName = SuperheroName;
        this.superPower = SuperPower;
        this.yearCreated = yearCreated;
        this.humanOrNot = humanOrNot;
        this.height = Height;
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

    int getYearCreated() {
        return yearCreated;
    }

    public boolean getHumanOrNot() {
        return humanOrNot;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Real Name: " + realName + "  Superhero name: " + superheroName + "  Superpower(s): " + superPower + "  Species: " + humanOrNot + "  Height: " + height;
    }

    // set method
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setHumanOrNot(boolean humanOrNot) {
        this.humanOrNot = humanOrNot;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

