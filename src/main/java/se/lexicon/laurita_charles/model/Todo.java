package se.lexicon.laurita_charles.model;

public class Todo {


    private int todoId;
    private String description;
    private boolean done;

    // Constructors

    public Todo(int todoId,String description, boolean done){
        this.todoId=todoId;
        this.description=description;
        this.done=done;
    }

    // Getters and Setters.

    public int getTodoId(){
        return todoId;
    }
    public void setTodoId(int todoId){
        this.todoId=todoId;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public boolean getDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done=done;
    }
}

