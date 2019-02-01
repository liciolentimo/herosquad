import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{

    @Test 
    public void Squad_instantiatesCorrectly_true(){
        Squad mySquad = new Squad("Avengers",10,"war");
        assertEquals(true,mySquad instanceof Squad);
    }

    @Test 
    public void Squad_instantiatesWithName_String(){
        Squad mySquad =  new Squad("Avengers",10,"war");
        assertEquals("Avengers",mySquad.getName());
    }

    @Test 
    public void Squad_instantiatesWithSize_Int(){
        Squad mySquad =  new Squad("Avengers",10,"war");
        assertEquals(10,mySquad.getSize());
    }

    @Test 
    public void Squad_instantiatesWithCause_String(){
        Squad mySquad =  new Squad("Avengers",10,"war");
        assertEquals("war", mySquad.getCause());
    }
    
}