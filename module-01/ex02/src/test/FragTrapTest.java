package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FragTrapTest {

  @Test
  public void testConstructor() {
    FragTrap frag = new FragTrap("Nuru");
    assertEquals("Nuru", frag.getName(), "Name should be initialized correctly.");
    assertEquals(100, frag.getHitPoints(), "Hit points should be initialized to 100.");
    assertEquals(100, frag.getEnergyPoints(), "Energy points should be initialized to 100.");
    assertEquals(30, frag.getAttackDamage(), "Attack damage should be initialized to 30.");
  }

  @Test
  public void testAttack() {
    FragTrap frag = new FragTrap("Nuru");
    frag.attack("Enemy");
    assertEquals(99, frag.getEnergyPoints(), "Energy points should decrease by 1 after an attack.");
  }

  @Test
  public void testAttackWithoutEnergy() {
    FragTrap frag = new FragTrap("Nuru");
    for (int i = 0; i < 100; i++) {
      frag.attack("Enemy");
    }
    assertEquals(0, frag.getEnergyPoints(), "Energy points should be 0 after maximum attacks.");
    frag.attack("Enemy");
    assertEquals(0, frag.getEnergyPoints(), "Energy points should remain 0 after attacking without energy.");
  }

  @Test
  public void testTakeDamage() {
    FragTrap frag = new FragTrap("Nuru");
    frag.takeDamage(30);
    assertEquals(70, frag.getHitPoints(), "Hit points should decrease by the damage taken.");
    frag.takeDamage(70);
    assertEquals(0, frag.getHitPoints(), "Hit points should not go below 0.");
  }

  @Test
  public void testBeRepaired() {
    FragTrap frag = new FragTrap("Nuru");
    frag.takeDamage(50);
    frag.beRepaired(30);
    assertEquals(80, frag.getHitPoints(), "Hit points should increase by the repair amount.");
  }
}
