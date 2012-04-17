package org.cccs.stubs.soap.webservice;

import org.cccs.dog.DogPort;
import org.cccs.domain.Dog;
import org.cccs.stubs.soap.cache.SimpleCache;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService(
        serviceName = "DogService",
        portName = "DogPort",
        targetNamespace = "http://cccs.org/dog",
        wsdlLocation = "file:/Users/boycook/code/boycook/stubs/cxf-soap-stub/src/main/resources/wsdl/ManageDog.wsdl",
        endpointInterface = "org.cccs.dog.DogPort")
public class DogServiceImpl implements DogPort {

    private static final Logger LOG = Logger.getLogger(DogServiceImpl.class.getName());

    @Override
    public Dog getDog(final String id) {
        LOG.info("Executing operation getDog: " + id);
        return SimpleCache.getDog(id);
    }

    @Override
    public Dog createDog(final Dog dog) {
        LOG.info("Executing operation createDog: " + dog);
        SimpleCache.addDog(dog);
        return dog;
    }
}
