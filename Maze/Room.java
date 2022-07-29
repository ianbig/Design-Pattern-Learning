package Maze;

import java.util.Random;

public class Room extends MapSite {
  private MapSite sides[];
  private int roomNo;
  private Random directionGenerator;

  public Room(int _roomNo) {
    sides = new MapSite[4];
    roomNo = _roomNo;
    directionGenerator = new Random();
  }

  @Override
  public MapSite enter() {
    int direction = directionGenerator.nextInt(3);
    MapSite site = sides[direction];
    System.out.println("I am entering a " + site.toString());
    return site;
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

  @Override
  public String toString() {
    return "Room " + roomNo;
  }
}
