import java.util.Arrays;
public class Course {
    String name;
    int id;
    static int numOfStudent;
    static Student[] studentList = new Student[10];

    public Course(String name,int id, int numOfStudent) {
        this.name = name;
        this.id = id;
        this.numOfStudent = numOfStudent;
    }
    public Student[] studentList(){
        return studentList;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNumOfStudent(){
        return numOfStudent;
    }


}
