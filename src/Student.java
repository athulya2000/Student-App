import java.util.ArrayList;
import java.util.Scanner;

class Student1{
    String name;
    int rollNo;
    String admissionNo;
    String college;

    public Student1(String name, int rollNo, String admissionNo, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.admissionNo = admissionNo;
        this.college = college;
    }
}
public class Student {
    public static void main(String[] args) {
        ArrayList<Student1> studentList = new ArrayList<Student1>();
        while (true) {
            System.out.println("MENU \n 1.ADD STUDENT \n 2.VIEW ALL STUDENT \n 3. SEARCH STUDENT \n 4.DELETE STUDENT \n 5.EXIT");
            System.out.println("Choose your option");
            Scanner s = new Scanner(System.in);
            int menu = s.nextInt();


        }
    }
}
