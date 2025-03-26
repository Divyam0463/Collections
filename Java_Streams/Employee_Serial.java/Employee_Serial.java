import java.io.*;
import java.util.*; 

class Employee implements Serializable {
  public int id;
  public String name;
  public String department;
  public double salary;

  public Employee(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

    @Override
    public String toString() {
        return "id: "+id+" name: "+name+" department: "+department+" salary: "+salary ; 
    }
}

public class Employee_Serial {
  public static void Serialise() {
    String fileName = "saved.txt";
    ArrayList<Employee> list = new ArrayList<>();

    list.add(new Employee(12, "divyam", "BackEnd", 200000.0));
    list.add(new Employee(23, "Joe", "IT", 90000.0));

    try {
      FileOutputStream fs = new FileOutputStream(fileName);
      ObjectOutputStream os = new ObjectOutputStream(fs);

      os.writeObject(list); // writing to file for byte-stream conversion

      fs.close();
      os.close();

      System.out.println("File updated sucessfully");

    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void deSerialise(){
    try {
      ObjectInputStream os = new ObjectInputStream(new FileInputStream("saved.txt")) ;
      //reading the object
      
      @SuppressWarnings("unchecked") // this ensures that we are aware of the unchecked type-casting to the de-serialised object
      ArrayList<Employee> list =  (ArrayList<Employee>) os.readObject() ; 

      os.close();

      System.out.println("File read succesfully");

      for(Employee e : list){
        System.out.println(e);
      }
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    }
    catch(IOException | ClassNotFoundException e){
      System.err.println(e.getMessage());
    }
  }
  public static void main(String[] args) {
    Serialise();
    deSerialise();
  }
}
