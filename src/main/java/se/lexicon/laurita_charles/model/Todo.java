package se.lexicon.laurita_charles.model;

public class Todo {


    private int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    // Constructors

    public Todo(int todoId,String description){
        this.todoId=todoId;
        this.description=description;
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
    public boolean isDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done=done;
    }

    public Person getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}

