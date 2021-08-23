package se.lexicon.laurita_charles.data;

public class PersonSequencer {

    private static int personId;

    public static int nextPersonId(){
    return  personId++;
    }
    public static int reset(){
        personId = 0;
        return personId;

    }
    static void reset(){}
}


