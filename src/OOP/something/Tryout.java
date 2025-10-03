package OOP.something;

public class Tryout {
    public static void main(String[] args) {
        student Ahnaf = new student(12, "Ahnaf", 98.5f);
        student Tamim = new student(13, "Tamim", 87.9f);
        Ahnaf.meet(Tamim);
    }

    public static void meeting(){
        System.out.println("Kuttar baccha daksos ken");
    }

}
class student{
    int roll;
    String name;
    float marks;
    student(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    void meet(student name){
        System.out.println(this.name + " is now friends with " + name.name);
    }

}