//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package Driver;

import adapter.StudentAPI;
import adapter.StudentAPIImpl;
import statistics.Statistics;
import student.Student;
import util.Util;

public class Driver3 {
    public static void main(String[] args) {
        // upload student data.
        Student[] students = new Student[40];
        Util util = new Util("student_scores.txt");
        util.readFile(students);

        int count = 0;
        while (count < students.length && students[count] != null) {
            count++;
        }

        // Create object
        Statistics stat = new Statistics();
        stat.findHigh(students, count);
        stat.findLow(students, count);
        stat.findAvg(students, count);

        //Calculate three of them
        StudentAPI api = new StudentAPIImpl(students, count, stat);

        // output the API  data.
        System.out.println("== All Student Statistics ==");
        api.printAllStatistics();

        System.out.println("\n== Scores for Student with SID = 1234 ==");
        api.printScoreForId(1234);

        System.out.println("\n== Attempting to print scores for non-existent SID = 9999 ==");
        api.printScoreForId(9999);
    }
}
/*
== All Student Statistics ==
Student Statistics:
Low Score       0       7       0       32      10
High Score      100     100     100     90      80
Average         46.2    42.3    70.5    75.7    49.7

== Scores for Student with SID = 1234 ==
Scores for student SID=1234: [52, 7, 100, 78, 34]
*/

