package za.ac.cput.project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class StudentMap {

    private Map<String, Student> students = new HashMap<String, Student>();


    public void addStudent(String ref, Student student)
    {
        students.put(ref, student);
    }
    public void removeStudent(String ref)
    {
        students.remove(ref);
    }
    public void displayStudent()
    {
        System.out.println("all students");
        Set set = students.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext())
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            Student student = (Student) me.getValue();
            System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname() );
        }
    }
    public static void main( String[] args )
    {
        StudentMap sm = new StudentMap();
        sm.addStudent("a", new Student(123,"john","pew"));
        sm.addStudent("b", new Student(546,"elton","pom"));
        sm.addStudent("c", new Student(700,"jenny","len"));

        sm.displayStudent();

        sm.removeStudent("b");

        sm.displayStudent();
    }
}
