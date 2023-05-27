package coffeemachine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class CoffeeMachine implements Serializable{
    private WaterContainer waterContainer;
    private BeansContainer beansContainer;
    private WasteTray wasteTray;
    private Grinder grinder;
    private int counter;
    private FileLogger logger;

    public CoffeeMachine() {
    }
    
    public CoffeeMachine(WaterContainer waterContainer, BeansContainer beansContainer, WasteTray wasteTray, Grinder grinder, FileLogger logger) {
        this.waterContainer = waterContainer;
        this.beansContainer = beansContainer;
        this.wasteTray = wasteTray;
        this.grinder = grinder;
        this.counter = 1;
        this.logger = logger;
    }
    
    public WaterContainer getWaterContainer() {
        return waterContainer;
    }

    public void setWaterContainer(WaterContainer waterContainer) {
        this.waterContainer = waterContainer;
    }

    public BeansContainer getBeansContainer() {
        return beansContainer;
    }

    public void setBeansContainer(BeansContainer beansContainer) {
        this.beansContainer = beansContainer;
    }

    public WasteTray getWasteTray() {
        return wasteTray;
    }

    public void setWasteTray(WasteTray wasteTray) {
        this.wasteTray = wasteTray;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public FileLogger getLogger() {
        return logger;
    }

    public void setLogger(FileLogger logger) {
        this.logger = logger;
    }
    
    Calendar c = Calendar.getInstance();
    
    public void makeCupOfCoffee(int choice) throws Exception{
        switch (choice) {
            case 1:
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(30.0);
                this.wasteTray.fill(10.0);
                this.logger.log(this.counter + "-  " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  Espresso single shot  " + "Beans:7g  Water:30ml  Ratio(A/R):(" + this.beansContainer.getRatio() 
                        + "/" + (100-this.beansContainer.getRatio()) + ")  Caffeine:" + this.getCoffeine(7.0) + "g.\n");
                this.counter++;
                break;
                
            case 2:
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(60.0);
                this.wasteTray.fill(20.0);
                this.logger.log(this.counter + "-  " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  Espresso double shot  " + "Beans:14g  Water:60ml  Ratio(A/R):(" + this.beansContainer.getRatio() 
                        + "/" + (100-this.beansContainer.getRatio()) + ")  Caffeine:" + this.getCoffeine(14.0) + "g.\n");
                this.counter++;
                break;
                
            case 3:
                this.beansContainer.drain(7.0);
                this.waterContainer.drain(170.0);
                this.wasteTray.fill(10.0);
                this.logger.log(this.counter + "-  " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  Americano single shot  " + "Beans:7g  Water:170ml  Ratio(A/R):(" + this.beansContainer.getRatio() 
                        + "/" + (100-this.beansContainer.getRatio()) + ")  Caffeine:" + this.getCoffeine(7.0) + "g.\n");
                this.counter++;
                break;
                
            case 4:
                this.beansContainer.drain(14.0);
                this.waterContainer.drain(220.0);
                this.wasteTray.fill(20.0);
                this.logger.log(this.counter + "-  " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  Americano double shot  " + "Beans:14g  Water:220ml  Ratio(A/R):(" + this.beansContainer.getRatio() 
                        + "/" + (100-this.beansContainer.getRatio()) + ")  Caffeine:" + this.getCoffeine(7.0) + "g.\n");
                this.counter++;
                break;
        }
        
    }
    
    public void start() throws Exception {
        
        if (this.beansContainer.getLevel()==0) {
            throw new OutOfBeansException("Fill the beans container, please");
        }
        
        if (this.waterContainer.getLevel()==0) {
            throw new OutOfWaterException("Fill the water container, please");
        }
        
        if (this.wasteTray.getLevel()==this.wasteTray.getCapacity()) {
            throw new CleanException("Clean the waste tray, please.");
        }
        
        this.logger.log("Started at " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR) + "--" + c.get(Calendar.HOUR_OF_DAY) 
                + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n");
    }
    
    public void stop() throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("State.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this);
        out.close();
        fileOut.close();
        
        this.logger.log("Stopped at " + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR) + "--" + c.get(Calendar.HOUR_OF_DAY) 
                + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n");
    }
    
    public double getCoffeine(double gram) {
        double arabicaCaffeine = (gram * this.beansContainer.getRatio() * 1.35)/10000.0;
        double robustaCaffeine = (gram * (100-this.beansContainer.getRatio()) * 2.45)/10000.0;
        double totalCaffeine = arabicaCaffeine + robustaCaffeine;
        return totalCaffeine;
    }
    
    public String getState() {
        return "COFFEE MACHINE STATE AFTER THIS CUP:\nBeans Container => " + this.beansContainer.getLevel() + "g of " + this.beansContainer.getCapacity() + "g\nWater Container => " 
                + this.waterContainer.getLevel() + "ml of " + this.waterContainer.getCapacity() + "ml\nWaste Tray => " + this.wasteTray.getLevel() + "g of " + this.wasteTray.getCapacity()
                + "g\n\n*****************************************\n\n";
    }
}
