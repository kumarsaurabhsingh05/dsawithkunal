package collectioninterfaces.compare;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Foo", "Bar", 2, "Science");
        Student student2 = new Student("Bar", "Foo", 1, "Commerce");
        Student student3 = new Student("Blah", "Bar", 3, "Arts");

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.sort(null);

//        students.sort(new StudentLastNameComparator());

        System.out.println(students);
    }
}
