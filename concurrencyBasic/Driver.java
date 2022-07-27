package concurrencyBasic;

import java.util.concurrent.Executor;

public class Driver {
  public static void main(String[] args) {
    Executor thread = new Invoker();
    thread.execute(() -> {
      System.out.println("Task is executed");
    });
  }
}
