import java.util.Scanner;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.Clipboard;
import java.awt.AWTException;
public class unlimited_Messages {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String msg = sc.nextLine();
        System.out.println("Number of times: ");
        int number = sc.nextInt();

        StringSelection stringSelection = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Thread.sleep(5000);

        Robot robot = new Robot();
        for(int i=1;i<=number;i++) {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            Thread.sleep(200);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(200);
        }
    }
}
