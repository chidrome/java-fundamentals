package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater theaterTest;

    // initiate a Theater instance with a movie name before every test
    @Before
    public void init(){
        theaterTest = new Theater("Avengers");
    }

    @Test
    public void movieNameTest(){
        assertEquals("Theater constructor should match",
                "This theater has the movie Avengers.",
                theaterTest.toString());
        assertEquals("Movie name should match",
                "Avengers",
                theaterTest.getMovieName());
    }
}