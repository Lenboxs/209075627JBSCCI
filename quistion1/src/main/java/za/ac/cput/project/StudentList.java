package za.ac.cput.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/19.
 */
public class StudentList {

    private List<Student> students = new ArrayList<Student>();


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
        StudentList sl = new StudentList();
        sl.addStudent(new Student(123,"john","pew"));
        sl.addStudent(new Student(546,"elton","pom"));
        sl.addStudent(new Student(700,"jenny","len"));

        sl.displayStudent();

        sl.removeStudent(546);

        sl.displayStudent();
    }
}
