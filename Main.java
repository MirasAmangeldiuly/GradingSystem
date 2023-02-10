public class Main {
    public static void main(String[] args) {
        EvaluationSystem evaluationSystem = new EvaluationSystem();
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Doe");

        evaluationSystem.addStudent(student1);
        evaluationSystem.addStudent(student2);

        Course course1 = new Course(1, "Math");
        Course course2 = new Course(2, "English");

        evaluationSystem.addCourse(course1);
        evaluationSystem.addCourse(course2);

        evaluationSystem.enrollStudentInCourse(1, 1);
        evaluationSystem.enrollStudentInCourse(1, 2);
        evaluationSystem.enrollStudentInCourse(2, 2);

        Exam exam1 = new Exam(1, "Midterm", 50, 88);
        Exam exam2 = new Exam(2, "Final", 50, 92);
        Assignment assignment1 = new Assignment(1, "Homework 1", 25, 20, 20);
        Assignment assignment2 = new Assignment(2, "Homework 2", 25, 18, 20);

        evaluationSystem.addEvaluationToCourse(1, exam1);
        evaluationSystem.addEvaluationToCourse(1, exam2);
        evaluationSystem.addEvaluationToCourse(1, assignment1);
        evaluationSystem.addEvaluationToCourse(1, assignment2);

        Exam exam3 = new Exam(3, "Midterm", 50, 83);
        Exam exam4 = new Exam(4, "Final", 50, 86);
        Assignment assignment3 = new Assignment(3, "Homework 1", 25, 18, 20);
        Assignment assignment4 = new Assignment(4, "Homework 2", 25, 19, 20);
        evaluationSystem.addEvaluationToCourse(2, exam3);
        evaluationSystem.addEvaluationToCourse(2, exam4);
        evaluationSystem.addEvaluationToCourse(2, assignment3);
        evaluationSystem.addEvaluationToCourse(2, assignment4);
        double gpa = GPA.calculateGPA(1, evaluationSystem)/25;
        double gpa2 = GPA.calculateGPA(2, evaluationSystem)/25;
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.getStudentGrade();
        System.out.println("Student 1 GPA: " + gpa);
        System.out.println("Student 2 GPA: " + gpa2);
        System.out.println("Student 1 average score: " + evaluationSystem.getStudentAverageScore(1));
        System.out.println("Student 2 average score: " + evaluationSystem.getStudentAverageScore(2));

    }
}