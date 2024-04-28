public class Characters {
    private char val;
    private CharProperty prop;
    public Characters(char val, CharProperty prop) {
        this.val = val;
        this.prop = prop;
    }
    public char getVal() {
        return val;
    }
    public void setVal(char val) {
        this.val = val;
    }
    public CharProperty getProp() {
        return prop;
    }
    public void setProp(CharProperty prop) {
        this.prop = prop;
    }
}
