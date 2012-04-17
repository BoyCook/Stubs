package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.cache.SimpleCache;
import org.cccs.stubs.rest.domain.Dog;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * User: boycook
 * Date: 15/04/2012
 * Time: 21:01
 */
@Controller
@Scope("request")
public class DogController extends BaseController<Dog> {
    @RequestMapping(value = "/dogs", method = RequestMethod.GET)
    public String getAllDogs(final Model model) {
        log.debug("DogController.getAllDogs");
        model.addAttribute(DOMAIN_DATA, SimpleCache.getDogs());
        return MARSHALLER;
    }

    @SuppressWarnings({"unchecked"})
    @RequestMapping(value = "/dogs/{id}", method = RequestMethod.GET)
    public String getDog(@PathVariable("id") final String id, final Model model) {
        log.debug("DogController.getDog: " + id);
        model.addAttribute(DOMAIN_DATA, SimpleCache.getDog(id));
        return MARSHALLER;
    }

    @RequestMapping(value = "/dogs/{id}", method = RequestMethod.PUT)
    public String addDog(@PathVariable("id") final String id,
                         @RequestBody final Dog dog,
                         final Model model, final HttpServletResponse response) {
        log.debug("DogController.addDog: " + id);
        SimpleCache.addDog(dog);
        model.addAttribute(DOMAIN_DATA, dog);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return MARSHALLER;
    }

    @RequestMapping(value = "/dogs/{id}", method = RequestMethod.DELETE)
    public String deleteDog(@PathVariable("id") final String id,
                            final Model model, final HttpServletResponse response) {
        log.debug("DogController.deleteDog: " + id);
        //TODO: remove from cache
        model.addAttribute(DOMAIN_DATA, "success");
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return MARSHALLER;
    }
}
