package org.cccs.stubs.soap.cache;

import org.cccs.domain.Cat;
import org.cccs.domain.Dog;
import org.cccs.domain.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * User: boycook
 * Date: Jul 14, 2010
 * Time: 2:22:28 PM
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

    public static void addCat(final Cat cat) {
        cats.put(cat.getId(), cat);
    }

    public static Cat getCat(final String id) {
        return cats.get(id);
    }

    public static void addDog(final Dog dog) {
        dogs.put(dog.getId(), dog);
    }

    public static Dog getDog(final String id) {
        return dogs.get(id);
    }    
}
