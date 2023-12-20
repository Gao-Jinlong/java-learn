import java.io.*;

public class SerializeDemo {
  public static void main(String[] args) {
    Employee employee = new Employee("Reyan Ali");
    employee.age = 18;
    employee.SSN = 11122333;
    employee.designation = "Student";
    employee.salary = 1000.0;

    try {
      File file = new File("./tmp/employee.text");
      FileOutputStream fileOut = new FileOutputStream(file);
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(employee);
      out.close();
      fileOut.close();
      System.out.println("Serialized data is saved in ./tmp/employee.ser");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
