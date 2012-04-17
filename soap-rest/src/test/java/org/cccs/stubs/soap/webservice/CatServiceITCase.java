package org.cccs.stubs.soap.webservice;

import org.cccs.cat.CatPort;
import org.cccs.cat.CatService;
import org.cccs.domain.Cat;
import org.junit.Test;

import javax.xml.namespace.QName;
import java.net.URL;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: boycook
 * Date: Jul 14, 2010
 * Time: 2:09:11 PM
 */
public class CatServiceITCase extends AbstractWebServiceTest {

    private static String ENDPOINT = "/soap/cat";
    private static final QName SERVICE_NAME = new QName("http://cccs.org/cat", "CatService");
    private static final String NAME = "BagPuss";

    private CatPort getPort() throws Exception {
        URL wsdlURL = new URL(getBaseUrl().toExternalForm() + ENDPOINT + "?wsdl");
        System.out.println("connecting to: " + wsdlURL);
        CatService bert = new CatService(wsdlURL, SERVICE_NAME);
        return bert.getCatPort();
    }

    @Test
    public void getServiceInstanceShouldWork() throws Exception {
        getPort();
    }

    @Test
    public void createCatShouldWork() throws Exception {
        final Cat cat = new Cat();
        cat.setId(NAME);
        cat.setName(NAME);
        Cat found = getPort().createCat(cat);
        assertBagpuss(found);
    }

    @Test
    public void getCatShouldWork() throws Exception {
        createCatShouldWork();
        final Cat found = getPort().getCat(NAME);
        assertBagpuss(found);
    }

    private void assertBagpuss(final Cat cat) {
        assertNotNull(cat);
        assertThat(cat.getId(), is(equalTo(NAME)));
        assertThat(cat.getName(), is(equalTo(NAME)));
    }
}
