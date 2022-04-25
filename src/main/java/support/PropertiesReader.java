package support;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    final static Logger logger = Logger.getLogger(PropertiesReader.class);
    Properties property = new Properties();
    PropertiesReader properties = new PropertiesReader();

    public PropertiesReader(){
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
            fis.close();
        } catch(IOException e){
            logger.info("ERROR: Properties file is not exist!");
        }
    }

    public String getUrl(){
        String URL = property.getProperty("URL");
        return URL;
    }
}
