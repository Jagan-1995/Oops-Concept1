package LambdasStreams;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return (int)(student.psp - t1.psp);
    }
}
