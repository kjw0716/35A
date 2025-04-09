//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package Driver;

import statistics.Statistics;
import student.Student;
import util.FileIO;
import util.StudentGrade;
import util.Util;

public class Driver2 {
    public static void main(String[] args) {
        Student[] students = new Student[40];
        Util util = new Util("student_scores.txt");
        util.readFile(students);

        //Count the valid student objects
        int count = 0;
        while (count < students.length && students[count] != null) {
            count++;
        }

        // Create object
        Statistics stat = new Statistics();
        // Calculate three of them
        stat.findHigh(students, count);
        stat.findLow(students, count);
        stat.findAvg(students, count);

        //Create a StudentGrade object
        StudentGrade studentGrade = new StudentGrade(students, count, stat);

        //Serialize the StudentGrade object
        FileIO fileIO = new FileIO();
        fileIO.serializeStudentGrade(studentGrade, "Report.ser");

        System.out.println("StudentGrade has been serialized to Report.ser");
    }
}
