package Maze;

public class Door extends MapSite {
  protected Room leftRoom; // the room player current in
  protected Room rightRoom;
  boolean isOpen;

  Door(Room _leftRoom, Room _rightRoom) {
    leftRoom = _leftRoom;
    rightRoom = _rightRoom;
    isOpen = false;
  }

  @Override
  public MapSite enter() {
    if (isOpen) {
      System.out.println("Pass through a door");
      return otherSide(leftRoom);
    }
    
    System.out.println("Bump into a door");
    return leftRoom;
  }

  private Room otherSide(Room room) {
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

  @Override
  public String toString() {
    return "A Door with door " + (isOpen ? "open" : "closed");
  }
}
