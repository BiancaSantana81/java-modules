package main;

import java.util.Scanner; // -> para pegar input do usuário

public class PhoneBook {

  public static final String RESET = "\033[0m";
  public static final String GREEN = "\033[1;32m";
  public static final String RED = "\033[1;31m";

  /* criação do array de contatos de PhoneBook -
  * em Java eu preciso usar new para criar um array também. */

  private static final int MAX_CONTACTS = 8; // tamanho fixo do array declarado com macro
  private Contact[] phoneBook = new Contact[MAX_CONTACTS]; // array de contatos
  private int currentIndex = 0; // posição atual no array

  public void addContact() {

    Contact currentContact = new Contact();

    Scanner scanner = new Scanner(System.in);

    String firstName, lastName, nickName, phoneNumber, darkestSecret;

    while (true) {
      System.out.print("Enter first name: ");
      firstName = scanner.nextLine().trim();
      if (firstName.isEmpty()) {
        System.out.println(RED + "First name cannot be empty. Please try again." + RESET);
      } else {
        currentContact.setFirstName(firstName);
        break;
      }
    }

    while (true) {
      System.out.print("Enter last name: ");
      lastName =  scanner.nextLine().trim();
      if (lastName.isEmpty()) {
        System.out.println(RED + "Last name cannot be empty. Please try again." + RESET);
      } else {
        currentContact.setLastName(lastName);
        break;
      }
    }

    while (true) {
      System.out.print("Enter nickname: ");
      nickName =  scanner.nextLine().trim();
      if (nickName.isEmpty()) {
        System.out.println(RED + "Nickname cannot be empty. Please try again." + RESET);
      } else {
        currentContact.setNickName(nickName);
        break;
      }
    }

    while (true) {
      System.out.print("Enter phone numer: ");
      phoneNumber =  scanner.nextLine().trim();
      if (phoneNumber.isEmpty()) {
        System.out.println(RED + "Phone number cannot be empty. Please try again." + RESET);
      } else {
        currentContact.setPhoneNumber(phoneNumber);
        break;
      }
    }

    while (true) {
    System.out.print("Enter a dark secret: ");
    darkestSecret =  scanner.nextLine().trim();
      if (darkestSecret.isEmpty()) {
        System.out.println(RED + "Darkest secret cannot be empty. Please try again." + RESET);
      } else {
        currentContact.setPhoneNumber(darkestSecret);
        break;
      }
    }

    phoneBook[currentIndex] = currentContact;
    System.out.println(GREEN + "Contact added successfully!" + RESET);

    currentIndex = (currentIndex + 1) % phoneBook.length;
  }

  public void searchContact() {
    System.out.println("pesquisar contato");
    return;
  }
}