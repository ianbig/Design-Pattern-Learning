package Maze;

public class MazeGame {
  public static Maze createMaze() {
    Maze maze = new Maze();
    Room room1 = new Room(0);
    room1.setSides(0, new Wall());
    room1.setSides(1, new Wall());

    maze.addRoom(room1);
    return maze;
  }

  public static void main(String[] args) {
    Maze mazeRoom = MazeGame.createMaze();
    try {
      Room room0 = mazeRoom.getRomo(0);
      room0.enter();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
