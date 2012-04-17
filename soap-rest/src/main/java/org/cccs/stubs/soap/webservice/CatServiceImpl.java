package org.cccs.stubs.soap.webservice;

import org.cccs.cat.CatPort;
import org.cccs.domain.Cat;
import org.cccs.stubs.soap.cache.SimpleCache;

import javax.jws.WebService;
import java.util.logging.Logger;

@WebService(
        serviceName = "CatService",
        portName = "CatPort",
        targetNamespace = "http://cccs.org/cat",
        wsdlLocation = "file:/Users/boycook/code/boycook/stubs/cxf-soap-stub/src/main/resources/wsdl/ManageCat.wsdl",
        endpointInterface = "org.cccs.cat.CatPort")
public class CatServiceImpl implements CatPort {

    private static final Logger LOG = Logger.getLogger(CatServiceImpl.class.getName());

    @Override
    public Cat getCat(final String id) {
        LOG.info("Executing operation getCat: " + id);
        return SimpleCache.getCat(id);
    }

    @Override
    public Cat createCat(final Cat cat) {
        LOG.info("Executing operation createCat: " + cat);
        SimpleCache.addCat(cat);
        return cat;
    }
}
