import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GPA {
    public static double calculateGPA(int studentId, EvaluationSystem evaluationSystem) {
        HashMap<Course, ArrayList<Evaluation>> evaluationsByCourse = evaluationSystem.getStudentEvaluations(studentId);
        List<Evaluation> evaluations = new ArrayList<>();
        for (ArrayList<Evaluation> evaluationsForCourse : evaluationsByCourse.values()) {
            evaluations.addAll(evaluationsForCourse);
        }

        double totalPoints = 0;
        int totalCreditHours = 0;
        for (Evaluation evaluation : evaluations) {
            totalPoints += evaluation.getScore() * evaluation.getWeight();
            totalCreditHours += evaluation.getWeight();
        }
        return totalPoints / totalCreditHours;
    }
}
