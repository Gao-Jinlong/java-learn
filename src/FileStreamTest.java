import java.io.*;

public class FileStreamTest {
  public static void main(String[] args) throws IOException {
    File file = new File("hello.txt");
    FileOutputStream fileOutputStream = new FileOutputStream(file);

    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

    outputStreamWriter.append("中文输入");
    outputStreamWriter.append("\r\n");
    outputStreamWriter.append("English");
    outputStreamWriter.close();

    fileOutputStream.close();

    FileInputStream fileInputStream = new FileInputStream(file);
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
    StringBuffer stringBuffer = new StringBuffer();

    while (inputStreamReader.ready()) {
      stringBuffer.append((char) inputStreamReader.read());
    }
    System.out.println(stringBuffer.toString());
    inputStreamReader.close();

    fileInputStream.close();
  }
}
