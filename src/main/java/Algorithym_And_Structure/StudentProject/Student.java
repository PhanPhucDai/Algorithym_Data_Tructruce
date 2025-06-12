package Algorithym_And_Structure.StudentProject;

import java.util.Objects;

public class Student {
    private int id;
    private String fullName;
    private int age;
    private float gpa;

    public Student() {
    }

    public Student(int id, float gpa, int age, String fullName) {
        this.id = id;
        this.gpa = gpa;
        this.age = age;
        this.fullName = fullName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Float.compare(gpa, student.gpa) == 0 && Objects.equals(fullName, student.fullName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
