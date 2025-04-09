//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package util;

import java.io.Serializable;
import statistics.Statistics;
import student.Student;

public class StudentGrade implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Student[] students;
    private Statistics stats;
    private int studentCount;

    public StudentGrade(Student[] students, int studentCount, Statistics stats) {
        this.students = students;
        this.studentCount = studentCount;
        this.stats = stats;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setstudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public Statistics getStatistics() {
        return stats;
    }

    public void setStudentCount(Statistics stats) {
        this.stats = stats;
    }

}
