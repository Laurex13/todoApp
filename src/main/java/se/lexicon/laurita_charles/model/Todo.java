package se.lexicon.laurita_charles.model;

import java.sql.Date;
import java.time.LocalDate;

public class Todo {


    private  int todoId;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private int assignee;
    private int assignee_id;

    // Constructors
public Todo(int todoId, String title, String description, LocalDate deadline, boolean done, int assignee){

    this.todoId = todoId;
    this.title = title;
    this. description = description;
    this. deadline = deadline;
    this. done = done;
    this. assignee = assignee;
}

    public int getTodoId() {
        return todoId;
    }

    //public void setTodoId(int TodoId){this.todoId = todoId;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return Date.valueOf(deadline);
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getAssignee() {
        return assignee_id;
    }

    public void setAssignee(int assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }
}

