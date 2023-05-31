package codelab;

import java.util.List;

public class Student implements Comparable<Student> {


    private String firstName;
    private String lastName;
    private int numberOfExercisesSolved;


    private static double calculateAverageScore(List<Student> roster) {
        if (roster.isEmpty()) {
            return 0.0;
        }
        int totalSolutions = 0;
        int studentCount = 0;
        for (Student student : roster) {
            totalSolutions += student.getNumberOfExercisesSolved();
            studentCount++;
        }

        double averageScore = (double) totalSolutions / studentCount;
        return averageScore;}

    public Student(String firstName, String lastName, int numberOfExercisesSolved) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfExercisesSolved = numberOfExercisesSolved;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getNumberOfExercisesSolved() {

        return numberOfExercisesSolved;
    }

    public void setNumberOfExercisesSolved(int numberOfExercisesSolved) {
        this.numberOfExercisesSolved = numberOfExercisesSolved;
    }

    public int compareTo(Student student) {
        return student.getNumberOfExercisesSolved() - this.getNumberOfExercisesSolved();
    }



    }

