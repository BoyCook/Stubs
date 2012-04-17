package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.domain.Cat;
import org.junit.Test;
import org.springframework.http.HttpMethod;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * User: boycook
 * Date: 30/03/2011
 * Time: 14:26
 */
public class CatControllerITCase extends JettyIntegrationTestEnvironment {

    private static final String NAME = "BagPuss";

    @Test
    public void addCatShouldWork() {
        final Cat cat = new Cat(NAME, NAME);
        http(serviceBaseURL + "cats/" + cat.getId(), cat, HttpMethod.PUT);
        final Cat found = (Cat) httpGet(serviceBaseURL + "cats/" + cat.getId());
        assertBagpuss(found);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void getCatsShouldWork() {
        Collection<Cat> cats = (Collection<Cat>) httpGet(serviceBaseURL + "cats");
        assertNotNull(cats);
        assertEquals(1, cats.size());
    }

    @Test
    public void getCatShouldWork() {
        Cat cat = (Cat) httpGet(serviceBaseURL + "cats/" + NAME);
        assertBagpuss(cat);
    }

    private void assertBagpuss(final Cat cat) {
        assertNotNull(cat);
        assertThat(cat.getId(), is(equalTo(NAME)));
        assertThat(cat.getName(), is(equalTo(NAME)));
    }
}
