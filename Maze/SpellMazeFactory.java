package Maze;

public class SpellMazeFactory extends AbstractMazeFactory {
  @Override
  public Maze makeMaze() {
    return new Maze();
  }

  @Override 
  public SpellDoor makeDoor(Room r1, Room r2) {
    return new SpellDoor(r1, r2, "Ian is awesome");
  }

  @Override
  public Room makeRoom(int roomNumber) {
    return new Room(roomNumber);
  }

}
