import java.util.Arrays;

public class Class {
    Student[] List = Course.studentList;
    int numOfStudent = Course.getNumOfStudent();

    public void printList() {
        System.out.println(Arrays.toString(List));
    }
    public boolean isFull() throws Exception{
        if (numOfStudent >= 10){
            return true;
        }
        else if (numOfStudent <= 0){
            throw new Exception("Student number should be a positive number");
        }
        else
            return false;
    }

    public void register(Student student){
        if (numOfStudent >= 10){
            System.out.println("Class is full.");
        }
        else {
            List[numOfStudent] = student;
            numOfStudent++;
        }
    }

}

