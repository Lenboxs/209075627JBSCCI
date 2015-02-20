package za.ac.cput.project;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class StudentSet {

    private Set<Integer> students = new HashSet<Integer>();


    public void addStudent(int student)
    {
        students.add(student);
    }

    public void removeStudent(int id)
    {

        students.remove(id);

    }
    public void displayStudent()
    {

            System.out.println(students);
    }

    public static void main( String[] args )
    {
        StudentSet ss = new StudentSet();
        ss.addStudent(123);
        ss.addStudent(546);
        ss.addStudent(700);
        ss.addStudent(700);

        ss.displayStudent();

        ss.removeStudent(546);

        ss.displayStudent();
    }
}
