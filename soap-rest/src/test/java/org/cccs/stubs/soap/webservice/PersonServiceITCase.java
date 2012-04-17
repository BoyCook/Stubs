package org.cccs.stubs.soap.webservice;

import org.cccs.domain.Person;
import org.cccs.person.PersonPort;
import org.cccs.person.PersonService;
import org.junit.Test;

import javax.xml.namespace.QName;
import java.net.URL;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonServiceITCase extends AbstractWebServiceTest {

    private static String ENDPOINT = "/soap/person";
    private static final QName SERVICE_NAME = new QName("http://cccs.org/person", "PersonService");
    private static final String ID = "Craig";

    private PersonPort getPort() throws Exception {
        URL wsdlURL = new URL(getBaseUrl().toExternalForm() + ENDPOINT + "?wsdl");
        System.out.println("connecting to: " + wsdlURL);
        PersonService bert = new PersonService(wsdlURL, SERVICE_NAME);
        return bert.getPersonPort();
    }

    @Test
    public void getServiceInstanceShouldWork() throws Exception {
        getPort();
    }

    @Test
    public void createPersonShouldWork() throws Exception {
        final Person person = new Person();
        person.setId(ID);
        person.setForeName("Craig");
        person.setSurName("Cook");
        person.setEmail("craig@cook.com");
        person.setPhoneNumber("0123456");
        Person found = getPort().createPerson(person);
        assertCraig(found);
    }

    @Test
    public void getPersonShouldWork() throws Exception {
        createPersonShouldWork();
        final Person found = getPort().getPerson(ID);
        assertCraig(found);
    }

    private void assertCraig(final Person person) {
        assertNotNull(person);
        assertThat(person.getId(), is(equalTo(ID)));
        assertThat(person.getForeName(), is(equalTo("Craig")));
        assertThat(person.getSurName(), is(equalTo("Cook")));
        assertThat(person.getEmail(), is(equalTo("craig@cook.com")));
        assertThat(person.getPhoneNumber(), is(equalTo("0123456")));
    }
}
