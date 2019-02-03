import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

    // @After
    // public void tearDown() {
    //   Hero.clear();
    // }

    @Test
    public void Hero_instantiatesCorrectly_true() {
      Hero myHero = new Hero("Superman",30,"fly","slow");
      assertEquals(true, myHero instanceof Hero);
    }

    @Test 
    public void Hero_instantiatesWithName_String(){
        Hero myHero = new Hero("Superman",30,"fly","slow");
        assertEquals("Superman",myHero.getName());
    }

    @Test 
    public void Hero_instantiatesWithAge_Int(){
        Hero myHero = new Hero("Superman",30,"fly","slow");
        assertEquals(30, myHero.getAge());
    }

    @Test 
    public void Hero_instantiatesWithPower_String(){
        Hero myHero = new Hero("Superman",30,"fly","slow");
        assertEquals("fly",myHero.getPower());
    }

    @Test 
    public void Hero_instantiatesWithWeakness_String(){
        Hero myHero = new Hero("Superman",30,"fly","slow");
        assertEquals("slow",myHero.getWeakness());
    }
}