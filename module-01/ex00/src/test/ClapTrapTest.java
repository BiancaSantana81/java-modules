package test;

import main.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// para capturar se as mensagens de saída estão corretas.
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClapTrapTest {

  private ClapTrap clap = new ClapTrap("Nuru");
  private ClapTrap clap2 = new ClapTrap("Melanis");

  @Test
  public void testConstructor() {
    assertEquals("Nuru", clap.getName(), "Name should be initialized correctly.");
  }

  @Test
  public void testsAttack() {

    // testando apenas um ataque

    clap.attack("Deka");
    assertEquals(9, clap.getEnergyPoints());

    // testando ataques multipluos

    for (int i = 0; i < 9; i++) {
      clap.attack("Enemy");
    }
    assertEquals(0, clap.getEnergyPoints());

    // tentando atacar sem energia

    clap.attack("Enemy");
    assertEquals(0, clap.getEnergyPoints());

  }

  @Test
  public void testsTakeDamage() {

    // verificando takeDamage
    clap2.takeDamage(10);
    assertEquals(0, clap2.getHitPoints());

    // tentar causar danos em um Clap morto
    clap2.takeDamage(1);
    assertEquals(0, clap2.getHitPoints());

  }

  @Test
  public void testsBeRepaired() {

    clap2.takeDamage(10);

    for (int i = 0; i < 10; i++) {
      clap.attack("Enemy");
    }

    clap.beRepaired(2);
    clap2.beRepaired(2);

    assertEquals(10, clap.getHitPoints());
    assertEquals(0, clap2.getHitPoints());
  }
}
