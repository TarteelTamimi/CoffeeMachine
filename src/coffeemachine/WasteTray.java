package coffeemachine;

import java.io.Serializable;

public class WasteTray implements Serializable{
    private double capacity;
    private double level;

    public WasteTray(double capacity, double level) {
        this.capacity = capacity;
        this.level = level;
    }

    public WasteTray() {
        this.capacity = 500;
        this.level = 0;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void clean() {
        this.level=0.0;
    }
    
    public void fill(double amount) throws CleanException{
        if (this.level+amount > this.capacity) {
            throw new CleanException("Clean the waste tray, please");
        }
        else {
            this.level+=amount;
        }
    }
    
    public String getInfo() {
        return "WASTE TRAY INFO --> Capacity:" + this.getCapacity() + "   Level:" + this.getLevel();
    }
    
    
}
