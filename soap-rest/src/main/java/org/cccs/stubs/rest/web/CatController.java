package org.cccs.stubs.rest.web;

import org.cccs.stubs.rest.cache.SimpleCache;
import org.cccs.stubs.rest.domain.Cat;
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
 * Date: 30/03/2011
 * Time: 13:55
 */
@Controller
@Scope("request")
public class CatController extends BaseController<Cat> {

    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    public String getAllCats(final Model model) {
        log.debug("CatController.getAllCats");
        model.addAttribute(DOMAIN_DATA, SimpleCache.getCats());
        return MARSHALLER;
    }

    @SuppressWarnings({"unchecked"})
    @RequestMapping(value = "/cats/{id}", method = RequestMethod.GET)
    public String getCat(@PathVariable("id") final String id, final Model model) {
        log.debug("CatController.getCat: " + id);
        model.addAttribute(DOMAIN_DATA, SimpleCache.getCat(id));
        return MARSHALLER;
    }

    @RequestMapping(value = "/cats/{id}", method = RequestMethod.PUT)
    public String addCat(@PathVariable("id") final String id,
                          @RequestBody final Cat cat,
                          final Model model, final HttpServletResponse response) {
        log.debug("CatController.addCat: " + id);
        SimpleCache.addCat(cat);
        model.addAttribute(DOMAIN_DATA, cat);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return MARSHALLER;
    }

    @RequestMapping(value = "/cats/{id}", method = RequestMethod.DELETE)
    public String deleteCat(@PathVariable("id") final String id,
                          final Model model, final HttpServletResponse response) {
        log.debug("CatController.deleteCat: " + id);
        //TODO: remove from cache
        model.addAttribute(DOMAIN_DATA, "success");
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return MARSHALLER;
    }
}
