public class Exam extends Evaluation {
    private double score;
    public Exam(int id, String name, double weight, double score) {
        super(id, name, weight);
        this.score = score;
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + getId() + ", name='" + getName() + '\'' + ", weight=" + getWeight() + ", score=" + score + '}';
    }
}
