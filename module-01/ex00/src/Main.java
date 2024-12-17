import main.*;

public class Main {
  public static void main(String[] args) {

    // Fight history...
    ClapTrap nuru = new ClapTrap("Deka");
    ClapTrap firstborn = new ClapTrap("Melanis");

    nuru.attack(firstborn.getName());
    firstborn.takeDamage(5);

    System.out.println("Melanis was furious with Deka for her boldness...");

    firstborn.attack(nuru.getName());
    nuru.takeDamage(6);

    nuru.seePoints();
    firstborn.seePoints();

    firstborn.beRepaired(5);
    nuru.beRepaired(6);

    for (int i = 0; i < 9; i++) {
      nuru.attack(firstborn.getName());
      firstborn.takeDamage(1);
    }

    System.out.println("Nuru, born from the blood of the goddesses, capable of killing one of the war queens!");

    nuru.attack(firstborn.getName());
    firstborn.takeDamage(1);

    firstborn.seePoints();

    System.out.println("The golden goddesses will pay me!");
  }
}