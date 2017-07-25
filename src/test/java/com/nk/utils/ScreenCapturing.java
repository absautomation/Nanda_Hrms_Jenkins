package com.nk.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.imageio.ImageIO;

public class ScreenCapturing {
	
	 DateFormat dateFormat = new SimpleDateFormat("MM.dd.yy.HH.mm.ss");
	 Date date = new Date();
			
/*
 * 
 * Code to save screen shot in current project folder
	
	public void CaotureScreen() {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String FileName = "ScreenShot -  "+dateFormat.format(date);
                        
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage,"JPG", new File(FileName + "."+ format ));
             
            System.out.println("A full screenshot saved!");
        } catch (Exception ex) {
            System.err.println(ex);
        }
    } 
*/
	
	public void CaptureScreen() {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String FileName = "ScreenShot -  "+dateFormat.format(date);
                        
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            
            File dir = new File ("C:\\NandaKishoreG Hrms\\HRMSNEW\\ScreenShots");
            File screenCapture = new File(dir, FileName);
            
            ImageIO.write(screenFullImage,"JPG", new File(screenCapture + "."+ format ));
             
            System.out.println(">>>>>> A full screenshot of result saved! check ScreenShots folder");
            System.out.println(FileName);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    } 
	
	
}


