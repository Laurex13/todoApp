package se.lexicon.laurita_charles;

import se.lexicon.laurita_charles.data.People;
import se.lexicon.laurita_charles.model.Person;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        Person person = new Person(0,"laurita", "Owanta");

        System.out.println( "CREATED person = " + person );
    }
}
