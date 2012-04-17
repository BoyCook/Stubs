package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.domain.Dog;
import org.junit.Test;
import org.springframework.http.HttpMethod;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * User: boycook
 * Date: 15/04/2012
 * Time: 21:28
 */
public class DogControllerITCase extends JettyIntegrationTestEnvironment {

    private static final String NAME = "Fido";

    @Test
    public void addDogShouldWork() {
        final Dog dog = new Dog(NAME, NAME);
        http(serviceBaseURL + "dogs/" + dog.getId(), dog, HttpMethod.PUT);
        final Dog found = (Dog) httpGet(serviceBaseURL + "dogs/" + dog.getId());
        assertBagpuss(found);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void getDogsShouldWork() {
        Collection<Dog> dogs = (Collection<Dog>) httpGet(serviceBaseURL + "dogs");
        assertNotNull(dogs);
        assertEquals(1, dogs.size());
    }

    @Test
    public void getDogShouldWork() {
        Dog dog = (Dog) httpGet(serviceBaseURL + "dogs/" + NAME);
        assertBagpuss(dog);
    }

    private void assertBagpuss(final Dog dog) {
        assertNotNull(dog);
        assertThat(dog.getId(), is(equalTo(NAME)));
        assertThat(dog.getName(), is(equalTo(NAME)));
    }    
    
}
