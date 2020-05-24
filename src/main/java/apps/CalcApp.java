package apps;

import com.fasterxml.jackson.core.JsonProcessingException;
import hyper.core.Log;
import hyper.core.LogControl;

public class CalcApp {
    static String appName = "CalcApp";
    public static void main(String[] args) throws JsonProcessingException, InterruptedException {

        Log.addCustomLog(appName, "Start");
        System.out.println("I am a Calc App");

        int a = 10;
        int b = 10;
        Thread.sleep(1000);
        try {
            System.out.println(div(a, b));
        }catch (Exception e){
            Log.addCustomLog(appName, "Something wrong with e");
        }

        Log.addCustomLog(appName, "End");

        System.out.println(LogControl.createLog());
    }


    static int div(int a, int b) {
        return a / b;
    }
}
