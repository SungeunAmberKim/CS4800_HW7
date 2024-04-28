import java.util.HashMap;
import java.util.Map;
public class CharacterFactory {
    private Map<String, CharProperty> charPropertyMap;
    public CharacterFactory() {
        this.charPropertyMap = new HashMap<>();
    }
    public CharProperty getCharProperty(String font, String color, int size) {
        String key = font + color + size;
        if(charPropertyMap.containsKey(key)) {
            return charPropertyMap.get(key);
        } else {
            CharProperty prop = new CharProperty(font, color, size);
            charPropertyMap.put(key, prop);
            return prop;
        }
    }
}
