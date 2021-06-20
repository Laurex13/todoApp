package se.lexicon.laurita_charles.data;


public class TodoSequencer {

   private int TodoId;

    private TodoSequencer() {
        TodoId = 0;
    }

    public int nextPersonId(){
        return ++TodoId;
    }
}
