/**
 * The Student class is the superclass of the
 * ClassStudent class. This class represents the
 * concept of a student.
 *
 * @author Darryl Matthew Rayray
 * @version 1.0
 * @since 2023-05-20
 */
public class Student{
    private String name;
    private int grade;
    /**
     * @param name the name of the student.
     * @param grade the grade in which the student is in.
     */
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    /**
     * @return return the student's name.
     */
    public String getName(){
        return name;
    }
    /**
     * @return the student's grade.
     */
    public int getGrade(){
        return grade;
    }
    /**
     * Changes the student's name.
     * @param name the name that will replace the student's current name.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * @param grade the grade that will replace the student's current grade.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    /**
     * @return an introduction of the student's name and grade.
     */
    public String introduce(){
        return "My name is " + name + " and I am in grade " + grade;
    }
}
