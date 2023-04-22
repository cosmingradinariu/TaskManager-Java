

/**
 * Main
 */
public class project {

    public static void main(String[] args) {

        //TaskGUI taskManager = new TaskGUI();
        Task task1 = new Task("Washing", "Dishwashing", "25-08-1234", false);
        System.out.println(task1);
        
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(task1);
        Task task2 = new Task("Nigger", "Nigger", "Nigger", true);
        taskManager.addTask(task2);
        taskManager.removeTask(task2);
        System.out.println(taskManager);

    }
}