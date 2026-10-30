
public class Poem {
    private String name;
    private String poet;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getPoet() {
        return poet;
    }

    public void setPoet(String p) {
        poet = p;
    }

    public String toString() {
        return name + " by " + poet;
    }
}
