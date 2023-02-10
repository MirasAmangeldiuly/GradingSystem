public class Assignment extends Evaluation {
    private int completed;
    private int total;
    public Assignment(int id, String name, double weight, int completed, int total) {
        super(id, name, weight);
        this.completed = completed;
        this.total = total;
    }

    @Override
    public double getScore() {
        return (double) completed / total * 100;
    }

    @Override
    public String toString() {
        return "Assignment{" + "id=" + getId() + ", name='" + getName() + '\'' + ", weight=" + getWeight() + ", completed=" + completed + ", total=" + total + '}';
    }
}