package main;

public class Contact {

  // atributos privados da classe
  private String firstName;
  private String lastName;
  private String nickName;
  private int phoneNumber;
  private String darkestSecret;

  // construtor (em Java a implementação de destrutor é obsoleta).

  Contact() {
    System.out.println("Contact: Default constructor called.");
  }

  // getters da classe

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getNickName() {
    return this.nickName;
  }

  public int getPhoneNumber() {
      return this.phoneNumber;
  }

  public String getDarkestSecret() {
    return this.darkestSecret;
  }

  // setters da classe

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setDarkestSecret(String darkestSecret) {
    this.darkestSecret = darkestSecret;
  }
}