package Part_2.Task_2;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    private List<String> tasks;

    public TasksList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }
}
