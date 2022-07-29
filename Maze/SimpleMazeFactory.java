package Maze;

public class SimpleMazeFactory extends AbstractMazeFactory {
  @Override
  public Maze makeMaze() {
    return new Maze();
  }

  @Override 
  public Door makeDoor(Room r1, Room r2) {
    return new Door(r1, r2);
  }

  @Override
  public Room makeRoom(int roomNumber) {
    return new Room(roomNumber);
  }

}
