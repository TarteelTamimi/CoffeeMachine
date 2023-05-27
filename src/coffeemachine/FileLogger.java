package coffeemachine;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class FileLogger implements Logger, Serializable{
    
    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter("logger.log" , true);
            fw.write(msg);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Something wrong!!");
        }
    }
    
}
