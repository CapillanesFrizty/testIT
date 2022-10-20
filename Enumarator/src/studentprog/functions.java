package studentprog;


import java.io.FileInputStream;
import java.util.Properties;
import com.sun.jdi.connect.spi.Connection;
import java.io.FileNotFoundException;
import java.io.IOException;


public class functions {

    private Connection mycon;
    
    public functions() throws FileNotFoundException, IOException {
        
        Properties prop = new Properties();
        prop.load(new FileInputStream("proper.properties"));

        String url = prop.getProperty("url");
        String name = prop.getProperty("user");
        String pass = prop.getProperty("password");
    }

}
