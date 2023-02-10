import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("Math", 45),
                new Course("Politic", 85),
                new Course("English", 92)
        );
        Student student = new Student("John Doe", courses);
        PercentageCalculator percentageCalculator = new GradeCalculator();
        GPAcalculator gpaCalculator = new GradeCalculator();
        System.out.println("Full name: " + student.getName());
        System.out.println("Percentage: " + percentageCalculator.calculatePercentage(student));
        System.out.println("GPA: " + gpaCalculator.calculateGPA(student));
    }
}