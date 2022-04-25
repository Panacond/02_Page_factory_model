package support;

import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        Logger.getGlobal() .info("File->Open menu item selected");
//        String format(LogRecord record);
        String actual = "a[data-id='1']";
        actual = actual.replace("1", "MSI");
        System.out.println(actual);
    }
}
