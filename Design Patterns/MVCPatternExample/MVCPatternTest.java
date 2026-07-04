
public class MVCPatternTest {
    
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Sanjay Kumar");
        student.setId("1");
        student.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student,view);

        controller.updateView(); //initially havin details

        System.out.println("\nUpdated Student Details: \n");

        controller.setStudentName("Atharva");
        controller.setStudentGrade("O");

        controller.updateView(); //details after updating the stuDent


    }
}
