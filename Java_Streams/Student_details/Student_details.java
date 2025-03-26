import java.io.*;

class Student {
  int roll ; 
  String name ; 
  double GPA ; 
  Student(int roll , String name , double GPA) {
    this.roll = roll; 
    this.name = name; 
    this.GPA = GPA ;
  }
}

public class Student_details {
  public static void put(){
    Student s1 = new Student(12 , "Joe" , 8.7) ; 
    try {
      DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat")) ; 

      dos.writeUTF(s1.name); 
      dos.writeInt(s1.roll);
      dos.writeDouble(s1.GPA);

      dos.close();
      System.out.println("File written successfully");

    } catch (IOException e) {
      System.err.println(e.getMessage()); 
    }
  }

  public static void retrieve(){
    try {
      DataInputStream dis = new DataInputStream(new FileInputStream("output.dat")) ; 

       String name = dis.readUTF() ; //storing in a local variable named 'name'
       int roll = dis.readInt(); 
       double GPA = dis.readDouble() ; 

       dis.close();

       System.out.println("name: "+name + " roll: "+roll +" GPA : "+GPA);
       System.out.println("\nFile read successfully");
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
  public static void main(String[] args) {
    put(); 
    retrieve();
  }  
}
