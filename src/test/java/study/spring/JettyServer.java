package study.spring;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

@Slf4j
public class JettyServer {

    private static final String PROJECT_DIR = System.getProperty("user.dir");

    private static final String WEB_APP_PATH = "\\src\\main\\webapp";

    private static final String WEB_APP = PROJECT_DIR + WEB_APP_PATH;

    private static final String CTX_PATH = "/";

    private static final int PORT = 8080;

    public static void main(String[] args) {
        try {
            WebAppContext webapp = new WebAppContext(WEB_APP, CTX_PATH);
            Server server = new Server(PORT);
            server.setHandler(webapp);
            server.start();
            server.join();
        } catch (Exception ex) {
            log.error("异常: ", ex);
        }
    }
}
