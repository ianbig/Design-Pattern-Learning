package Maze;

public class Wall extends MapSite {
  public Wall() {
  }

  @Override
  public void enter() {
    System.out.println("I am entering a Wall");
  }
}
