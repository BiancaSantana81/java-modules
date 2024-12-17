package main;

/**
 * Anotações importantes:
 * 1. Const X final em Java: apenas declarar como String já garante que este valor não será modificado, pois String é imutável.
 * Porém, para reforçar a imutabilidade a palavra final no lugar de const garante que o valor não será alterado.
 * 2. Em Java não existem tipos unsigned int, todos os tipos númericos foram criados para armazenar positivos e negativos.
 */

public class ClapTrap {

  // colors
  public static final String PINK = "\033[1;35m";
  public static final String RESET = "\033[0m";

  // atributos da classe

  private String name;
  private int hitPoints = 10;
  private int energyPoints = 10;
  private int attackDamage = 0;

  // Construtores - padrão e parametrizado

  public ClapTrap() {
    System.out.println(PINK + "ClapTrap:"  + RESET + "default constructor called.");
  }

  public ClapTrap(String name) {
    this.name = name;
    System.out.println(PINK + "ClapTrap:" + RESET + this.name + " constructor called.");
  }

  // getters

  public int getHitPoints() {
    return this.hitPoints;
  }
  public int getEnergyPoints() {
    return this.energyPoints;
  }
  public int getAttackDamage() {
    return this.attackDamage;
  }
  public String getName() {
    return this.name;
  }

  // setters

  public void setName(String name) {
    this.name = name;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public void setEnergyPoints(int energyPoints) {
    this.energyPoints = energyPoints;
  }

  public void setAttackDamage(int attackDamage) {
    this.attackDamage = attackDamage;
  }

  // métodos

  public void attack(final String target) {

    if (this.energyPoints <= 0) {
      System.out.println(PINK + "ClapTrap: " + RESET + name + " is out of energy points. Rest and attack later.");
      return ;
    } else if (this.hitPoints <= 0) {
      System.out.println(PINK + "ClapTrap: " + RESET + name + " is dead! impossible to continue fighting.");
      return ;
    }
    this.energyPoints--;
    System.out.println(PINK + "ClapTrap: " + RESET + this.name +
      " attacked " + target + "!");
  }

  public void takeDamage(int amount) {
    if (this.hitPoints <= 0) {
      System.out.println(PINK + "ClapTrap: " + RESET + name + " is dead! leave him alone.");
      return ;
    }
    this.hitPoints -= amount;
    System.out.println(PINK + "ClapTrap: " + RESET + name + " takes " + amount + " points of damage!");
  }

  public void beRepaired(int amount) {
    if (this.energyPoints <= 0) {
      System.out.println(PINK + "ClapTrap: " + RESET + name + " is out of energy, impossible to recover hit points.");
      return ;
    } else if (this.hitPoints <= 0) {
      System.out.println(PINK + "ClapTrap: " + RESET + name + " is already dead. No resuscitation, okay?");
      return ;
    }
    this.energyPoints--;
    this.hitPoints += amount;
    System.out.println(PINK + "ClapTrap: " + RESET + name + " now there is " + hitPoints + " hit points.");
  }

  // método extra:
  public void seePoints() {
    System.out.println(PINK + "ClapTrap: " + RESET + name + " has " + energyPoints + " energy points and " + hitPoints + " hit points.");
  }
}
