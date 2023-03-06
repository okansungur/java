package WAPI.DLL;
import java.awt.*;
import java.awt.event.*;
	class snfrobot extends Frame 
		{
	public snfrobot(){
	

	try {
		Robot robot = new Robot();

    	robot.mouseMove(0,(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    	robot.mousePress(InputEvent.BUTTON1_MASK);	
  		robot.mouseRelease(InputEvent.BUTTON1_MASK);
   for (int i = 0; i<1; i++) {
	    robot.keyPress(KeyEvent.VK_UP);
    	 robot.keyRelease(KeyEvent.VK_UP);
   	}
 	
    robot.keyPress(KeyEvent.VK_ENTER);
   	robot.keyRelease(KeyEvent.VK_ENTER);
  
    robot.keyPress(KeyEvent.VK_TAB);
   	robot.keyRelease(KeyEvent.VK_TAB);
	
    robot.keyPress(KeyEvent.VK_ENTER);
   	robot.keyRelease(KeyEvent.VK_ENTER);
       
    }
    catch (Exception ex) {
    }
	}
	public static void main(String args[]){
		snfrobot ornek=new snfrobot();
	
	}
	}