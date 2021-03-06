package duke.task;

public class Deadline extends Todo {
    private String by;
    private final static char taskType = 'D';

    public Deadline(String description, String by) {
        super(description);
        this.by = dateFormat(by);
    }

    public String getBy() {
        return this.by;
    }

    public char getTaskType() {
        return taskType;
    }

    public String toString() {
        return super.toString() + " (by: " + by + ")";
    }
}