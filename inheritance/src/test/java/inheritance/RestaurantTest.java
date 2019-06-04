package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant testRestaurant;

    // initiate restaurant class before every test
    @Before
    public void init(){
        testRestaurant = new Restaurant("Boiling Point", 4, "$$");
    }

    // test restaurant constructor
    @Test
    public void testRestaurantConstructor(){
        assertEquals("Restaurant should name should match",
                "This restaurant Boiling Point has a 4 star rating and $$ pricing.",
                testRestaurant.toString());
        assertEquals("Restaurant should name should match",
                "Boiling Point",
                testRestaurant.getName());
        assertEquals("Restaurant should name should match",
                4,
                testRestaurant.getRating());
        assertEquals("Restaurant should name should match",
                "$$",
                testRestaurant.getPrice());
    }

    @Test
    public void testTest(){
        System.out.println(testRestaurant.toString());
    }

}