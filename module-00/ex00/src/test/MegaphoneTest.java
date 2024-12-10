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
}
