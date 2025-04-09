//Assignment 5 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class StudentScoreAnalysis {
    public static void main(String[] args) {
        Student[] students = new Student[40];
        
        // Create utility object to read file
        Util util = new Util("student_scores.txt");
        
        // Read data from file and populate student array
        util.readFile(students);
        
        // Print header
        System.out.println("Stud Q1  Q2  Q3  Q4  Q5");
        System.out.println("------------------------");
        
        // Print student data
        int studentCount = 0;
        while (studentCount < students.length && students[studentCount] != null) {
            students[studentCount].print();
            studentCount++;
        }
        
        System.out.println("------------------------");
        
        // Create object
        Statistics stat = new Statistics();
        
        // Calculate three of them 
        stat.findHigh(students, studentCount);
        stat.findLow(students, studentCount);
        stat.findAvg(students, studentCount);
        
        // Print statistics
        stat.print(4);
    }
}
/*
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
6999  0   98  89  78  20  
------------------------
Low Score       0       7       0       32      10
High Score      100     100     100     90      80
Average         46.2    42.3    70.5    75.7    49.7
 */