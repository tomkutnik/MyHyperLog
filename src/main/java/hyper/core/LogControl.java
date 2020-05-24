package hyper.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import java.util.ArrayList;

public class LogControl {
    public static ArrayList<String> logs = new ArrayList<>();

    public static void allLogs() {
        logs.add(Log.singleLog());
    }

    public static String createLog() throws JsonProcessingException {
        return new Gson().toJson(logs);
    }
}