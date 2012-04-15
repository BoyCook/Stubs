package org.cccs.stubs.soap.webservice;

import org.cccs.domain.Person;
import org.cccs.person.PersonPort;
import org.cccs.stubs.soap.cache.SimpleCache;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService(
        serviceName = "PersonService",
        portName = "PersonPort",
        targetNamespace = "http://cccs.org/person",
        wsdlLocation = "file:/Users/boycook/code/boycook/stubs/cxf-soap-stub/src/main/resources/wsdl/ManagePerson.wsdl",
        endpointInterface = "org.cccs.person.PersonPort")
public class PersonServiceImpl implements PersonPort {

    private static final Logger LOG = Logger.getLogger(PersonServiceImpl.class.getName());

    @Override
    public Person getPerson(String id) {
        LOG.info("Executing operation getPerson: " + id);
        return SimpleCache.getPerson(id);
    }

    @Override
    public Person createPerson(Person person) {
        LOG.info("Executing operation createPerson: " + person);
        SimpleCache.addPerson(person);
        return person;
    }
}
