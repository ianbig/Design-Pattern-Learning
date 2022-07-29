package Maze;

import java.util.ArrayList;

public class Maze {
  ArrayList<Room> rooms;
  public MapSite curSite;

  Maze() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    System.out.println("add Room " + room.getClass().toString() + " in " + getClass().toString());
    rooms.add(room);
  }

  public Room getRomo(int roomNo) throws Exception{
    if (roomNo >= rooms.size()) {
      throw new Exception();
    }
    return rooms.get(roomNo);
  }
}
