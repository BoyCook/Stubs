package org.cccs.stubs.rest.domain;

/**
 * User: boycook
 * Date: 18/02/2011
 * Time: 19:36
 */
public class Dog {

    private String id;
    private String name;

    public Dog(String id, String name) {
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
