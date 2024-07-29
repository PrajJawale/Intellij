package Comparator;

public class Student implements Comparable<Student> {
    int  marks;
    String name;
    Student(int marks , String name){
        this.marks = marks;
        this.name = name;
    }
    @Override
    public int compareTo(Student  o) {
        int diff = this.marks - o.marks;
        return diff;
    }
}
    