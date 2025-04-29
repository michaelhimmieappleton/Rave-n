package hws.hw5;

import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/**
 * This is the main class for Rave'n.
 *
 * @author Computer Science Department, James Madison University
 * @version 1
 */
public class Raven {

    /**
     * The entry point of the application.
     *
     * @param args The command-line arguments (which are not used).
     * @throws InterruptedException not sure why
     * @throws InvocationTargetException not sure why
     */
    public static void main(String[] args)
            throws InterruptedException, InvocationTargetException {
        RavenWindow window;
        window = new RavenWindow();
        SwingUtilities.invokeAndWait(window);
    }
}
