package se.lexicon.laurita_charles.data;

import se.lexicon.laurita_charles.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] person= new Person[0];

    public int size(){
        return person.length;
    }
    public Person[] findAll(){
        return person;

    }
    public Person findById(int personId) {
        Person[] var2 = person;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Person mPerson = var2[var4];
            if (mPerson.getPersonId() == personId) {
                return mPerson;
            }
        }

        return null;
    }
    public Person addPerson(String firstName, String lastName) {
        Person mPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
        person = (Person[]) Arrays.copyOf(person, person.length + 1);
        person[person.length - 1] = mPerson;
        return mPerson;

    }
    public void clear(){
        Arrays.copyOf(person,0);
    }
}
