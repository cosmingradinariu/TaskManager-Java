

public class Task {

    private int idOfTask;
    private String nameOfTask;
    private String descriptionOfTask;
    private String dateOfTask;
    private boolean stateOfTask;

    public Task(int id, String name, String description, String date, boolean finished) {
        
        this.idOfTask = id;
        this.nameOfTask = name;
        this.descriptionOfTask = description;
        this.dateOfTask = date;
        this.stateOfTask = finished;
    }

    public int getId() {
        return idOfTask;
    }

    public void setId(int id) {
        this.idOfTask = id;
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
        return this.idOfTask + " " + this.nameOfTask + " " + this.descriptionOfTask + " " + this.dateOfTask + " " + this.stateOfTask;
    }

}