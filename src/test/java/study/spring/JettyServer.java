package study.spring;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

@Slf4j
public class JettyServer {

    private static final String PROJECT_DIR = System.getProperty("user.dir");

    private static final String WEB_APP = "\\src\\main\\webapp";

    private static final String CTX_PATH = "/";

    private static final int PORT = 8080;

    public static void main(String[] args) {
        log.info(PROJECT_DIR + WEB_APP);
        try {
            Server server = new Server(PORT);
            WebAppContext webapp = new WebAppContext(PROJECT_DIR + WEB_APP, CTX_PATH);
            server.setHandler(webapp);
            server.start();
            server.join();
        } catch (Exception ex) {
            log.error("异常: ", ex);
        }
    }
}
