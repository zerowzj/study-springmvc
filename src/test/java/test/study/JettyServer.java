package test.study;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServer {

    private static final String WEB_APP_LOCATION = "D:\\project\\study\\study-spring\\src\\main\\webapp";

    private static final String CONTEXT_PATH = "/";

    private static final int PORT = 80;

    public static void main(String[] args) {
        try {
            Server server = new Server(PORT);
            WebAppContext webapp = new WebAppContext(WEB_APP_LOCATION, CONTEXT_PATH);
            server.setHandler(webapp);
            server.start();
            server.join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
