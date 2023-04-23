

/**
 * Main
 */
public class project {

    public static void main(String[] args) {

        //TaskGUI taskManager = new TaskGUI();
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("asa", "asd", "123", false);
        Task task2 = new Task("asdasd", "asdasdas", "asdasda", true);
        taskManager.addTask(task2);
        taskManager.addTask(task1);
        taskManager.getTasks();
        taskManager.modifyTask(task2, "dada", "dada", "dada", false);

    }
}