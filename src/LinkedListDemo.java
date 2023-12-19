import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String args[]) {
    LinkedList<String> sites = new LinkedList<String>();
    sites.add("Google");
    sites.add("Baidu");
    sites.add("Taobao");
    sites.add("Zhihu");
    System.out.println(sites);

    sites.addFirst("Weibo");
    System.out.println(sites);

    sites.addLast("Weixin");
    System.out.println(sites);

    sites.removeFirst();
    sites.removeLast();
    System.out.println(sites);

    System.out.println(sites.getFirst());
    System.out.println(sites.getLast());

    for (String i : sites) {
      System.out.println(i);
    }

  }

}
