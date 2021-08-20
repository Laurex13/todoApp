package se.lexicon.laurita_charles.data;

import java.util.ArrayList;
import java.util.Arrays;
import se.lexicon.laurita_charles.model.Person;
import se.lexicon.laurita_charles.model.Todo;

public class TodoItems {
    private static Todo[] todoItems = new Todo[0];


    public int size() {
        return todoItems.length;
    }

    public Todo[] findAll() {
        return todoItems;
    }

    public Todo findById(int todoId) {
        Todo[] var2 = todoItems;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Todo mTodo = var2[var4];
            if (mTodo.getTodoId() == todoId) {
                return mTodo;
            }
        }

        return null;
    }

    public Todo addTodo(String description) {
        Todo mTodo = new Todo(TodoSequencer.nextTodoId(), description);
        todoItems = (Todo[])Arrays.copyOf(todoItems, todoItems.length + 1);
        todoItems[todoItems.length - 1] = mTodo;
        return mTodo;
    }

    public void clear() {
        Arrays.copyOf(todoItems, 0);
    }

    public Todo[] findByDoneStatus(boolean doneStatus) {
        ArrayList<Todo> mTodoArr = new ArrayList();

        for(int i = 0; i < todoItems.length; ++i) {
            if (todoItems[i].isDone() == doneStatus) {
                mTodoArr.add(todoItems[i]);
            }
        }

        return (Todo[])mTodoArr.toArray();
    }


    public Todo[] findByAssignee(int personId) {
        Todo[] mTodo = new Todo[0];
        if (todoItems.length != 0) {
            for(int i = 0; i < todoItems.length - 1; ++i) {
                if (todoItems[0].getAssignee().getPersonId() == personId) {
                    mTodo = (Todo[])Arrays.copyOf(mTodo, mTodo.length + i);
                    mTodo[mTodo.length + i - 1] = todoItems[i];
                }
            }

            return mTodo;
        } else {
            return null;
        }
    }


    public Todo[] findByAssignee(Person assignee) {
        ArrayList<Todo> mTodoArr = new ArrayList();

        for(int i = 0; i < todoItems.length; ++i) {
            if (todoItems[i].getAssignee().getPersonId() == assignee.getPersonId()) {
                mTodoArr.add(todoItems[i]);
            }
        }

        return (Todo[])mTodoArr.toArray();
    }

    public Todo[] findUnassignedTodoItems() {
        ArrayList<Todo> mTodoArr = new ArrayList();

        for(int i = 0; i < todoItems.length; ++i) {
            if (todoItems[i].getAssignee().getFirstName() == null) {
                mTodoArr.add(todoItems[i]);
            }
        }

        return (Todo[])mTodoArr.toArray();
    }
}
