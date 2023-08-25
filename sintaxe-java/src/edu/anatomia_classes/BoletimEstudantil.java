package edu.anatomia_classes;

public class BoletimEstudantil {
  public static void main(String[] args) {
    double mediafinal = 8.0;

    System.out.println(retornaAprovacao(mediafinal));

  }

  public static String retornaAprovacao(double mediafinal) {
    if (mediafinal < 6)
      return "Reprovado";
    if (mediafinal == 6)
      return "Prova Minerva";
    return "Aprovado";
  }

}
