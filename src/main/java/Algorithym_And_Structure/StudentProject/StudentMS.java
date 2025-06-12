package Algorithym_And_Structure.StudentProject;


public class StudentMS {
    private LinkedList<Student> linkedList;

    public StudentMS() {
        this.linkedList = new LinkedList<Student>();
    }

    public void addStudent(Student student){
        this.linkedList.addLast(student);
    }

    public void printList(){
        this.linkedList.traversal();
    }

    public boolean findStudent(Student student){
        return this.linkedList.findItem(student);
    }

    public void update(Student student){
         Node<Student> tmp = linkedList.getHead();
         while(tmp != null){
             Student st = tmp.getData();
             if(st.getId() == student.getId()){
                 st.setFullName(student.getFullName());
                 st.setAge(student.getAge());
                 st.setGpa(student.getGpa());
                 break;
             }
             tmp = tmp.getNext();
         }
    }

    public void remove(Student student){
        this.linkedList.deleteItemByKey(student);
    }

    public int countStudent(String fullName){
        Node<Student> tmp = linkedList.getHead();
        int count = 0;
        while(tmp != null){
            Student st = tmp.getData();
            if(st.getFullName().equals(fullName)){
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }


}
