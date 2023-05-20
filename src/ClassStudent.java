/**
 * The ClassStudent class extends the Student class,
 * representing a student who is in a classroom.
 *
 * @author Darryl Matthew Rayray
 * @version 1.0
 * @since 2023-05-20
 */
public class ClassStudent extends Student{
    private boolean isHere;
    private String state;
    /**
     * @param grade the grade that the student is in.
     * @param name the name of the student.
     */
    public ClassStudent(String name, int grade){
        super(name, grade);
        this.isHere = false;
        this.state = "None";
    }
    /**
     * @param isHere the state of the presence of the student in the classroom.
     */
    public void setHere(boolean isHere){
        this.isHere = isHere;
    }
    /**
     * @return if the student is physically present or not.
     */
    public boolean getIsHere(){
        return isHere;
    }
    /**
     * @param state the state that replaces the student's current state.
     */
    public String setState(String state){
        this.state = state;
        return super.getName() + " is now " + state;
    }
    /**
     * @return what the student is currently doing.
     */

    public String getState(){
        return super.getName() + " is currently " + state + "!";
    }





}
