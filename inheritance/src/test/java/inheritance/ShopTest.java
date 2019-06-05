package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;

    // initiate shop class before every test
    @Before
    public void init(){
        testShop = new Shop("Tom Ford", "Suits & Stuff", "$$$$");
    }

    @Test
    public void testShopConstructor(){
        assertEquals("Shop should match",
                "This shop Tom Ford has a description Suits & Stuff and a $$$$ pricing.",
                testShop.toString());
        assertEquals("Shop name should match",
                "Tom Ford",
                testShop.getName());
        assertEquals("Shop description should match",
                "Suits & Stuff",
                testShop.getDescription());
        assertEquals("Shop price should match",
                "$$$$",
                testShop.getPrice());

        System.out.println(testShop);
    }
}