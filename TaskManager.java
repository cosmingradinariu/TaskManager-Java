import java.util.ArrayList;

public class TaskManager {
    
    private ArrayList<Task> tasks = new ArrayList<>();
    
    void addTask(Task task) {
        tasks.add(0, task);
    }

    void removeTask(Task task) {
        tasks.remove(task);
    }

    void modifyTask(Task task, String name, String descritpion, String date, boolean finished) {
        task.setName(name);
        task.setDescription(descritpion);
        task.setDate(date);
        task.setIsFinished(finished);
    }

    public String toString() {
        return tasks.toString();
    }

    public Task[] getTasks() {
        return null;
    }
}
