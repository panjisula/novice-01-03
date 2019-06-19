import java.io.*;
public class Employee {
    //instanse ini terlihat pada semua child class.
    public String name;

    //salary variabel hanya terlihat di class Employee.
    public double salary;

    //Variabel nama di assign di konstruktor.
    public Employee (String empName){
        name = empName;
    }

    //Variabel salary diassign sebuah nilai.
    public void setSalary(double empSal){
        salary = empSal;
    }

    //Method ini mencetak detail Employee.
    public void printEmp(){
        System.out.println("name  : " + name);
        System.out.println("salary : " + salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("Panji S");
        empOne.setSalary(5000);
        empOne.printEmp();
    }
}