package org.cccs.stubs.rest.domain;

/**
 * User: boycook
 * Date: 29/03/2011
 * Time: 20:58
 */
public class Cat {

    private String id;
    private String name;

    public Cat(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
