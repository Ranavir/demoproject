package com.stl.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
	public final static String PROPSFILE = "test.properties";

    private static Properties props;

    protected static Properties getProperties()
    {
    	if(props == null)
    	{
    		props = new Properties();
    		try {
				props.load(new FileInputStream(new File(PROPSFILE)));
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	return props;
    }
    public static final String USERNAME = getProperties().getProperty("uname");
    
	public static void main(String[] args) {
		System.out.println("Username :"+USERNAME);
	}

}
