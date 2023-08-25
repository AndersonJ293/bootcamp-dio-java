package edu.anatomia_classes;

public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Anderson";
    String ultimoNome = "Junior";

    System.out.println(nomeCompleto(primeiroNome, ultimoNome));
  }

  public static String nomeCompleto(String primeiroNome, String ultimoNome) {
    return primeiroNome.concat(" ").concat(ultimoNome);
  }
}
