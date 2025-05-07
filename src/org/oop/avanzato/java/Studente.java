package org.oop.avanzato.java;

public class Studente {
  public String nome;
  public String cognome;
  public int eta;

  //costruttore
  public Studente(String nome, String cognome, int eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
  }

  //metodi
  public void nomeCompleto() {
    System.out.println("Mi chiamo " + this.nome + " " + this.cognome + " e ho " + this.eta + " anni");
  }
}
