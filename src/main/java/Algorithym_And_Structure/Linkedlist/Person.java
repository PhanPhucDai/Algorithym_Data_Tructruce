package Algorithym_And_Structure.Linkedlist;

public class Person {
    private String name;
    private String tuoi;


    public Person(String name, String tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tuoi='" + tuoi + '\'' +
                '}';
    }
}
