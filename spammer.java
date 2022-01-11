import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.Clipboard;

public class spammer{

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;
        
        Robot robo = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter yout text:");
        String text = scanner.nextLine();
        System.out.println("How many times:");
        int delay = scanner.nextInt();

        StringSelection stringg = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringg, null);
        
        System.out.println("The spam will start in 10 sec...");
        Thread.sleep(10000);

        while (x <= delay) {
            Thread.sleep(1000);

            robo.keyPress(KeyEvent.VK_CONTROL);
            robo.keyPress(KeyEvent.VK_V);
            robo.keyRelease(KeyEvent.VK_CONTROL);
            robo.keyRelease(KeyEvent.VK_V);

            robo.keyPress(KeyEvent.VK_ENTER);
            robo.keyRelease(KeyEvent.VK_ENTER);   
            
            x++;
        }
    }
}