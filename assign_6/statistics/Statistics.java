package statistics;
//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com

import student.Student;

public class Statistics{
    private int [] lowscores = new int [5];
    private int [] highscores = new int [5];
    private float [] avgscores = new float [5];

    //find lowest score
    public void findLow(Student[] students, int count) {
        for (int i = 0; i < 5; i++) {
            lowscores[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < count; i++) {
            int[] scores = students[i].getScores();
            for (int j = 0; j < 5; j++) {
                if (scores[j] < lowscores[j]) {
                    lowscores[j] = scores[j];
                }
            }
        }
    }

    //find highest score
    public void findHigh(Student[] students, int count){
        for (int i = 0; i < 5; i++) {
            highscores[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < count; i++) {
            int[] scores = students[i].getScores();
            for (int j = 0; j < 5; j++) {
                if (scores[j] > highscores[j]) {
                    highscores[j] = scores[j];
                }
            }
        }
    }

    //caculate highest score
    public void findAvg(Student[] students, int count) {
        int[] totals = new int[5];
        for (int i = 0; i < count; i++) {
            int[] scores = students[i].getScores();
            for (int j = 0; j < 5; j++) {
                totals[j] += scores[j];
            }
        }
        for (int j = 0; j < 5; j++) {
            avgscores[j] = (float) totals[j] / count;
        }
    }

    //print three of them
    public void print(int option) {
        if (option == 1 || option == 4) {
            System.out.print("Low Score\t");
            for (int i = 0; i < 5; i++) {
                System.out.print(lowscores[i] + "\t");
            }
            System.out.println();
        }
        if (option == 2 || option == 4) {
            System.out.print("High Score\t");
            for (int i = 0; i < 5; i++) {
                System.out.print(highscores[i] + "\t");
            }
            System.out.println();
        }
        if (option == 3 || option == 4) {
            System.out.print("Average\t\t");
            for (int i = 0; i < 5; i++) {
                // Format to one decimal place
                System.out.printf("%.1f\t", avgscores[i]);
            }
            System.out.println();
        }
    }
}