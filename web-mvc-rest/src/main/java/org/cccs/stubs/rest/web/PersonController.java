package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.cache.SimpleCache;
import org.cccs.stubs.rest.domain.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * User: Craig Cook
 * Date: Apr 2, 2010
 * Time: 4:10:53 PM
 */
@Controller
@Scope("request")
public class PersonController extends BaseController<Person> {

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public String getAllPeople(final Model model) {
        log.debug("PersonController.getAllPeople");
        model.addAttribute(DOMAIN_DATA, SimpleCache.getPeople());
        return MARSHALLER;
    }

    @SuppressWarnings({"unchecked"})
    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public String getPerson(@PathVariable("id") final String id, final Model model) {
        log.debug("PersonController.getPerson: " + id);
        model.addAttribute(DOMAIN_DATA, SimpleCache.getPerson(id));
        return MARSHALLER;
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.PUT)
    public String addPerson(@PathVariable("id") final String id,
                         @RequestBody final Person person,
                         final Model model, final HttpServletResponse response) {
        log.debug("PersonController.addPerson: " + id);
        SimpleCache.addPerson(person);
        model.addAttribute(DOMAIN_DATA, person);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return MARSHALLER;
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.DELETE)
    public String deletePerson(@PathVariable("id") final String id,
                            final Model model, final HttpServletResponse response) {
        log.debug("PersonController.deletePerson: " + id);
        //TODO: remove from cache
        model.addAttribute(DOMAIN_DATA, "success");
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return MARSHALLER;
    }
}
