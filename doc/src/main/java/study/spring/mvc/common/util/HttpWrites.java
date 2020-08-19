package study.spring.mvc.common.util;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Http Write
 *
 * @author wangzhj
 */
public class HttpWrites {

    /**
     * 输出
     *
     * @param response
     * @param msg
     */
    public static void write(HttpServletResponse response, String msg) {
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(msg);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
