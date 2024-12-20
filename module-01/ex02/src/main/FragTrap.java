package main;

public class FragTrap extends ClapTrap {

  public static final String RESET = "\033[0m";
  public static final String BLUE = "\033[1;34m";

  public FragTrap(String name) {
    super(name);
    this.hitPoints = 100;
    this.energyPoints = 100;
    this.attackDamage = 30;

    System.out.println(BLUE + "FragTrap: " + RESET + this.name + " constructor called.");
  }

   public void highFivesGuys() {
    System.out.println(BLUE + "FragTrap: " + RESET + this.name + " is suggesting a truce!");
  }
}