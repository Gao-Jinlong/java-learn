import java.io.*;

public class Employee implements java.io.Serializable {
  String name;
  int age;
  String designation;
  double salary;
  public transient int SSN; // transient 关键字，该数据成员不会被序列化

  public Employee(String name) {
    this.name = name;
  }

  public void empAge(int empAge) {
    age = empAge;
  }

  public void empDesignation(String empDesig) {
    designation = empDesig;
  }

  public void empSalary(double empSalary) {
    salary = empSalary;
  }

  public void printEmployee() {
    System.out.println("名字" + name);
    System.out.println("年龄" + age);
    System.out.println("职位" + designation);
    System.out.println("薪水" + salary);
  }
}
