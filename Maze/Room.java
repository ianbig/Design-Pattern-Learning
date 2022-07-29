package Maze;

public class Room extends MapSite {
  private MapSite sides[];
  private int roomNo;

  public Room(int _roomNo) {
    sides = new MapSite[4];
    roomNo = _roomNo;
  }

  @Override
  public void enter() {
    System.out.println("I am entering a rooms");
  }

  public void setSides(int direction, MapSite site) {
    sides[direction] = site;
  }

  public MapSite getSide(int direction) {
    return sides[direction];
  }

  public int getRoomNo() {
    return roomNo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj.getClass().equals(getClass())) {
      Room room = (Room)obj;
      for (int i = 0; i < 4; i++) {
        if (!room.equals(sides[i])) {
          return false;
        }
      }
      return true;
    }

    return false;
  }
}
