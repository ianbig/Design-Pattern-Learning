package Maze;

abstract public class AbstractMazeFactory {
  abstract public Room makeRoom(int roomNo);
  abstract public Door makeDoor(Room r1, Room r2);
  abstract public Maze makeMaze();
}
