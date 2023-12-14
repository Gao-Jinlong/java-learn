import java.io.*;

public class BRRead {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("输入字符，按下 'q' 键退出");

    do {
      c = (char) bufferReader.read();
      System.out.println(c);
    } while (c != 'q');
  }
}
