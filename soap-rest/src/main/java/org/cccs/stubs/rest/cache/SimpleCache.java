package org.cccs.stubs.rest.cache;

import org.cccs.stubs.rest.domain.Cat;
import org.cccs.stubs.rest.domain.Dog;
import org.cccs.stubs.rest.domain.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * User: boycook
 * Date: 15/04/2012
 * Time: 21:07
 */
public class SimpleCache {

    private static Map<String, Person> people;
    private static Map<String, Cat> cats;
    private static Map<String, Dog> dogs;

    static {
        people = new HashMap<String, Person>();
        cats = new HashMap<String, Cat>();
        dogs = new HashMap<String, Dog>();
    }

    public static void addPerson(final Person person) {
        people.put(person.getId(), person);
    }

    public static Person getPerson(final String id) {
        return people.get(id);
    }

    public static Collection<Person> getPeople() {
        return people.values();
    }

    public static void addCat(final Cat cat) {
        cats.put(cat.getId(), cat);
    }

    public static Cat getCat(final String id) {
        return cats.get(id);
    }

    public static Collection<Cat> getCats() {
        return cats.values();
    }

    public static void addDog(final Dog dog) {
        dogs.put(dog.getId(), dog);
    }

    public static Dog getDog(final String id) {
        return dogs.get(id);
    }

    public static Collection<Dog> getDogs() {
        return dogs.values();
    }
}
