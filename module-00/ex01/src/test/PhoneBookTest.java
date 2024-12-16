package test;

import main.PhoneBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneBookTest {

  @Test
  public void testAddContact() {
    System.out.println("Running testAddContact...");

    // Simula a entrada do usuário
    String simulatedInput = "John\nDoe\nJohnny\n123456789\nLikes pizza\n";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
    System.setIn(inputStream);

    // Captura a saída
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Testa o método addContact
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addContact();

    // Verifica se o contato foi adicionado corretamente
    String output = outputStream.toString();
    assertTrue(output.contains("Contact added successfully!"), "Test failed: Contact not added");

    System.out.println("testAddContact passed.\n");
  }

  @Test
  public void testSearchContact() {
    System.out.println("Running testSearchContact...");

    // Simula a entrada para adicionar um contato
    String simulatedInputAdd = "John\nDoe\nJohnny\n123456789\nLikes pizza\n";
    ByteArrayInputStream inputStreamAdd = new ByteArrayInputStream(simulatedInputAdd.getBytes());
    System.setIn(inputStreamAdd);

    // Captura a saída
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Cria o objeto PhoneBook e adiciona o contato
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addContact();

    // Simula a entrada para pesquisar o contato
    String simulatedInputSearch = "1"; // Nome do apelido para buscar
    ByteArrayInputStream inputStreamSearch = new ByteArrayInputStream(simulatedInputSearch.getBytes());
    System.setIn(inputStreamSearch);

    // Chama o método searchContact
    phoneBook.searchContact();

    // Captura a saída após a busca
    String output = outputStream.toString();

    // Verifica se o contato aparece nos resultados
    assertTrue(output.contains("Johnny"), "Test failed: Contact not found");
    assertTrue(output.contains("123456789"), "Test failed: Contact details not displayed correctly");
    assertTrue(output.contains("Likes pizza"), "Test failed: Contact notes not displayed");

    System.out.println("testSearchContact passed.\n");
  }
}
