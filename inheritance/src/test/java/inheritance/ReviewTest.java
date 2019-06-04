package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review testReview;

    // initiate restaurant class before every test
    @Before
    public void init(){
        testReview = new Review("This restaurant is really good.", "Paolo", 4);
    }
    

    // test review constructor
    @Test
    public void testReviewConstructor(){
        assertEquals("Restaurant should review should match",
                "This restaurant is rated 4 stars with the review This restaurant is really good. from Paolo.",
                testReview.toString());
        assertEquals("Restaurant should name should match",
                "This restaurant is really good.",
                testReview.getBody());
        assertEquals("Review author should match",
                "Paolo",
                testReview.getAuthor());
        assertEquals("Review stars should match.",
                4,
                testReview.getStars());
    }
}