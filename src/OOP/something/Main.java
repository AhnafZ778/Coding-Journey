package OOP.something;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] number = new int[5];
        Student[] students = new Student[5];
        Student ahnaf = new Student(10, "Ahnaf", 90.5f);
        System.out.println(ahnaf.rno + " " + ahnaf.name + " " + ahnaf.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(int roll,String name, float marks){
        Scanner in = new Scanner(System.in);
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

}
