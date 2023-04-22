

public class Task {

    private String nameOfTask;
    private String descriptionOfTask;
    private String dateOfTask;
    private boolean stateOfTask;

    public Task(String name, String description, String date, boolean finished) {
        
        this.nameOfTask = name;
        this.descriptionOfTask = description;
        this.dateOfTask = date;
        this.stateOfTask = finished;
    }

    public String getName() {
        return nameOfTask;
    }

    public void setName(String name) {
        this.nameOfTask = name;
    }

    public String getDescription() {
        return descriptionOfTask;
    }

    public void setDescription(String description) {
        this.descriptionOfTask = description;
    }

    public String getDate() {
        return dateOfTask;
    }

    public void setDate(String date) {
        this.dateOfTask = date;
    }

    public boolean isFinished() {
        return stateOfTask;
    }

    public void setFinished(boolean finished) {
        this.stateOfTask = finished;
    }

    public String toString() {
        return this.nameOfTask + " " + this.descriptionOfTask + " " + this.dateOfTask + " " + this.stateOfTask;
    }

}