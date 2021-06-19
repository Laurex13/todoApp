package se.lexicon.laurita_charles.data;

public class PersonSequencer {

    private static int personId;

    private PersonSequencer () {
        personId = 0;
    }

    public static int nextPersonId(){
    return ++ personId;
    }
}

