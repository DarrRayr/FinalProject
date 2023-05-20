import java.util.Scanner;

/**
 * This program uses multiple classes to create an attendance sheet of a classroom.
 *
 * @author Darryl Matthew Rayray
 * @version 1.0
 * @since 2023-05-20
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the attendance sheet program!");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String teacherName = in.nextLine();
        System.out.println("How many rows of seats are in your classroom?");
        int length = in.nextInt();
        System.out.println("How many seats are in each row?");
        int width = in.nextInt();
        Classroom myClass = new Classroom(teacherName, length,width);

        myClass.assignSeats();
        myClass.setAttendance();
        myClass.updateStudentList();
        myClass.setStateOfStudents();

        myClass.getAttendance();
        myClass.introductions();

        myClass.getStudentList();
        myClass.getStateOfStudents();
    }
}