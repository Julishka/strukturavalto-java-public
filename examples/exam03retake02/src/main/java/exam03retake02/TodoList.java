package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public int getNumberOfItemsLeft() {
        List<Todo> itemsLeft = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getState().equals(State.NON_COMPLETED)) {
                itemsLeft.add(todo);
            }
        }
        return itemsLeft.size();
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void deleteCompleted() {
        List<Todo> completed = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getState().equals(State.COMPLETED)) {
                completed.add(todo);
            }
        }
        todos.removeAll(completed);
    }

    public List<String> getMostImportantTodosText() {
        int mostImportant = 5;
        List<String> mostImportantTodos = new ArrayList<>();

        for (Todo todo : todos) {
            if (todo.getPriority() < mostImportant) {
                mostImportant = todo.getPriority();
            }
        }
        for (Todo todo : todos) {
            if (todo.getPriority() == mostImportant) {
                mostImportantTodos.add(todo.getText());
            }
        }
        return mostImportantTodos;
    }
}
