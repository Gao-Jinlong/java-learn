public class VolatileModifier {
  private volatile boolean active;
  
  public void run(){
    active = true;
    while(active){
      System.out.println("Running");
    }
  }

  public void stop(){
    active = false;
  }

  public static void main(String[] args){
    VolatileModifier vm = new VolatileModifier();

    Thread thread = new Thread(vm::run);
    thread.start();

    try{
      Thread.sleep(1); // 主线程休眠1毫秒，让thread线程运行
    }catch(InterruptedException e){
      e.printStackTrace();
    }

    vm.stop();
  }
}
