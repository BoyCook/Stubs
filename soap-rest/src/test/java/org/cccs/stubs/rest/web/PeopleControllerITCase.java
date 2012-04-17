package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.domain.Person;
import org.junit.Test;
import org.springframework.http.HttpMethod;

import java.util.Collection;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * User: Craig Cook
 * Date: Jun 10, 2010
 * Time: 7:51:47 PM
 */
public class PeopleControllerITCase extends JettyIntegrationTestEnvironment {

    private static final String ID = "Craig";

    @Test
    public void addPersonShouldWork() {
        final Person person = new Person(ID, "Craig", "Cook", "craig@cook.com", "0123456");
        http(serviceBaseURL + "people/" + person.getId(), person, HttpMethod.PUT);
        final Person found = (Person) httpGet(serviceBaseURL + "people/" + person.getId());
        assertCraig(found);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void getPersonsShouldWork() {
        Collection<Person> people = (Collection<Person>) httpGet(serviceBaseURL + "people");
        assertNotNull(people);
        assertEquals(1, people.size());
    }

    @Test
    public void getPersonShouldWork() {
        Person person = (Person) httpGet(serviceBaseURL + "people/" + ID);
        assertCraig(person);
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
