package com.patterns.cacheproxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class AppProperties {

	public void insertIntoProperties(Vector<Item> cache){
		PropertiesConfiguration config = null;
		try {
			config = new PropertiesConfiguration("items.properties");
			for (int i = 0; i < cache.size(); i++) {
				config.setProperty(cache.get(i).getBarCode(), cache.get(i));
			}
			config.save();
		} catch (ConfigurationException e) {
			e.printStackTrace();
		} finally{
			config.clear();
		}
	}

	public String getProperties(String property){
		String value = "";
		try {
			File file = new File("items.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			value = properties.getProperty(property);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) {
		AppProperties app = new AppProperties();
		System.out.println("Test" + app.getProperties("test"));
	}

}
