package se.lexicon.laurita_charles.data;


public class TodoSequencer {

    private static int TodoId;

    private TodoSequencer () {
        TodoId = 0;
    }

    public static int nextTodoId(){
        return ++ TodoId;
    }
}


