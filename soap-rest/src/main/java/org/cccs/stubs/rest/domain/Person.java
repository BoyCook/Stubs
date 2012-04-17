package org.cccs.stubs.rest.domain;

/**
 * User: Craig Cook
 * Date: Apr 1, 2010
 * Time: 6:52:43 PM
 */
public class Person {

    private String id;
    private String foreName;
    private String surName;
    private String email;
    private String phoneNumber;

    public Person(String id, String foreName, String surName, String email, String phoneNumber) {
        this.id = id;
        this.foreName = foreName;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
