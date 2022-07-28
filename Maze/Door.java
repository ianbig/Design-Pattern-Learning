package Maze;

public class Door extends MapSite {
  private Room leftRoom;
  private Room rightRoom;
  boolean isOpen;

  Door(Room _leftRoom, Room _rightRoom) {
    leftRoom = _leftRoom;
    rightRoom = _rightRoom;
    isOpen = false;
  }

  @Override
  public void enter() {
    if (isOpen) {
      System.out.println("Pass through a door");
    } else {
      System.out.println("Bump into a door");
    }
  }
}
