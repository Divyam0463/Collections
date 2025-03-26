import java.io.* ;

class writerThread extends Thread {
  private PipedWriter writer;

  writerThread(PipedWriter writer) {
    this.writer = writer;
  }

  public void run() {
    try {
      writer.write("hello -> this is writer !");
      writer.close();

      System.out.println("writer wrote it !\n");
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}

class readerThread extends Thread {
  private PipedReader reader;

  public readerThread(PipedReader reader) {
    this.reader = reader;
  }

  public void run() {
    try {
      int data;
      while ((data = reader.read()) != -1) {
        System.out.print((char)data);
      }
      reader.close();
      
    } catch (IOException e) {
      System.err.println("Error: "+e.getMessage());
    }
  }
}

public class Piped_Streams {
  public static void main(String[] args) {
    try {
      PipedWriter writer = new PipedWriter();
      PipedReader reader = new PipedReader();

      // connect writer to reader
      reader.connect(writer);

      writerThread wT = new writerThread(writer);
      readerThread rT = new readerThread(reader);

      wT.start();
      rT.start();
    } catch (IOException e) {
      System.err.println(e.getStackTrace());
    }
  }
}