import java.util.concurrent.*;

public class TestThread {
  public static void main(String args[]) {
    RunnableDemo R1 = new RunnableDemo("Thread-1");
    R1.start();

    RunnableDemo R2 = new RunnableDemo("Thread-2");
    R2.start();

    ThreadDemo T1 = new ThreadDemo("Thread-3");
    T1.start();

    ThreadDemo T2 = new ThreadDemo("Thread-4");
    T2.start();

    CallableThread callableThread = new CallableThread();
    FutureTask<Integer> futureTask = new FutureTask(callableThread);

    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + "的循环变量 i 的值" + i);
      if (i == 20) {
        new Thread(futureTask, "有返回值的线程").start();
      }
    }
    try {
      System.out.println("子线程的返回值" + futureTask.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }
}

/**
 * 实现 Runnable 接口来创建线程
 */
class RunnableDemo implements Runnable {
  private Thread t;
  private String threadName;

  RunnableDemo(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println(("Thread:" + threadName + "," + i));
        Thread.sleep(50);
      }
    } catch (Exception e) {
      System.out.println("Thread" + threadName + " interrupted.");
    }
    System.out.println("Thread" + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}

/**
 * 通过继承 Thread 来创建线程
 */
class ThreadDemo extends Thread {
  private Thread t;
  private String threadName;

  ThreadDemo(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println(("Thread：" + threadName + "," + i));
        Thread.sleep(50);
      }
    } catch (Exception e) {
      System.out.println("Thread" + threadName + " interrupted.");
    }
    System.out.println("Thread" + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}

/**
 * 通过 Callable 和 Future 创建线程
 */
class CallableThread implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    int i = 0;
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }

    return i;
  }
}