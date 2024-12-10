package main;

/**
 * Receber uma ‘string’ como argumento e a retornar em letras maiúsculas.
 * Caso nenhuma ‘string’ seja passada como argumento ele deve retornar:
 * '* LOUD AND UNBEARABLE FEEDBACK NOISE *'
 */
public class Megaphone {
  /**
   * main class.
   */
  @SuppressWarnings("checkstyle:NeedBraces")
  public static void main(String[] args) {

    // É interessante destacar que a JVM não manda o executável como argumento.
    // Logo [.jar] aqui não será argumento (como seria em C e C++)

    int numbersArgs = args.length;

    if (numbersArgs == 0) {
      System.out.println("* LOUD AND UNBEARABLE FEEDBACK NOISE *");
      return;
    } else {
      for (String arg : args) {
        System.out.print(arg.toUpperCase() + " ");
      }
      System.out.println("\n");
    }
  }
}