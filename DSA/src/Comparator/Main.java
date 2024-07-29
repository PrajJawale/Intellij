package Comparator;

public class Main  {
    public static void main(String[] args) {
        Student praj = new Student(50,"kbp");
        Student vish = new Student(60,"san");

        if(praj.compareTo(vish)<0){
            System.out.println("Prajwal Has a less Marks");
        }else{
            System.out.println("Vishal Has a less Marks");
        }
    }
}
