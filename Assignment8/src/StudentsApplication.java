import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class StudentsApplication extends JFrame {

    private JTable studentsTable;
    private StudentsTableModel model;
    private JScrollPane jsp;

    private JButton add;
    private JLabel IDLabel;
    private JLabel firstnameLabel;
    private JLabel secondnameLabel;
    private JLabel genderLabel;

    private JTextField IDnumberText;
    private JTextField firstNameText;
    private JTextField secondNameText;
    private JComboBox<String> genderComboBox;

    private Font font;

    private Students students;



    public StudentsApplication() {
        students=new Students();
        createComponents();
        addComponents();
        addBehaviors();
        display();
    }
    private void createComponents(){
        font = new Font("TimesRoman", Font.PLAIN, 14);

        IDLabel = new JLabel("ID");
        firstnameLabel = new JLabel("First Name");
        secondnameLabel = new JLabel("Last Name");
        genderLabel = new JLabel("Gender");

        IDnumberText= new JTextField(10);
        IDnumberText.setFont(font);
        firstNameText = new JTextField(10);
        firstNameText.setFont(font);
        secondNameText = new JTextField(10);
        secondNameText.setFont(font);
        //genderText = new JTextField(10);
        //genderText.setFont(font);
        genderComboBox =new JComboBox<>();
        genderComboBox.addItem("");
        genderComboBox.addItem("Female");
        genderComboBox.addItem("Male");

        add= new JButton("add");
    }
    private void addComponents() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        panel.add(IDLabel);
        panel.add(IDnumberText);
        panel.add(firstnameLabel);
        panel.add(firstNameText);
        panel.add(secondnameLabel);
        panel.add(secondNameText);
        panel.add(genderLabel);
        panel.add(genderComboBox);
        panel.add(add);
        model = new StudentsTableModel(students);
        studentsTable = new JTable(model);
        jsp = new JScrollPane(studentsTable);
        Container con = getContentPane();

        con.add(panel,BorderLayout.NORTH);
        con.add(jsp,BorderLayout.CENTER);


    }
    private void display(){
        setSize(400, 400);
        setVisible(true);
    }
    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int ID=Integer.parseInt(IDnumberText.getText());
            String first=firstNameText.getText();
            String second=secondNameText.getText();
            boolean gender=true;
            if(genderComboBox.getSelectedItem().equals("Male")) gender=false;
            Student student=new Student(ID, first, second, gender);
            students.addStudent(student);
            studentsTable.updateUI();
            IDnumberText.setText("");
            firstNameText.setText("");
            secondNameText.setText("");
        }
    }
    private void addBehaviors() {
        buttonListener bl= new buttonListener();
        add.addActionListener(bl);
    }

    public static void main(String[] args) {
        new StudentsApplication();
    }

}

class Students {
    private Collection<Student> students = new ArrayList<Student>();

    public Collection<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public int getNumberOfStudents() {
        return getStudents().size();
    }

}

class Student {
    int ID;
    String first;
    String last;
    boolean gender = false;

    public Student(int ID, String first, String last, boolean gender) {
        this.ID = ID;
        this.first = first;
        this.last = last;
        this.gender = gender;
    }
}

class StudentsTableModel extends AbstractTableModel  {

    private Students students;
    private String female= ("Female");
    private String male=("Male");

    public StudentsTableModel(Students students) {
        this.students = students;
    }

    public int getRowCount() {
        return students.getNumberOfStudents();
    }

    public int getColumnCount() {
        return 4;
    }


    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "First";
        }
        if (columnIndex == 2)
            return "Last";
        if (columnIndex == 3)
            return "Gender";
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        Collection<Student> s = students.getStudents();
        int row = -1;
        for (Student student : s) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) {
                    return student.ID + "";
                }
                if (columnIndex == 1) {
                    return student.first;
                }
                if (columnIndex == 2) {
                    return student.last;
                }
                if (columnIndex == 3) {
                    if(student.gender) return female;
                    return male;
                }
            }
        }
        return null;
    }


    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    }


    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

}
