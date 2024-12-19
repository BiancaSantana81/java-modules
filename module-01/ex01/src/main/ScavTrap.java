package main;

public class ScavTrap extends ClapTrap {

  public static final String YELLOW = "\033[1;33m";
  public static final String RESET = "\033[0m";

  public ScavTrap (String name) {
    super(name);
    this.hitPoints = 100;
    this.energyPoints = 50;
    this.attackDamage = 20;
    System.out.println(YELLOW + "ScavTrap: " + RESET + this.name + " constructor called.");
  }

  // método sobrescrito da classe base, por isso o @Override antecede sua declaração
  @Override
  public void attack(final String target) {
    System.out.println("ScavTrap attacks differently!");
    super.attack(target);
  }

  // Não está na classe base, mas foi implementado aqui na classe filha.
  public void guardGate() {
    System.out.println(YELLOW + "ScavTrap: " + RESET + name + " is now in defense mode.");
  }
}