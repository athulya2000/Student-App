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
            switch (menu){
                case 1:
                    System.out.println("Enter the student name");
                    String name=s.next();
                    System.out.println("Enter the student roll number");
                    int rollNo=s.nextInt();
                    System.out.println("Enter the student admission number");
                    String admissionNo=s.next();
                    System.out.println("Enter the college name");
                    String college=s.next();
                    Student1 st=new Student1(name,rollNo,admissionNo,college);
                    studentList.add(st);
                    break;

            }


        }
    }
}
