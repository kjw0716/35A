//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package Driver;

import Exception.StudentGradingException;
import statistics.Statistics;
import student.Student;
import util.Util; 

public class Driver1 {
    public static void main(String[] args) {
        Student[] students = new Student[40];
        Util util = new Util("student_scores.txt");//read the text
        util.readFile(students);

        // Detect invalid scores, then throw, fix, log
        int count = 0;
        while (count < students.length && students[count] != null) {
            for (int i = 0; i < 5; i++) {
                int score = students[count].getScores()[i];
                try {
                    if (score < 0 || score > 100) {
                        throw new StudentGradingException(
                            "Wrong score (" + score + ") for SID=" + students[count].getSID() + "It's the num:" + i
                        );
                    }
                } catch (StudentGradingException e) {
                    StudentGradingException.fixScore(students[count], i);
                    System.out.println("Fixed invalid score for SID=" + students[count].getSID() + ": " + score + " change to " + students[count].getScores()[i]);
                }
            }
            count++;
        }

        // Print header
        System.out.println("Stud Q1  Q2  Q3  Q4  Q5");
        System.out.println("------------------------");
        for (int i = 0; i < count; i++) {
            students[i].print();
        }

        // Calculate three of them
        Statistics stat = new Statistics();
        stat.findHigh(students, count);
        stat.findLow(students, count);
        stat.findAvg(students, count);
        System.out.println("------------------------");
        // Print statistics
        stat.print(4);

        System.out.println("\nCheck 'Logging.txt' for any logged exceptions.");
    }
}
/*
Fixed invalid score for SID=6999: 320 change to 100
Stud Q1  Q2  Q3  Q4  Q5
------------------------
1234  52  7   100 78  34  
2134  90  36  90  77  30  
3124  100 45  20  90  70  
4532  11  17  81  32  77  
5678  20  12  45  78  34  
6134  34  80  55  78  45  
7874  60  100 56  78  78  
8026  70  10  66  78  56  
9893  34  9   77  78  20  
1947  45  40  88  78  55  
2877  55  50  99  78  80  
3189  22  70  100 78  77  
4602  89  50  91  78  60  
5405  11  11  0   78  10  
6999  0   98  89  78  100 
------------------------
Low Score       0       7       0       32      10
High Score      100     100     100     90      100
Average         46.2    42.3    70.5    75.7    55.1
 */



