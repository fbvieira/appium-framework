package core;

import core.managers.ServerManager;
import org.junit.Test;

/**
 * Created by felipe on 6/22/2016.
 */
public class ADB {

    public static String command(String command){
        MyLogger.log.debug("Formatting ADB Command: "+command);
        if(command.startsWith("adb")) command = command.replace("adb ", ServerManager.getAndroidHome()+"/platform-tools/adb ");
        else throw new RuntimeException("This method is designed to run ADB commands only!");
        MyLogger.log.debug("Formatted ADB Command: "+command);
        String output = ServerManager.runCommand(command);
        MyLogger.log.debug("Output of the ADB Command: "+output);
        if(output == null) return "";
        else return output.trim();
    }
    @Test
    public void test(){
        System.out.println(command("adb devices"));
    }
}
