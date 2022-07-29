package Maze;

public class Wall extends MapSite {
  public Wall() {
  }

  @Override
  public void enter() {
    System.out.println("I am entering a Wall");
  }

  @Override
  public boolean equals(Object o) {
    if (o != null && o.getClass().equals(getClass())) { return true; }

    return false;
  }
}
