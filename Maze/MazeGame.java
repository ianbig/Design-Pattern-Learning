package Maze;

public class MazeGame {
  private static int roomNumber = 0;

  public static Maze createMaze(AbstractMazeFactory factory) {
    Maze maze = factory.makeMaze();
    Room room1 = factory.makeRoom(MazeGame.roomNumber++);
    Room room2 = factory.makeRoom(MazeGame.roomNumber++);
    maze.addRoom(room1);
    maze.addRoom(room2);

    room1.setSides(0, factory.makeDoor(room1, room2));
    room1.setSides(1, room2);
    room1.setSides(2, factory.makeDoor(room1, room2));
    room1.setSides(3, factory.makeDoor(room1, room2));

    return maze;
  }

  public static void main(String[] args) {
    SimpleMazeFactory simpleMazeFactory = new SimpleMazeFactory();
    Maze mazeRoom = MazeGame.createMaze(simpleMazeFactory);
    try {
      Room room0 = mazeRoom.getRomo(0);
      mazeRoom.curSite = room0.enter();
    } catch (Exception e) {
      e.printStackTrace();
    }

    SpellMazeFactory spellMazeFactory = new SpellMazeFactory();
    Maze spellMaze = MazeGame.createMaze(spellMazeFactory);

    try {
      Room room0 = spellMaze.getRomo(0);
      spellMaze.curSite = room0.enter();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
