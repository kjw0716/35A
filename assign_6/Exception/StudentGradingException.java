//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package Exception;

import java.io.*;
import student.Student;

public class StudentGradingException extends Exception {

    public StudentGradingException(String message) {
        super(message);
        logException(message);
    }

    private void logException(String msg) {
        try (FileWriter fw = new FileWriter("Logging.txt", true); //to a Logging.txt for centralized capture.
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("EXCEPTION: " + msg);
        } catch (IOException e) {
            System.out.println("Failed to write to Logging.txt: " + e.getMessage());
        }
    }

    //fix student score if it's out of range
    public static void fixScore(Student student, int quizIndex) {
        int[] scores = student.getScores();
        if (scores[quizIndex] < 0) {
            scores[quizIndex] = 0;
        } else if (scores[quizIndex] > 100) {
            scores[quizIndex] = 100;
        }
    }
}


