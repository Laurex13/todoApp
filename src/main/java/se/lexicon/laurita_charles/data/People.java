package se.lexicon.laurita_charles.data;


import se.lexicon.laurita_charles.model.Person;
import java.util.Arrays;

public class People {

    private static Person[] Person = new Person[0];

    public int size (){
        return Person.length;
    }
    public Person [] findAll(){
        return Person ;
    }
    public Person findById(int PersonId) {

        Person[] matchingPersonId = new Person[0];
        Person[] IdList = Arrays.copyOf(Person, Person.length);
        for (int i = 0; i < Person.length; i++) {
        }
        return matchingPersonId[matchingPersonId.length];
    }

    public void clear(){
        People.Person = new Person[0];

    }
    }