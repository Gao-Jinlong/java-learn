import java.io.*;

public class DirDemo {
  public static void main(String[] args) {
    String dirname = "tmp/user/java/bin";
    File file = new File(dirname);

    // file.mkdir(); // 创建目录
    file.mkdirs(); // 创建目录和它的所有父目录

    String rootPath = "tmp";
    File rootDir = new File(rootPath);
    if (rootDir.isDirectory()) {
      System.out.println("目录" + rootPath);

      String list[] = rootDir.list();
      for (int i = 0; i < list.length; i++) {
        File fileItem = new File(rootPath + "/" + list[i]);
        if (fileItem.isDirectory()) {
          System.out.println(list[i] + " 是一个目录");
        } else {
          System.out.println(list[i] + " 是一个文件 ");
        }
      }
    } else {
      System.out.println(rootPath + " 不是一个目录");
    }
  }
}
