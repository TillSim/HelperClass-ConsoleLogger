import helpers.ConsoleLogger;

/**
 * <b>Test</b> class for testing the <b>ConsoleLogger</b>.
 */

public class Test {

    public static void main(String[] args) {

        ConsoleLogger.printLog("Test MSG to System.out");

        ConsoleLogger.printLog("Test MSG to file", "log.txt");

        ConsoleLogger.printLog("Test MSG to System.out and file", "log.txt", true);

    }
}
