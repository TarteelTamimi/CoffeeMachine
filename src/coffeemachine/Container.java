package coffeemachine;

import java.io.Serializable;

public abstract class Container implements Serializable{
    private double capacity;
    private double level;

  
    public Container(Double capacity, Double level) {
        this.capacity = capacity;
        this.level = level;
    }
    
      public Container() {
        this.capacity = 1000;//1kg or 1L
        this.level =1000 ;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }
    
    public void drain(double amount) throws Exception{
        
    }
    
    public void fill(){
        this.level=this.capacity;
    }
    
    public String getInfo() {
        return  "" ;//The Container level Is "+ getLevel()+"\n The Container Capacity Is ="+getCapacity();
    }  
  
}
