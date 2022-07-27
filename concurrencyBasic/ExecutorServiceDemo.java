package concurrencyBasic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
  ExecutorService executor = Executors.newFixedThreadPool(10);

  public void execute() {
    executor.submit(new Task());
    // executor.shutdown();
  }
  
  public static void main(String[] args) {
    ExecutorServiceDemo demo = new ExecutorServiceDemo();
    demo.execute();
  }
}
