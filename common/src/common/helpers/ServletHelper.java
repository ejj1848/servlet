package common.helpers;


import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
* Created by ericjohn1 on 7/21/2016.
*/
public class ServletHelper extends CommonHelper {

    public static void logRequestParams(HttpServletRequest request) {
        //notes: not going to be pretty, needs a good refactor



        Enumeration<String> paramNameList = request.getParameterNames();
        while (paramNameList.hasMoreElements())
        {
            String paramName = paramNameList.nextElement();
            String value = "";
            for (String str : request.getParameterValues(paramName)) {
                value += str;
            }
            logger.info("Parameter Name =" + paramName + "- Value(s) = " + value);
        }
    }
}
