import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    WaterBottle waterbottle;


    @Before

    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test

    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }
    @Test

    public void drinkTest() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }
    @Test

    public void emptyTest() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test

    public void fillTest() {
        waterbottle.fill();
        assertEquals(200, waterbottle.getVolume());
    }
}