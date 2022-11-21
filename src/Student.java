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
                case 2:
                    System.out.println("List all student details");
                    for(int i=0;i<studentList.size();i++){
                        System.out.println(studentList.get(i).name);
                        System.out.println(studentList.get(i).rollNo);
                        System.out.println(studentList.get(i).admissionNo);
                        System.out.println(studentList.get(i).college);
                    }
                    break;
                case 3:
                    System.out.println("Enter the student admission number");
                    String adNo=s.next();
                    for(Student1 st1:studentList){
                        if(adNo.equals(st1.admissionNo)){
                            System.out.println("Details of student with employee admission number"+adNo+"is");
                            System.out.println(st1.name);
                            System.out.println(st1.rollNo);
                            System.out.println(st1.admissionNo);
                            System.out.println(st1.college);
                            break;
                        }
                        else{
                            System.out.println("No such student found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the admission number");
                    String adNo1=s.next();
                    for(Student1 st2:studentList){
                     if(adNo1.equals(st2.admissionNo)){
                         studentList.remove(st2);
                     }

                    }
                    break;
                case 5:
                     System.exit(0);

                default:
                    System.out.println("Choose a valid option");



            }



        }
    }
}
