import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayListDemo
 */
public class ArrayListDemo {

  public static void main(String args[]) {
    ArrayList<String> sites = new ArrayList<String>();
    sites.add("Google");
    sites.add("Baidu");
    sites.add("Taobao");
    sites.add("Zhihu");

    System.out.println(sites);

    System.out.println(sites.get(2));

    sites.set(2, "Weibo");
    System.out.println(sites);

    sites.remove(2);
    System.out.println(sites);

    System.out.println(sites.size());

    for (String i : sites) {
      System.out.println(i);
    }

    Collections.sort(sites);
    for (String i : sites) {
      System.out.println(i);
    }
  }
}