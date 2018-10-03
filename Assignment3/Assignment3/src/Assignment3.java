public class Assignment3 {
    public static void main(String[] args) {

    Student Chuan = new Student("Chuan", 74960);
    Course Info5100 = new Course("Info", 5100, 0);
    Class Class1 = new Class();
        for (int i = 0; i < Info5100.studentList().length; i++) {
            Class1.register(Chuan);
        }
        Class1.printList();
        Class1.register(Chuan);
        System.out.println(Chuan.toString());
    }
}
