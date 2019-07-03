package com.stackroute.junitdemo;

public class StudentGrades {
    public String checkTheRange(int numberOfStudents, int[] studentGrades) {
        String result = "Grades are correct";
        try {
            for (int i = 0; i < numberOfStudents; i++) {
                if (studentGrades[i] < 0 || studentGrades[i] > 100) {
                    throw new Exception("Grades");
                }
            }
        }
        catch (Exception exception) {
            result = "Exception";
        }
        return result;
    }
}
