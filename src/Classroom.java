import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Classroom class represents a seating chart
 * concept that a teacher can use to take attendance
 * of their students and keep track of them.
 *
 * @author Darryl Matthew Rayray
 * @version 1.0
 * @since 2023-05-20
 */
public class Classroom {
    public ClassStudent[][] chart;
    public String name;

    public ArrayList<String> studentList;
    /**
     * @param name the name of the teacher of the classroom.
     * @param length the length of the classroom in seats.
     * @param width the width of the classroom in seats.
     */
    public Classroom(String name, int length, int width){
        this.name = name;
        chart = new ClassStudent[length][width];
        studentList = new ArrayList<String>();
        System.out.println("\n" + name + "'s Classroom is " + length + " seats by " + width + " seats,\nwith " + (length*width) + " seats total!\n");
    }
    /**
     * Assigns a student to a seat if the seat is not empty.
     * @param student a student object.
     * @param y the row of the 2d array, chart.
     * @param x the index of the y array.
     * @return what position the student object was assigned to in the classroom.
     */
    public String assignIndividualSeat(ClassStudent student, int y, int x){
        if(chart[y][x] != null){return "Seat taken!";}
        chart[y][x] = student;
        return student + " was assigned to [" + y + "][" + x + "]";
    }

    /**
     * Assigns the seats, goes on loop through all the indices
     * of the 2d array, chart, and takes input from
     * the teacher to initialize student objects in those indices.
     */
    public void assignSeats(){
        for(int i = 0; i < chart.length; i++){
            for(int j = 0; j < chart[i].length; j++){
                Scanner in = new Scanner(System.in);
                System.out.println("What is the name of the student?:");
                String studentName = in.nextLine();
                if(studentName != null) {
                    System.out.println("What grade is the student in?:");
                    int studentGrade = in.nextInt();
                    chart[i][j] = new ClassStudent(studentName, studentGrade);
                }

            }
        }
    }
    /**
     * @param y the targeted array of the 2d array, chart.
     * @param x the targeted index of y.
     * @return if the position was successfully cleared.
     */
    public String remove( int y, int x){
        chart[y][x] = null;
        return  "[" + y + "][" + x + "] is now empty";
    }
    /**
     * Clears the chart instance variable of all its indices, setting them to null.
     */
    public void clearChart(){
        for(int i = 0; i < chart.length; i++){
            for(int j = 0; j < chart[i].length; j++){
                chart[i][j] = null;
            }
        }
    }
    /**
     * Prints out a list with the activities each student is doing
     * Preconditions: Chart has already been initialized with students and
     * the method setStateOfStudents() has at least been called once.
     */
    public void getStateOfStudents() {
        for (ClassStudent[] i : chart) {
            for (ClassStudent j : i) {
                if(j.getIsHere()) {
                    System.out.println(j.getState());
                }
                else{
                    System.out.println(j.getName() + " is not here today!");
                }
            }
        }
    }
    /**
     * Sets the state/activity that each student is doing,
     * asking the teacher to input for each individual present student.
     * Preconditions: Chart has been initialized with Student objects and
     * setAttendance() has been called at least once.
     */
    public void setStateOfStudents(){
        for(int i = 0; i < chart.length; i++){
            for(int j = 0; j < chart[i].length; j++){
                if(chart[i][j].getIsHere()) {
                    Scanner in = new Scanner(System.in);
                    System.out.println("What is " + chart[i][j].getName() + " doing right now?:");
                    String studentState = in.nextLine();
                    chart[i][j].setState(studentState);
                }
            }
        }
    }
    /**
     * Sets the attendance of each student in the class, whether
     * they are present or absent by asking the teacher for input.
     * Preconditions: Chart has been initialized with student objects.
     */
    public void setAttendance(){
        for(int i = 0; i < chart.length; i++){
            for(int j = 0; j < chart[i].length; j++){
                Scanner in = new Scanner(System.in);
                System.out.println("Is " + chart[i][j].getName() + " here today?(true/false)");
                chart[i][j].setHere(in.nextBoolean());
          }
        }
    }
    /**
     * Prints out an attendance sheet with who is present and absent.
     * Preconditions: Chart has been initialized with student objects and setAttendance()
     * has been called at least once.
     */
    public void getAttendance(){
        System.out.println("\n----Attendance Sheet----");
        for (ClassStudent[] i : chart) {
            for (ClassStudent j : i) {
                if(j.getIsHere()) {
                    System.out.println(j.getName() + ": Present");
                }
                else{
                    System.out.println(j.getName() + ": Absent");
                }
            }
        }
        System.out.println("----End of Attendance Sheet----\n");
    }
    /**
     * Updates the array list, StudentList with the all the student's names.
     * Preconditions: Chart 2d array has been initialized with student objects.
     */
    public void updateStudentList(){
        studentList.clear();
        for (ClassStudent[] i : chart) {
            for (ClassStudent j : i) {
                studentList.add(j.getName());
            }
        }
        System.out.println("Student List Updated!");
    }
    /**
     * Prints out a whole list of all the student's names in the classroom.
     * Preconditions: updateStudentList() has been called at least once and chart is
     * initialized with student objects.
     */

    public void getStudentList(){
        if(studentList.size() > 0) {
            System.out.println("\n---- Start of list ----");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i));
            }
            System.out.println("---- End of List ----\n");
        }
        else{System.out.println("No students or list hasn't been updated first!");}
    }
    /**
     * Prints out a list of student introductions which
     * include their name and grade.
     */
    public void introductions(){
        for (ClassStudent[] i : chart) {
            for (ClassStudent j : i) {
                System.out.println(j.introduce());
            }
        }
    }
}


