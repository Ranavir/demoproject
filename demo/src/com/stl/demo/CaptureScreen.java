package com.stl.demo;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreen {

	public static void main(String[] args) {
		try{
			captureScreen(System.currentTimeMillis()+".png");
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static void captureScreen(String fileName) throws Exception {
		 
		   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		   Rectangle screenRectangle = new Rectangle(screenSize);
		   Robot robot = new Robot();
		   BufferedImage image = robot.createScreenCapture(screenRectangle);
		   ImageIO.write(image, "png", new File(fileName));
		 
		}
}
