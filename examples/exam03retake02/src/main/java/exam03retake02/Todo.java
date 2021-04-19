package exam03retake02;

public class Todo {
    protected String text;
    protected State state;
    protected int priority;

    public Todo(String text, int priority) {
        if (priority > 5 || priority < 1) {
            throw new IllegalArgumentException("Priority shall be between 1 and 5.");
        }
        this.text = text;
        this.state = State.NON_COMPLETED;
        this.priority = priority;
    }

    public void complete() {
        this.state = State.COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }
}
