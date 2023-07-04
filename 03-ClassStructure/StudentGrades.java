import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;

        double[] grades = {};
        double[] generatedGrades = Arrays.copyOf(grades, grades.length + numberOfGrades);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#,#");

        int upperbound = numberOfGrades;
        for (int i = 0; i < numberOfGrades; i++) {
            double double_random = random.nextDouble(upperbound);
            generatedGrades[i] = Integer.parseInt(df.format(double_random));
        }
        this.grades = generatedGrades;
    }

    StudentGrades(String name) {
        this.studentName = name;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of student's grades:");
        int numberOfGrades = input.nextInt();
        double[] inputGrades = new double[numberOfGrades];

        System.out.println("Enter elemnts of the array: ");
        for (int i = 0; i < numberOfGrades; i++) {
            inputGrades[i] = input.nextDouble();
        }
        this.grades = inputGrades;
    }

    public double calculateLowest() {
        Arrays.sort(grades);
        return grades[0];
    }

    public double calculateHighest() {
        Arrays.sort(grades);
        return grades[grades.length-1];
    }

    public int calculateNumberOfGrades() {
        return grades.length;
    }

    public double calculateAverage() {
        return Arrays.stream(grades).sum()/grades.length;
    }

    public String displayRecord() {
        return studentName + " " + Arrays.toString(grades) + " " + calculateNumberOfGrades() + " " + calculateLowest() + " " + calculateHighest() + " " + calculateAverage();
    }
}
