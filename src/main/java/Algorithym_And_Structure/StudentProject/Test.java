package Algorithym_And_Structure.StudentProject;

public class Test {
    public static void main(String[] args) {
        StudentMS studentMS = new StudentMS();

        Student student1 =new Student(1, 9.8f, 20, "Phan Phuc Dai1");
        Student student2=new Student(2, 9.5f, 20, "Phan Phuc Dai");
        Student student3=new Student(3, 9.4f, 20, "Phan Phuc Dai");
        Student student4=new Student(4, 9.84f, 20, "Phan Phuc Dai4");
        Student student5=new Student(5, 9.81f, 20, "Phan Phuc Dai5");
        Student student6=new Student(4, 9.84f, 20, "Phan Phuc Dai4");

        studentMS.addStudent(student1);
        studentMS.addStudent(student2);
        studentMS.addStudent(student3);
        studentMS.addStudent(student4);
        studentMS.addStudent(student5);
        studentMS.printList();

        System.out.println("_____________________________________");
        studentMS.remove(student6);
        studentMS.printList();
        System.out.println(studentMS.countStudent("Phan Phuc Dai"));

    }
}
