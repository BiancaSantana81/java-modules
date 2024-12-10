import main.Megaphone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MegaphoneTest {

  @Test
  public void testMegaphoneWithoutArgs() {
    // Configurar a saída padrão
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    // Executar o método principal sem argumentos
    Megaphone.main(new String[]{});

    // Restaurar a saída padrão
    System.setOut(originalOut);

    // Verificar a saída
    String output = outputStream.toString().trim();
    assertEquals("* LOUD AND UNBEARABLE FEEDBACK NOISE *", output);
  }
  @Test
  public void testUpperCase() {

    // reconfigurar a saída padrão para aceitar os argumentos que eu passarei aqui no teste.
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    String args[] = {"shhhhh... I think the students are asleep...",
      "Damnit ", "!", "Sorry students, I thought this thing was off."};

    Megaphone.main(args);

    // Restaurar a saída padrão
    System.setOut(originalOut);

    // Capturar a saída e verificar
    String output = outputStream.toString().trim();
    String expectedOutput = "SHHHHH... I THINK THE STUDENTS ARE ASLEEP... DAMNIT  ! SORRY STUDENTS, I THOUGHT THIS THING WAS OFF.";

    // Verificar se a saída está correta
    assertEquals(expectedOutput, output);
  }
}
