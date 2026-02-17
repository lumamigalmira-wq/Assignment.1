class Student {
    String studentID;
    String name;
    String course;

    // Constructor
    public Student(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("2023001", "Maria Santos", "BS Computer Science");
        Student student2 = new Student("2023002", "Juan Dela Cruz", "BS Information Technology");

        student1.displayInfo();
        student2.displayInfo();
    }
}
