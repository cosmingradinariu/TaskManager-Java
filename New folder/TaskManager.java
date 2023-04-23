import java.util.ArrayList;

public class TaskManager {
    
    private ArrayList<Task> tasks = new ArrayList<>();
    
    void addTask(Task task) {
        tasks.add(task);
        System.out.println("You added: "+ task);
        System.out.println(tasks);
    }

    void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("You removed: " + task);
        System.out.println(tasks);
    }

    void modifyTask(Task task, String name, String descritpion, String date, boolean finished) {
        System.out.println("You modified: " + task);
        task.setName(name);
        task.setDescription(descritpion);
        task.setDate(date);
        task.setFinished(finished);
        System.out.println("To: " + task);
        System.out.println(tasks);
        
    }

    public String toString() {
        return tasks.toString();
    }

    public Task[] getTasks() {
        return null;
    }
}
