package coffeemachine;

import java.io.Serializable;

public class BeansContainer extends Container implements Serializable{
    private double ratio;

    public BeansContainer() {
    }

    public BeansContainer(double capacity, double level, double ratio) {
        super(capacity, level);
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public void drain(double amount) throws OutOfBeansException {
        if (this.getLevel()-amount < 0) {
            throw new OutOfBeansException("Fill the beans container, please.");
        }
        else {
            this.setLevel(this.getLevel()-amount);
        }
    }
    
    @Override
    public String getInfo() {
        return "BEANS CONTAINER INFO --> Capacity:" + this.getCapacity() + "   Level:" + this.getLevel() + "   Ratio:" + this.ratio + "%";
    }
}
