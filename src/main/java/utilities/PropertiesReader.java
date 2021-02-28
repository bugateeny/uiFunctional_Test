package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

    static File  file = new File("src/main/resources/Config.properties");
    static FileInputStream fis;
    static Properties prop = new Properties();

    public  static  String getNewToursURL() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("NewToursURL");
    }

    public  static  String getNewToursUserName() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("NewToursUserName");
    }

    public  static  String getNewTourPassword() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("NewToursUserName");
    }

    public  static  String getMortgageCalcURL() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("MortgageCalc");

    }
    public  static  String getOyoURL() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("OYOURL");

    }
    public  static  String getNhsURL() throws Exception{
        fis = new FileInputStream(file);
        prop.load(fis);
        return prop.getProperty("Nhs");

    }
}
