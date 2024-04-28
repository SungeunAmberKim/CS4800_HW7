import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CharPropertyTest {
    CharProperty prop = new CharProperty("BCC", "Red", 5);

    @Test
    public void testGetFont() {
        String expected = "BCC";
        String actual = prop.getFont();
        assertEquals(expected,actual);
    }
    @Test
    public void testGetColor() {
        String expected = "Red";
        String actual = prop.getColor();
        assertEquals(expected,actual);
    }
    @Test
    public void testGetSize() {
        int expected = 5;
        int actual = prop.getSize();
        assertEquals(expected,actual);
    }
}
