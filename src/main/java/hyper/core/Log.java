package hyper.core;
import java.time.LocalDateTime;

public class Log {

    public static String app;
    public static String msg;
    public static LocalDateTime now;

    public static void addCustomLog(String app, String event){
        Log.app = app;
        Log.now = LocalDateTime.now();
        Log.msg = event;
        LogControl.allLogs();
    }
    public static String singleLog() {
        return "\nApp " + app + ": " + now + "- Says: " + msg;
    }
}

