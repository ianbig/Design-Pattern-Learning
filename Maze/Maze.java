package Maze;

import java.util.ArrayList;

public class Maze {
  ArrayList<Room> rooms;

  Maze() {
    rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public Room getRomo(int roomNo) throws Exception{
    if (roomNo >= rooms.size()) {
      throw new Exception();
    }
    return rooms.get(roomNo);
  }
}
