package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UsageOfRobotClass {

//typing something in notepad.
	//demonstrate Robot class.
@SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException, InterruptedException, AWTException  {
	Runtime.getRuntime().exec("Notepad");
	Thread.sleep(2000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_Q);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_P);

}
}
