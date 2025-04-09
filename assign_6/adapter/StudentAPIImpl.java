//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package adapter;

import java.util.*;
import statistics.Statistics;
import student.Student;

public class StudentAPIImpl implements StudentAPI {
    private Student[] students;
    private int studentCount;
    private Statistics stats;

    public StudentAPIImpl(Student[] students, int studentCount, Statistics stats) {
        this.students = students;
        this.studentCount = studentCount;
        this.stats = stats;
    }

    @Override
    public void printAllStatistics() {
        if (stats == null) {
            System.out.println("No statistics available.");
        } else {
            System.out.println("Student Statistics:");
            stats.print(4);  // prints low, high, and average scores.
        }
    }

    @Override
    public void printScoreForId(int sid) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getSID() == sid) {
                System.out.println("Scores for student SID=" + sid + ": " + Arrays.toString(students[i].getScores()));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with SID=" + sid + " not found.");
        }
    }
}

