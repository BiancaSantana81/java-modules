package main;

import java.util.Scanner; // -> para pegar input do usuário

public class PhoneBook {

  public static final String RESET = "\033[0m";
  public static final String GREEN = "\033[1;32m";
  public static final String BLUE = "\033[1;34m";
  public static final String RED = "\033[1;31m";
  public static final String PINK = "\033[1;35m";

  /* criação do array de contatos de PhoneBook -
  * em Java eu preciso usar new para criar um array também. */

  private static final int MAX_CONTACTS = 8; // tamanho fixo do array declarado com macro
  private Contact[] phoneBook = new Contact[MAX_CONTACTS]; // array de contatos
  private int currentIndex = 0; // posição atual no array

  public void addContact() {

    Contact currentContact = new Contact(); // obj para atualizar contato antes de enviar para o array phonebook
    Scanner scanner = new Scanner(System.in); // receber entrada do usuário
    String firstName, lastName, nickName, phoneNumber, darkestSecret; // atributos de contato

    if (this.currentIndex >= this.MAX_CONTACTS) {
      System.out.println( RED + "Phone book full! The oldest contact will be replaced with this one." + RESET);
    }
    int index = this.currentIndex % this.MAX_CONTACTS;

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
      System.out.print("Enter phone number: ");
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
        currentContact.setDarkestSecret(darkestSecret);
        break;
      }
    }

    this.phoneBook[index] = currentContact;
    System.out.println(GREEN + "Contact added successfully!" + RESET);
    this.currentIndex++;
  }

  public void searchContact() {

    if (this.currentIndex == 0) {
      System.out.println(RED + "The phone book is empty. Add some contacts." + RESET);
      return ;
    }

    int totalContacts = Math.min(this.currentIndex, this.MAX_CONTACTS); // Número total de contatos disponíveis
    int startIndex = this.currentIndex >= this.MAX_CONTACTS ? this.currentIndex % this.MAX_CONTACTS : 0; // Ponto de início no array circular

    System.out.printf(BLUE + "%-10s| %-15s| %-15s| %-15s|\n" + RESET, "Index", "First Name", "Last Name", "Nickname");
    System.out.println(BLUE + "--------------------------------------------------------------" + RESET);

    for (int i = 0; i < totalContacts; i++) {
        int index = (startIndex + i) % this.MAX_CONTACTS;
        System.out.printf("%-10d| %-15s| %-15s| %-15s|\n",
          i + 1,
          this.phoneBook[i].getFirstName(),
          this.phoneBook[i].getLastName(),
          this.phoneBook[i].getNickName()
        );
      }

      Scanner scannerInt = new Scanner(System.in);
      int index;

      while (true) {
        System.out.print(PINK + "Enter the contact's index to see more details: " + RESET);
        if (scannerInt.hasNextInt()) {
          index = scannerInt.nextInt();
          if (index >= 1 && index <= totalContacts) {
            break;
          } else {
            System.out.print( RED + "Invalid entry! Enter the contact's index." + RESET);
          }
        } else {
          System.out.print( RED + "Invalid entry! Enter the contact's index." + RESET);
          scannerInt.next();
        }
      }
      printContactDetails(index - 1);
  }

  public void printContactDetails(int index) {

    Contact contact = phoneBook[index];

    System.out.println(GREEN + "Contact Details:" + RESET);
    System.out.println("First Name: " + contact.getFirstName());
    System.out.println("Last Name: " + contact.getLastName());
    System.out.println("Nickname: " + contact.getNickName());
    System.out.println("Phone Number: " + contact.getPhoneNumber());
    System.out.println("Darkest Secret: " + contact.getDarkestSecret());
    }
}