import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initiliaze Students in the system
        Student s1 = new Student("Moath");
        Student s2 = new Student("Ammar");
        Student s3 = new Student("Omar");
        Student s4 = new Student("Mohammed");
        Student s5 = new Student("Hamed");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s4 );
        students.add(s3);
        students.add(s5);

        List<String> attendence = new ArrayList<>(); // for attendance 
        Scanner read = new Scanner(System.in);
        while (true){
            System.out.print("Enter A for attendance or D to display attendance:  ");
            String option = read.next();
            if (option.toLowerCase().equals("d")){
                for (Student s: students) {
                    for (int i = 0; i < attendence.size(); i++) {
                        if( s.name.equals(attendence.get(i))){
                            System.out.println(s.name +" Is here ");
                            break;}
//                        else {
//                            System.out.println(s.name +" Is Not here ");}
                    }}
                break;}
            else {
                System.out.print("Enter your name: ");
                String nameS = read.next();
                if (attendence.contains(nameS)){
                    System.out.println("<><><><> Error, "+ nameS+" already registered <><><><>");
                }else {
                    attendence.add(nameS);
                    System.out.print("Do you want exist? (Y/N): ");
                    String exit = read.next();
                    if(exit.toLowerCase().equals("y")){
                        break;
                }

            }}


        }
    }
}

