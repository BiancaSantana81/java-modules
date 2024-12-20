package main;

import java.util.Scanner; // -> para pegar input do usuário

public class Main {

    // Cores ANSI
    public static final String RESET = "\033[0m";
    public static final String WHITE = "\033[1;37m";
    public static final String PINK = "\033[1;35m";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\033[1;32m";
    public static final String YELLOW = "\033[1;33m";
    public static final String BLUE = "\033[1;34m";

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // recebe a entrada do usuário
    String input; // captura a entrada para tratamento.

    PhoneBook phonebook = new PhoneBook();

    printMenu();
    while (true) {
      System.out.print(PINK + "Type your option here: " + RESET);
      input = scanner.nextLine().trim().toLowerCase();

      switch (input) {
        case "add":
          phonebook.addContact();
          break;
        case "search":
          phonebook.searchContact();
          break;
        case "exit":
          System.out.println(BLUE + "Program closed. Until next time!" + RESET);
          return;
        default:
          System.out.println(RED + "Invalid option! try again..." + RESET);
          break;
      }
    }
  }

  // Método que imprime o cabeçalho com as opções
  public static void printMenu() {
    System.out.println(PINK + "Welcome to the phone book!");
    System.out.println("ADD: Add new contact");
    System.out.println("SEARCH: Search for a contact in the list");
    System.out.println("EXIT: Exit the program" + RESET);
  }
}