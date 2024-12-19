package test;

import main.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// para capturar se as mensagens de saída estão corretas.
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ScavTrapTest {

  private ScavTrap scav1 = new ScavTrap("Nuru");
  private ScavTrap scav2 = new ScavTrap("Melanis");

  @Test
  public void testConstructor() {
    assertEquals("Nuru", scav1.getName(), "Name should be initialized correctly.");
  }

  @Test
  public void testsAttack() {

    // testando apenas um ataque

    scav1.attack("Deka");
    assertEquals(49, scav1.getEnergyPoints());

    // testando ataques multipluos

    for (int i = 0; i < 50; i++) {
      scav1.attack("Enemy");
    }
    assertEquals(0, scav1.getEnergyPoints());

    // tentando atacar sem energia

    scav1.attack("Enemy");
    assertEquals(0, scav1.getEnergyPoints());

  }

  @Test
  public void testsTakeDamage() {

    // verificando takeDamage
    scav2.takeDamage(100);
    assertEquals(0, scav2.getHitPoints());

    // tentar causar danos em um Clap morto
    scav2.takeDamage(1);
    assertEquals(0, scav2.getHitPoints());

  }

  @Test
  public void testsBeRepaired() {

    scav2.takeDamage(100);

    for (int i = 0; i < 50; i++) {
      scav1.attack("Enemy");
    }

    // tentando recuperar um scav sem energia ou morto

    scav1.beRepaired(2);
    scav2.beRepaired(2);

    assertEquals(100, scav1.getHitPoints());
    assertEquals(0, scav2.getHitPoints());
  }
}
