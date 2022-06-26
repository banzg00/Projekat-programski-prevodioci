package utils;


public class SymTabElement {

    private String name;          // ime simbola
    private Kind kind;          // vrsta simbola
    private Type type;          // tip vrednosti simbola
    private int atr1;          // dodatni attribut simbola
    private int atr2;          // dodatni attribut simbola

    public SymTabElement() {}

    public SymTabElement(String name, Kind kind, Type type, int atr1, int atr2) {
        this();
        this.name = name;
        this.kind = kind;
        this.type = type;
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public Type getType() {
        return type;
    }

    public int getAtr1() {
        return atr1;
    }

    public int getAtr2() {
        return atr2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAtr1(int atr1) {
        this.atr1 = atr1;
    }

    public void setAtr2(int atr2) {
        this.atr2 = atr2;
    }
}