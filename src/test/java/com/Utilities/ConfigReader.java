package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties;

    static {
        properties = new Properties();

        try{
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        }catch (IOException e){
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
