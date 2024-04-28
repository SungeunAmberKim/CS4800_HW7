import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    CharProperty prop = new CharProperty("ABC", "Red", 12);
    Characters cha = new Characters('a', prop);

    @Test
    public void testGetVal() {
        char expected = 'a';
        char actual = cha.getVal();
        assertEquals(expected,actual);
    }
    @Test
    public void testSetVal() {
        char expected = 'b';
        cha.setVal('b');
        char actual = cha.getVal();
        assertEquals(expected,actual);
    }
    @Test
    public void testGetProp() {
        CharProperty expected = prop;
        CharProperty actual = cha.getProp();
        assertEquals(expected,actual);
    }
    @Test
    public void testSetProp() {
        CharProperty expected = new CharProperty("JJK", "Blue", 25);
        cha.setProp(expected);
        CharProperty actual = cha.getProp();
        assertEquals(expected,actual);
    }
}
