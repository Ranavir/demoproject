package com.stl.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotExp {

	public static void main(String[] args) {
		try {
            
            Robot robot = new Robot();
            
            
            Runtime rs = Runtime.getRuntime();
            rs.exec("notepad");
            
         // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_R);
             
        } catch (AWTException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e);
        }  
	}

}
