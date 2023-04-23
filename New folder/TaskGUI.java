import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * TaskGUI
 */
public class TaskGUI extends JFrame implements ActionListener{
    JButton addButton;
    JButton modifyButton;
    JButton removeButton;
    TaskManager taskManager = new TaskManager();
    Task task = new Task("cioromela", "cioromela", "azi", false);
    

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
            taskManager.addTask(task);
        } else if (e.getSource() == modifyButton) {
            taskManager.modifyTask(task, "cioromela", "nigger", "nigger", false);
        } else {
            taskManager.removeTask(task);
        }
    }
}
