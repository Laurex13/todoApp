package se.lexicon.laurita_charles.data;

public class TodoSequencer {

    private static int todoId;

    public static int nextTodoId(){
        return todoId ++;
    }
    public static void reset(){

    }
}
