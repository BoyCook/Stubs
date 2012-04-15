package org.cccs.stubs.soap.webservice;

import org.cccs.dog.DogPort;
import org.cccs.dog.DogService;
import org.cccs.domain.Dog;
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
 * Time: 6:09:23 AM
 */
public class DogServiceITCase extends AbstractWebServiceTest {

    private static String ENDPOINT = "/service/dog";
    private static final QName SERVICE_NAME = new QName("http://cccs.org/dog", "DogService");
    private static final String NAME = "Fido";

    private DogPort getPort() throws Exception {
        URL wsdlURL = new URL(getBaseUrl().toExternalForm() + ENDPOINT + "?wsdl");
        System.out.println("connecting to: " + wsdlURL);
        DogService bert = new DogService(wsdlURL, SERVICE_NAME);
        return bert.getDogPort();
    }

    @Test
    public void getServiceInstanceShouldWork() throws Exception {
        getPort();
    }

    @Test
    public void createDogShouldWork() throws Exception {
        final Dog dog = new Dog();
        dog.setId(NAME);
        dog.setName(NAME);
        Dog found = getPort().createDog(dog);
        assertFido(found);
    }

    @Test
    public void getDogShouldWork() throws Exception {
        final Dog found = getPort().getDog(NAME);
        assertFido(found);
    }

    private void assertFido(final Dog dog) {
        assertNotNull(dog);
        assertThat(dog.getId(), is(equalTo(NAME)));
        assertThat(dog.getName(), is(equalTo(NAME)));
    }
}
