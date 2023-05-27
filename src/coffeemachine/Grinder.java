package coffeemachine;

import java.io.Serializable;

public class Grinder implements Serializable{
    private int level;

    public Grinder() {
        
    }

    public Grinder(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void grind(int level) {
        
    }
    
    public String getInfo() {
        return "GRINDER INFO --> Level:" + this.level;
    }
    
}
