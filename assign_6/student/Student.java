
//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package student;
public class Student{
    private int SID;
    private int[] scores = new int[5];

    //constructor
    public Student() {
    }

    //Get and set way for SID Scores
    public int getSID() {
        return SID;
    }
    
    public void setSID(int SID) {
        this.SID = SID;
    }
    
    public int[] getScores() {
        return scores;
    }
    
    public void setScore(int index, int score) {
        this.scores[index] = score;
    }

    //print this student information
    public void print() {
        System.out.printf("%-5d ", SID);
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-3d ", scores[i]);
        }
        System.out.println();
    }
}