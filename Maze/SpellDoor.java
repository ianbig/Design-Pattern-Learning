package Maze;

public class SpellDoor extends Door {
  private String password;
  SpellDoor(Room r1, Room r2, String _passwd) {
    super(r1, r2);
    password = _passwd;
  }

  public void castSpell(String spell) {
    if (isOpen) { return; }

    if (spell.equals(password)) {
      isOpen = true;
    }
  }

  @Override
  public MapSite enter() {
    if (isOpen) {
      System.out.println("Pass through spelldoor");
      return rightRoom;
    } 

    return leftRoom;
  }

  @Override
  public String toString() {
    return "spelldoor that is " + (isOpen ? "open" : "closed");
  }
}
