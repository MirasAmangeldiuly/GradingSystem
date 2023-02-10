import java.util.ArrayList;
public class Course {
    private int id;
    private String name;
    private ArrayList<Evaluation> evaluations;
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.evaluations = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
    }

    public ArrayList<Evaluation> getEvaluations() {
        return evaluations;
    }

    public double getCourseScore() {
        double totalWeight = 0;
        double weightedScoreSum = 0;
        for (Evaluation evaluation : evaluations) {
            totalWeight += evaluation.getWeight();
            weightedScoreSum += evaluation.getWeight() * evaluation.getScore() / 100;
        }
        return weightedScoreSum / totalWeight * 100;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name='" + name + '\'' + ", evaluations=" + evaluations + '}';
    }
}
