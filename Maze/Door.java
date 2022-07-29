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

  public Room otherSide(Room room) {
    if (room.equals(leftRoom)) {
      return rightRoom;
    }

    return leftRoom;
  }

  @Override
  public boolean equals(Object o) {
    if (o != null && o.getClass().equals(getClass())) {
      Door doorObj = (Door)o;
      return doorObj.leftRoom.equals(leftRoom) && doorObj.rightRoom.equals(rightRoom);
    }

    return false;
  }
}
