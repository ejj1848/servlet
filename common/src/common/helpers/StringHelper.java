package common.helpers;

/**
 * Created by ericjohn1 on 6/30/2016.
 */
public class StringHelper  extends CommonHelper {

    public static boolean isNullOrEmpty(String s) {

        return s == null || s.length() == 0;
    }



    public static String lowercase(String lowercase){
        lowercase = lowercase.toLowerCase();
        return lowercase;
    }

}
