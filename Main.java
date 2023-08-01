import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        List<String> attendence = new ArrayList<>();
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



























//        List<Employee> employeesList = new ArrayList<>();
//
//        Employee e0 = new Employee();
//
//        Employee e1 = new Employee();
//        e1.salary = 400;
//        e1.name = "Ahmed";
//        e1.gender = "Male";
//        e1.position = "guard";
//        e1.age = 22;
//
//        Employee e2 = new Employee();
//        e2.salary = 100;
//        e2.name = "Moath";
//        e2.gender = "Male";
//        e2.position = "Blue Team in SOC";
//        e2.age = 24;
//
//        Employee e3 = new Employee();
//        e3.salary = 2000;
//        e3.name = "Nasra";
//        e3.gender = "Female";
//        e3.position = "Manager in Insight";
//        e3.age = 60;
//
//        employeesList.add(e0);
//        employeesList.add(e1);
//        employeesList.add(e2);
//        employeesList.add(e3);
//
//
//        for (Employee emp: employeesList) {
//            Employee.countEmployee();
//            emp.getEmpInfo();
//            System.out.println();
//            System.out.println();
//        }
//        System.out.println("List of all Employees and their information: "+ Employee.getEmpNumbers());


    }
}


class Employee{

    String position;
    String name;
    int age;
    String gender;
    double salary;
    private static int counter = 0;
    Employee(){
        position = "Not registered";
        name = "Not found";
        age = 0;
        gender = "Male";
        salary = 0.0;
    }
    Employee(String p, String n, int a, String g, double s){
        position = p;
        name = n;
        age = a;
        gender = g;
        salary = s;
    }
    void getEmpInfo(){
        System.out.println("Position: "+ position);
        System.out.println("Name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Salary: "+ salary + " OMR");
    }
    void addToSalary(int s){
        salary += s;
    }

    static void countEmployee(){
        counter ++;
    }
    static int getEmpNumbers(){
        return counter;

    }

}