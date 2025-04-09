//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package adapter;
//printing student statistics and scores
public interface StudentAPI {

    void printAllStatistics(); //Prints all student statistics

    void printScoreForId(int sid); //Prints the quiz scores for a student with the specified student id
}

