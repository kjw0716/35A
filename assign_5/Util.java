//Assignment 5 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
import java.io.*;
import java.util.*;

public class Util {
    private String fname;

    public Util(String filename) {
        this.fname = filename;
    }

    public void readFile(Student[] students) {
        try {
            FileReader file = new FileReader(fname);
            BufferedReader buff = new BufferedReader(file);
            
            String line = buff.readLine();// Skip header line
            
            int studentCount = 0;
            boolean eof = false;
            
            while (!eof && studentCount < students.length) {
                line = buff.readLine();
                
                if (line == null) {
                    eof = true;
                } else {
                    // Create new student object
                    students[studentCount] = new Student();
                    
                    StringTokenizer st = new StringTokenizer(line);
                    
                    //get their id
                    if (st.hasMoreTokens()) {
                        int sid = Integer.parseInt(st.nextToken());
                        students[studentCount].setSID(sid);
                    }
                    
                    //scores
                    for (int i = 0; i < 5 && st.hasMoreTokens(); i++) {
                        int score = Integer.parseInt(st.nextToken());
                        students[studentCount].setScore(i, score);
                    }
                    
                    studentCount++;
                }
            }
            
            buff.close();
        }catch (IOException e) {
        System.out.println("Error: " + e.toString());
        }
    }
}