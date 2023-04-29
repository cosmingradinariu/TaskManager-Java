import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * TaskGUI
 */
public class TaskGUI extends JFrame implements ActionListener{
    JButton addButton;
    JButton modifyButton;
    JButton removeButton;
    TaskManager taskManager = new TaskManager();
    Task task = new Task(0, "da", "da", "da", false);
    

    TaskGUI() {

        addButton = new JButton("Add");
        addButton.setBounds(200, 100, 100, 25);
        addButton.addActionListener(this);
        addButton.setFocusable(false);

        modifyButton = new JButton("Edit");
        modifyButton.setBounds(300, 100, 100, 25);
        modifyButton.addActionListener(this);
        modifyButton.setFocusable(false);

        removeButton = new JButton("Remove");
        removeButton.setBounds(400, 100, 100, 25);
        removeButton.addActionListener(this);
        removeButton.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("TaskManager");
        this.setLayout(new FlowLayout());
        this.add(addButton);
        this.add(modifyButton);
        this.add(removeButton);
        
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            task.setId(Integer.parseInt(JOptionPane.showInputDialog("Enter the id for your task(starts at 0) ")));
            task.setName(JOptionPane.showInputDialog("Enter the name for your task "));
            task.setDescription(JOptionPane.showInputDialog("Enter the description of your task "));
            task.setDate(JOptionPane.showInputDialog("Enter the date of your task "));
            boolean answerBool = Boolean .parseBoolean(JOptionPane.showInputDialog("Is your task finished?(true or false) "));
            task.setFinished(answerBool);
            taskManager.addTask(task);
        } else if (e.getSource() == modifyButton) {
            int idModify = Integer.parseInt(JOptionPane.showInputDialog("Which task you want to modify? (0 is the first task) "));
            String nameModify = JOptionPane.showInputDialog("Enter the name for your task ");
            String descriptionModify = JOptionPane.showInputDialog("Enter the description of your task ");
            String dateModify = JOptionPane.showInputDialog("Enter the date of your task ");
            boolean finishedModify = Boolean .parseBoolean(JOptionPane.showInputDialog("Is your task finished?(true or false) "));
            switch (idModify) {
                case 0:
                    taskManager.modifyTask(task, idModify, nameModify, descriptionModify, dateModify, finishedModify);
                    break;
            
                case 1:
                    taskManager.modifyTask(task, idModify, nameModify, descriptionModify, dateModify, finishedModify);
                    break;
                default:
                    break;
            }
        } else {
            taskManager.removeTask(task);
            
        }
    }
}
