import main.*;

public class Main {

  public static void main(String[] args) {

    // Criação dos FragTraps
    FragTrap nuru = new FragTrap("Nuru");
    FragTrap idugu = new FragTrap("Idugu");

    System.out.println("\n--- The Battle Begins! ---\n");

    // Nuru ataca Idugu
    nuru.attack(idugu.getName());
    idugu.takeDamage(nuru.getAttackDamage());
    idugu.seePoints();

    // Idugu revida atacando Nuru
    idugu.attack(nuru.getName());
    nuru.takeDamage(idugu.getAttackDamage());
    nuru.seePoints();

    nuru.seePoints();
    idugu.seePoints();

    // Idugu sugere uma trégua
    if (idugu.getHitPoints() > 0) {
      idugu.highFivesGuys();
    }
    System.out.println("Gods must not succumb to the human desire for war!");
  }
}
