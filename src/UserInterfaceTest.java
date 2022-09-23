import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    public void testObjectCreation() {
        
        Superhero superhero = new Superhero("Bruce Wayne", "Batman", "Skills and intellect", 1939, true, 1.88);
        assertEquals("Bruce Wayne", superhero.getRealName());
        assertEquals("Batman", superhero.getSuperheroName());
        assertEquals("skills and intellect", superhero.getSuperPower());
        assertEquals(1939, superhero.getYearCreated());
        assertEquals(true, superhero.getHumanOrNot());
        assertEquals(1.88, superhero.getHeight());
    }

    @Test
    public void testIsEmpty() {
        Superhero superhero = new Superhero("Bruce Wayne", "Batman", "Skills and intellect", 1939, true, 1.88);
        assertFalse(superhero.getHumanOrNot());
    }

    //@Disabled can be used if you want to disable a test
    @Test
    public void test() {
        Superhero superhero = new Superhero("Bruce Wayne", "Batman", "Skills and intellect", 1939, true, 1.88);
        superhero.setSuperPower(null);
        assertNotNull(superhero.getSuperPower());
    }
}
