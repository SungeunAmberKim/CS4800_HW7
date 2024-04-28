import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Characters> contents;
    private CharacterFactory factory;

    public Document() {
        this.contents = new ArrayList<>();
        this.factory = new CharacterFactory();
    }
    public void addCharacter(char val, CharProperty prop) {
        this.contents.add(new Characters(val, factory.getCharProperty(prop.getFont(),prop.getColor(),prop.getSize())));
    }
    public List<Characters> getContents() {
        return this.contents;
    }
}
