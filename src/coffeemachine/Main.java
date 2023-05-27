package coffeemachine;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        BeansContainer b1 = new BeansContainer(250, 250, 57);
        WaterContainer w1 = new WaterContainer(500, 500);
        Grinder g1 = new Grinder(1);
        WasteTray t1 = new WasteTray(100, 0);
        FileLogger fw1 = new FileLogger();
        CoffeeMachine c1 = new CoffeeMachine(w1, b1, t1, g1, fw1);
        
        try{
            c1.start();
            
            while(true) {
                System.out.println("Menu:\n1.Espresso single shot.\n2.Espresso double shot.\n3.Americano single shot.\n4.Americano double shot.");
                System.out.println("Enter youe choice, please");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Your choice is --Espresso single shot--");
                        c1.makeCupOfCoffee(1);
                        break;
                    
                    case 2:
                        System.out.println("Your choice is --Espresso double shot--");
                        c1.makeCupOfCoffee(2);
                        break;
                    
                    case 3:
                        System.out.println("Your choice is --Americano single shot--");
                        c1.makeCupOfCoffee(3);
                        break;
                    
                    case 4:
                        System.out.println("Your choice is --Americano double shot--");
                        c1.makeCupOfCoffee(4);
                        break;
                        
                    default:
                        System.out.println("Your choice must be from 1 to 4.");
                        continue;
                } 
                System.out.println("CUP NUMBER:   " + c1.getCounter());
                System.out.println("COFFEE MACHINE INFO AFTER THIS CUP:");
                System.out.println(c1.getBeansContainer().getInfo());
                System.out.println(c1.getWaterContainer().getInfo());
                System.out.println(c1.getGrinder().getInfo());
                System.out.println(c1.getWasteTray().getInfo());
                System.out.println("=====================================================================");
            }
        }
        catch (OutOfBeansException ex) {
            System.out.println("Something wrong, Fill the beans container, please.");
        }
        
        catch (OutOfWaterException ex) {
            System.out.println("Something wrong, Fill the water container, please.");
        }
        
        catch (CleanException ex) {
            System.out.println("Something wrong, Clean the waste tray, please.");
        }
        
        catch (Exception ex) {
            System.out.println("Something wrong!!!");
        }
    }
}
