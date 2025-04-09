//Assignment 6 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
package util;

import java.io.*;

public class FileIO {
    /**
     * Serialize a StudentGrade object to the given filename.
     */
    public void serializeStudentGrade(StudentGrade studentGrade, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(studentGrade);
            System.out.println("StudentGrade serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Error serializing StudentGrade: " + e.getMessage());
        }
    }

    /**
     * Optional: read a StudentGrade from a file and return it.
     */
    public StudentGrade deserializeStudentGrade(String filename) {
        StudentGrade result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            result = (StudentGrade) ois.readObject();
            System.out.println("Deserialized StudentGrade from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing StudentGrade: " + e.getMessage());
        }
        return result;
    }
}

