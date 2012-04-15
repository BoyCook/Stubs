package org.cccs.stubs.soap.webservice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.net.URL;


/**
 * User: boycook
 * Date: Jul 13, 2010
 * Time: 10:47:26 PM
 */
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
public abstract class AbstractWebServiceTest extends AbstractJUnit4SpringContextTests {

    private static Server server;
    private static URL baseUrl;

    protected URL getBaseUrl() {
        return baseUrl;
    }

    @BeforeClass
    public static void startWebService() throws Exception {
        server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setMaxIdleTime(30000);
        connector.setAcceptors(2);
        connector.setStatsOn(false);
        connector.setLowResourcesConnections(5000);
        server.addConnector(connector);
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("src/main/webapp");
        server.setHandler(webapp);
        server.start();
        baseUrl = new URL("http://localhost:" + connector.getLocalPort());
        System.out.println("Web Server started at " + baseUrl);
    }

    @AfterClass
    public static void stopWebService() throws Exception {
        server.stop();
    }
}
