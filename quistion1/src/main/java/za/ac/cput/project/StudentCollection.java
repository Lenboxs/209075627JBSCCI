package za.ac.cput.project;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by student on 2015/02/19.
 */
public class StudentCollection {
    private Collection<Student> students = new HashSet<Student>();


    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(int id)
    {
        for(Student student: students) {
            if(student.getId() == id)
                students.remove(student);
        }
    }
    public void displayStudent()
    {
        System.out.println("all students");
        for(Student student: students) {
            System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname() );
        }
    }

    public static void main( String[] args )
    {
        StudentCollection sc = new StudentCollection();
        sc.addStudent(new Student(123,"john","pew"));
        sc.addStudent(new Student(546,"elton","pom"));
        sc.addStudent(new Student(700,"jenny","len"));

        sc.displayStudent();

        sc.removeStudent(546);

        sc.displayStudent();
    }
}
