import main.*;

public class Main {
  public static void main(String[] args) {
    ScavTrap whiteHands = new ScavTrap("White Hands");
    ScavTrap renegade = new ScavTrap("Renegade");

    whiteHands.attack(renegade.getName());
    renegade.takeDamage(whiteHands.getAttackDamage());

    whiteHands.guardGate();
    renegade.guardGate();

    whiteHands.seePoints();
    renegade.seePoints();

    System.out.println("The cruelest battle between one of the first warriors and a deadly Howler!");
  }
}